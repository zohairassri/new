package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eu f41542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f41543b;

    /* synthetic */ lk(eu euVar, Class cls, kk kkVar) {
        this.f41542a = euVar;
        this.f41543b = cls;
    }

    public static lk c(kl klVar, eu euVar, Class cls) {
        return new jk(euVar, cls, klVar, null);
    }

    public final eu a() {
        return this.f41542a;
    }

    public final Class b() {
        return this.f41543b;
    }
}
