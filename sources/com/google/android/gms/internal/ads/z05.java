package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class z05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f38951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f38952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f38954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f38955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f38959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final zz4 f38960j;

    public z05() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f38959i = cryptoInfo;
        this.f38960j = new zz4(cryptoInfo, null);
    }

    public final void a(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        this.f38956f = i11;
        this.f38954d = iArr;
        this.f38955e = iArr2;
        this.f38952b = bArr;
        this.f38951a = bArr2;
        this.f38953c = i12;
        this.f38957g = i13;
        this.f38958h = i14;
        MediaCodec.CryptoInfo cryptoInfo = this.f38959i;
        cryptoInfo.numSubSamples = i11;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i12;
        zz4 zz4Var = this.f38960j;
        zz4Var.getClass();
        zz4Var.a(i13, i14);
    }

    public final MediaCodec.CryptoInfo b() {
        return this.f38959i;
    }

    public final void c(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f38954d == null) {
            int[] iArr = new int[1];
            this.f38954d = iArr;
            this.f38959i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f38954d;
        iArr2[0] = iArr2[0] + i11;
    }
}
