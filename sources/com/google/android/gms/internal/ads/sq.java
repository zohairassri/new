package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class sq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ tq f35001a;

    sq(tq tqVar) {
        Objects.requireNonNull(tqVar);
        this.f35001a = tqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35001a.b();
    }
}
