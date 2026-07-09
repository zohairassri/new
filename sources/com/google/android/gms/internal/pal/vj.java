package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class vj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f41895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f41896b;

    /* synthetic */ vj(Class cls, Class cls2, uj ujVar) {
        this.f41895a = cls;
        this.f41896b = cls2;
    }

    public static vj c(ll llVar, Class cls, Class cls2) {
        return new tj(cls, cls2, llVar, null);
    }

    public final Class a() {
        return this.f41895a;
    }

    public final Class b() {
        return this.f41896b;
    }
}
