package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f39211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f39212b;

    /* synthetic */ zh4(Class cls, Class cls2, byte[] bArr) {
        this.f39211a = cls;
        this.f39212b = cls2;
    }

    public static zh4 d(yh4 yh4Var, Class cls, Class cls2) {
        return new xh4(cls, cls2, yh4Var);
    }

    public abstract Object a(w74 w74Var);

    public final Class b() {
        return this.f39211a;
    }

    public final Class c() {
        return this.f39212b;
    }
}
