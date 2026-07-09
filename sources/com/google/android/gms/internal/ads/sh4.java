package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class sh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f34831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f34832b;

    /* synthetic */ sh4(Class cls, Class cls2, byte[] bArr) {
        this.f34831a = cls;
        this.f34832b = cls2;
    }

    public static sh4 d(rh4 rh4Var, Class cls, Class cls2) {
        return new qh4(cls, cls2, rh4Var);
    }

    public abstract mi4 a(n84 n84Var);

    public final Class b() {
        return this.f34831a;
    }

    public final Class c() {
        return this.f34832b;
    }
}
