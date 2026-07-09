package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class NamespaceRemovingInputStream extends SdkFilterInputStream {
    private static final int BUFFER_SIZE = 200;
    private boolean hasRemovedNamespace;
    private final byte[] lookAheadData;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class StringPrefixSlicer {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f18447s;

        public StringPrefixSlicer(String str) {
            this.f18447s = str;
        }

        public String getString() {
            return this.f18447s;
        }

        public boolean removePrefix(String str) {
            if (!this.f18447s.startsWith(str)) {
                return false;
            }
            this.f18447s = this.f18447s.substring(str.length());
            return true;
        }

        public boolean removePrefixEndingWith(String str) {
            int iIndexOf = this.f18447s.indexOf(str);
            if (iIndexOf < 0) {
                return false;
            }
            this.f18447s = this.f18447s.substring(iIndexOf + str.length());
            return true;
        }

        public boolean removeRepeatingPrefix(String str) {
            if (!this.f18447s.startsWith(str)) {
                return false;
            }
            while (this.f18447s.startsWith(str)) {
                this.f18447s = this.f18447s.substring(str.length());
            }
            return true;
        }
    }

    public NamespaceRemovingInputStream(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
        this.lookAheadData = new byte[200];
        this.hasRemovedNamespace = false;
    }

    private int matchXmlNamespaceAttribute(String str) {
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (!stringPrefixSlicer.removePrefix("xmlns")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (!stringPrefixSlicer.removePrefix("=")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (stringPrefixSlicer.removePrefix("\"") && stringPrefixSlicer.removePrefixEndingWith("\"")) {
            return str.length() - stringPrefixSlicer.getString().length();
        }
        return -1;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != 120 || this.hasRemovedNamespace) {
            return i11;
        }
        this.lookAheadData[0] = (byte) i11;
        ((FilterInputStream) this).in.mark(this.lookAheadData.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.lookAheadData;
        int i12 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        int iMatchXmlNamespaceAttribute = matchXmlNamespaceAttribute(new String(this.lookAheadData, 0, i12 + 1, StringUtils.UTF8));
        if (iMatchXmlNamespaceAttribute <= 0) {
            return i11;
        }
        for (int i13 = 0; i13 < iMatchXmlNamespaceAttribute - 1; i13++) {
            ((FilterInputStream) this).in.read();
        }
        int i14 = ((FilterInputStream) this).in.read();
        this.hasRemovedNamespace = true;
        return i14;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = read();
            if (i14 == -1) {
                if (i13 == 0) {
                    return -1;
                }
                return i13;
            }
            bArr[i13 + i11] = (byte) i14;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
