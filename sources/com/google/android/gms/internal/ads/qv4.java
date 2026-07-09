package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qv4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33819a;

    private qv4(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f33819a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i12);
    }

    public static qv4 a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static qv4 b(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i12 > length) {
            i12 = length;
        }
        return new qv4(bArr, 0, i12);
    }

    public final byte[] c() {
        byte[] bArr = this.f33819a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int d() {
        return this.f33819a.length;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qv4) {
            return Arrays.equals(((qv4) obj).f33819a, this.f33819a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33819a);
    }

    public final String toString() {
        byte[] bArr = this.f33819a;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b11 : bArr) {
            sb2.append("0123456789abcdef".charAt((b11 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b11 & 15));
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder(string.length() + 7);
        sb3.append("Bytes(");
        sb3.append(string);
        sb3.append(")");
        return sb3.toString();
    }
}
