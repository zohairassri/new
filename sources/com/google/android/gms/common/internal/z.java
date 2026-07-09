package com.google.android.gms.common.internal;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class z extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f22807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ sm.i f22808b;

    z(Intent intent, sm.i iVar, int i11) {
        this.f22807a = intent;
        this.f22808b = iVar;
    }

    @Override // com.google.android.gms.common.internal.a0
    public final void a() {
        Intent intent = this.f22807a;
        if (intent != null) {
            this.f22808b.startActivityForResult(intent, 2);
        }
    }
}
