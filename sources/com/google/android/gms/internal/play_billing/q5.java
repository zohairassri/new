package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class q5 extends s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42532d;

    /* synthetic */ q5(byte[] bArr, int i11, int i12, boolean z11, r5 r5Var) {
        super(null);
        this.f42532d = Integer.MAX_VALUE;
        this.f42530b = 0;
    }

    public final int c(int i11) {
        int i12 = this.f42532d;
        this.f42532d = 0;
        int i13 = this.f42530b + this.f42531c;
        this.f42530b = i13;
        if (i13 <= 0) {
            this.f42531c = 0;
            return i12;
        }
        this.f42531c = i13;
        this.f42530b = 0;
        return i12;
    }
}
