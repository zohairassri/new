package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class of5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final of5 f31930d = new nf5().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31933c;

    /* synthetic */ of5(nf5 nf5Var, byte[] bArr) {
        this.f31931a = nf5Var.e();
        this.f31932b = nf5Var.f();
        this.f31933c = nf5Var.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && of5.class == obj.getClass()) {
            of5 of5Var = (of5) obj;
            if (this.f31931a == of5Var.f31931a && this.f31932b == of5Var.f31932b && this.f31933c == of5Var.f31933c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z11 = this.f31931a;
        boolean z12 = this.f31932b;
        return ((z11 ? 1 : 0) << 2) + (z12 ? 1 : 0) + (z12 ? 1 : 0) + (this.f31933c ? 1 : 0);
    }
}
