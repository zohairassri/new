package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class lc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au f30181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pl5 f30183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f30184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final au f30185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pl5 f30187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f30188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f30189j;

    public lc5(long j11, au auVar, int i11, pl5 pl5Var, long j12, au auVar2, int i12, pl5 pl5Var2, long j13, long j14) {
        this.f30180a = j11;
        this.f30181b = auVar;
        this.f30182c = i11;
        this.f30183d = pl5Var;
        this.f30184e = j12;
        this.f30185f = auVar2;
        this.f30186g = i12;
        this.f30187h = pl5Var2;
        this.f30188i = j13;
        this.f30189j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lc5.class == obj.getClass()) {
            lc5 lc5Var = (lc5) obj;
            if (this.f30180a == lc5Var.f30180a && this.f30182c == lc5Var.f30182c && this.f30184e == lc5Var.f30184e && this.f30186g == lc5Var.f30186g && this.f30188i == lc5Var.f30188i && this.f30189j == lc5Var.f30189j && Objects.equals(this.f30181b, lc5Var.f30181b) && Objects.equals(this.f30183d, lc5Var.f30183d) && Objects.equals(this.f30185f, lc5Var.f30185f) && Objects.equals(this.f30187h, lc5Var.f30187h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f30180a), this.f30181b, Integer.valueOf(this.f30182c), this.f30183d, Long.valueOf(this.f30184e), this.f30185f, Integer.valueOf(this.f30186g), this.f30187h, Long.valueOf(this.f30188i), Long.valueOf(this.f30189j));
    }
}
