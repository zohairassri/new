package com.amazonaws.services.s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class XmlWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    List<String> tags = new ArrayList();

    /* JADX INFO: renamed from: sb, reason: collision with root package name */
    StringBuilder f18425sb = new StringBuilder();

    private void appendEscapedString(String str, StringBuilder sb2) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            String str2 = cCharAt != '\t' ? cCharAt != '\n' ? cCharAt != '\r' ? cCharAt != '\"' ? cCharAt != '&' ? cCharAt != '<' ? cCharAt != '>' ? null : "&gt;" : "&lt;" : "&amp;" : "&quot;" : "&#13;" : "&#10;" : "&#9;";
            if (str2 != null) {
                if (i12 < i11) {
                    sb2.append((CharSequence) str, i12, i11);
                }
                this.f18425sb.append(str2);
                i12 = i11 + 1;
            }
            i11++;
        }
        if (i12 < i11) {
            this.f18425sb.append((CharSequence) str, i12, i11);
        }
    }

    private void writeAttr(String str, String str2) {
        StringBuilder sb2 = this.f18425sb;
        sb2.append(' ');
        sb2.append(str);
        sb2.append("=\"");
        appendEscapedString(str2, this.f18425sb);
        this.f18425sb.append("\"");
    }

    public XmlWriter end() {
        String strRemove = this.tags.remove(r0.size() - 1);
        StringBuilder sb2 = this.f18425sb;
        sb2.append("</");
        sb2.append(strRemove);
        sb2.append(">");
        return this;
    }

    public byte[] getBytes() {
        return toString().getBytes(StringUtils.UTF8);
    }

    public XmlWriter start(String str) {
        StringBuilder sb2 = this.f18425sb;
        sb2.append("<");
        sb2.append(str);
        sb2.append(">");
        this.tags.add(str);
        return this;
    }

    public String toString() {
        return this.f18425sb.toString();
    }

    public XmlWriter value(String str) {
        appendEscapedString(str, this.f18425sb);
        return this;
    }

    public XmlWriter start(String str, String str2, String str3) {
        StringBuilder sb2 = this.f18425sb;
        sb2.append("<");
        sb2.append(str);
        writeAttr(str2, str3);
        this.f18425sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String[] strArr, String[] strArr2) {
        StringBuilder sb2 = this.f18425sb;
        sb2.append("<");
        sb2.append(str);
        for (int i11 = 0; i11 < Math.min(strArr.length, strArr2.length); i11++) {
            writeAttr(strArr[i11], strArr2[i11]);
        }
        this.f18425sb.append(">");
        this.tags.add(str);
        return this;
    }
}
