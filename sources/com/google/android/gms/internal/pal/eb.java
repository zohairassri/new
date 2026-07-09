package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f41270a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f41271b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicBoolean f41272c = new AtomicBoolean();

    static cb a() {
        return (cb) f41270a.get();
    }

    static db b() {
        android.support.v4.media.a.a(f41271b.get());
        return null;
    }

    public static void c(cb cbVar) {
        f41270a.set(cbVar);
    }
}
