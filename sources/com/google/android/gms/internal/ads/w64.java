package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class w64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f37180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37182f;

    public w64() {
        this.f37177a = -1;
        this.f37178b = -1;
        this.f37179c = -1;
        this.f37181e = -1;
        this.f37182f = -1;
    }

    public final w64 a(int i11) {
        this.f37177a = i11;
        return this;
    }

    public final w64 b(int i11) {
        this.f37178b = i11;
        return this;
    }

    public final w64 c(int i11) {
        this.f37179c = i11;
        return this;
    }

    public final w64 d(byte[] bArr) {
        this.f37180d = bArr;
        return this;
    }

    public final w64 e(int i11) {
        this.f37181e = i11;
        return this;
    }

    public final w64 f(int i11) {
        this.f37182f = i11;
        return this;
    }

    public final jx4 g() {
        return new jx4(this.f37177a, this.f37178b, this.f37179c, this.f37180d, this.f37181e, this.f37182f, null);
    }

    /* synthetic */ w64(jx4 jx4Var, byte[] bArr) {
        this.f37177a = jx4Var.f29269a;
        this.f37178b = jx4Var.f29270b;
        this.f37179c = jx4Var.f29271c;
        this.f37180d = jx4Var.f29272d;
        this.f37181e = jx4Var.f29273e;
        this.f37182f = jx4Var.f29274f;
    }
}
