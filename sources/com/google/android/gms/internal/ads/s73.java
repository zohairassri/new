package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class s73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f34570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f34571d = ((Long) yl.e.c().d(oz.W)).longValue() * 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f34572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f34573f;

    public s73(Object obj, com.google.android.gms.common.util.f fVar, double d11, int i11) {
        this.f34568a = obj;
        this.f34570c = fVar;
        this.f34569b = fVar.a();
        this.f34572e = d11;
        this.f34573f = i11;
    }

    public final Object a() {
        return this.f34568a;
    }

    public final boolean b() {
        return this.f34570c.a() >= this.f34569b + this.f34571d;
    }

    public final long c() {
        return (this.f34571d + Math.min(Math.max(((Long) yl.e.c().d(oz.F)).longValue(), -900000L), 10000L)) - (this.f34570c.a() - this.f34569b);
    }

    public final long d() {
        return this.f34569b;
    }

    public final double e() {
        return this.f34572e;
    }

    public final int f() {
        return this.f34573f;
    }
}
