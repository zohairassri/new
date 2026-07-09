package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class r1 extends t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f40019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40022e;

    /* synthetic */ r1(byte[] bArr, int i11, int i12, boolean z11, q1 q1Var) {
        super(null);
        this.f40022e = Integer.MAX_VALUE;
        this.f40019b = bArr;
        this.f40020c = 0;
    }

    public final int a(int i11) {
        int i12 = this.f40022e;
        this.f40022e = 0;
        int i13 = this.f40020c + this.f40021d;
        this.f40020c = i13;
        if (i13 <= 0) {
            this.f40021d = 0;
            return i12;
        }
        this.f40021d = i13;
        this.f40020c = 0;
        return i12;
    }
}
