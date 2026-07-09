package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile int f40713d = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f40714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40716c;

    public static long b(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    static s7 c(byte[] bArr, int i11, int i12, boolean z11) {
        r7 r7Var = new r7(bArr, i12);
        try {
            r7Var.a(i12);
            return r7Var;
        } catch (zzji e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static int e(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public abstract int a(int i11);

    public abstract int d();

    private s7() {
        this.f40714a = f40713d;
        this.f40715b = Integer.MAX_VALUE;
        this.f40716c = false;
    }
}
