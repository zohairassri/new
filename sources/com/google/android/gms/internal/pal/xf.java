package com.google.android.gms.internal.pal;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f42210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qf f42211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f42212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bm f42213d;

    /* synthetic */ xf(ConcurrentMap concurrentMap, qf qfVar, bm bmVar, Class cls, wf wfVar) {
        this.f42210a = concurrentMap;
        this.f42211b = qfVar;
        this.f42212c = cls;
        this.f42213d = bmVar;
    }

    public final qf a() {
        return this.f42211b;
    }

    public final bm b() {
        return this.f42213d;
    }

    public final Class c() {
        return this.f42212c;
    }

    public final Collection d() {
        return this.f42210a.values();
    }

    public final boolean e() {
        return !this.f42213d.a().isEmpty();
    }
}
