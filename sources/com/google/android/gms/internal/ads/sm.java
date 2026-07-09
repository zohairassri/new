package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class sm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f34907a = new byte[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34909c;

    public sm(byte[] bArr) {
        for (int i11 = 0; i11 < 256; i11++) {
            this.f34907a[i11] = (byte) i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            byte[] bArr2 = this.f34907a;
            byte b11 = bArr2[i13];
            i12 = (i12 + b11 + bArr[i13 % bArr.length]) & 255;
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b11;
        }
        this.f34908b = 0;
        this.f34909c = 0;
    }

    public final void a(byte[] bArr) {
        int i11 = this.f34908b;
        int i12 = this.f34909c;
        for (int i13 = 0; i13 < 256; i13++) {
            byte[] bArr2 = this.f34907a;
            i11 = (i11 + 1) & 255;
            byte b11 = bArr2[i11];
            i12 = (i12 + b11) & 255;
            bArr2[i11] = bArr2[i12];
            bArr2[i12] = b11;
            bArr[i13] = (byte) (bArr2[(bArr2[i11] + b11) & 255] ^ bArr[i13]);
        }
        this.f34908b = i11;
        this.f34909c = i12;
    }
}
