package com.google.android.gms.internal.ads;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gc5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gc5 f26936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gc5 f26937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gc5 f26938e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26940b;

    static {
        gc5 gc5Var = new gc5(0L, 0L);
        f26936c = gc5Var;
        new gc5(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        f26937d = new gc5(LongCompanionObject.MAX_VALUE, 0L);
        new gc5(0L, LongCompanionObject.MAX_VALUE);
        f26938e = gc5Var;
    }

    public gc5(long j11, long j12) {
        jx3.a(j11 >= 0);
        jx3.a(j12 >= 0);
        this.f26939a = j11;
        this.f26940b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gc5.class == obj.getClass()) {
            gc5 gc5Var = (gc5) obj;
            if (this.f26939a == gc5Var.f26939a && this.f26940b == gc5Var.f26940b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f26939a) * 31) + ((int) this.f26940b);
    }
}
