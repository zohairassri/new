package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class d14 extends ky3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f24839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kx3 f24840d;

    d14(Iterator it, kx3 kx3Var) {
        this.f24839c = it;
        this.f24840d = kx3Var;
    }

    @Override // com.google.android.gms.internal.ads.ky3
    protected final Object zza() {
        kx3 kx3Var;
        Object next;
        do {
            Iterator it = this.f24839c;
            if (!it.hasNext()) {
                a();
                return null;
            }
            kx3Var = this.f24840d;
            next = it.next();
        } while (!kx3Var.zza(next));
        return next;
    }
}
