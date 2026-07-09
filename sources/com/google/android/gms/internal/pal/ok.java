package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f41633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f41634b;

    /* synthetic */ ok(Class cls, Class cls2, nk nkVar) {
        this.f41633a = cls;
        this.f41634b = cls2;
    }

    public static ok c(jl jlVar, Class cls, Class cls2) {
        return new mk(cls, cls2, jlVar, null);
    }

    public final Class a() {
        return this.f41633a;
    }

    public final Class b() {
        return this.f41634b;
    }
}
