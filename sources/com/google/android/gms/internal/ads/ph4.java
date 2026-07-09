package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ph4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qv4 f32954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f32955b;

    /* synthetic */ ph4(qv4 qv4Var, Class cls, byte[] bArr) {
        this.f32954a = qv4Var;
        this.f32955b = cls;
    }

    public static ph4 d(oh4 oh4Var, qv4 qv4Var, Class cls) {
        return new nh4(qv4Var, cls, oh4Var);
    }

    public abstract n84 a(mi4 mi4Var);

    public final qv4 b() {
        return this.f32954a;
    }

    public final Class c() {
        return this.f32955b;
    }
}
