package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f33907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f33908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33909c;

    public r(Handler handler, t tVar) {
        this.f33907a = handler;
        this.f33908b = tVar;
    }

    public final void a() {
        this.f33909c = true;
    }

    final /* synthetic */ Handler b() {
        return this.f33907a;
    }

    final /* synthetic */ t c() {
        return this.f33908b;
    }

    final /* synthetic */ boolean d() {
        return this.f33909c;
    }
}
