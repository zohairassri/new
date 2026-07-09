package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class s implements ou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Class f41743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Class f41744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ nu f41745c;

    s(Class cls, Class cls2, nu nuVar) {
        this.f41743a = cls;
        this.f41744b = cls2;
        this.f41745c = nuVar;
    }

    public final String toString() {
        return "Factory[type=" + this.f41744b.getName() + "+" + this.f41743a.getName() + ",adapter=" + this.f41745c + "]";
    }
}
