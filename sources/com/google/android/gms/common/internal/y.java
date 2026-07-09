package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class y extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f22803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f22804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f22805c;

    y(Intent intent, Activity activity, int i11) {
        this.f22803a = intent;
        this.f22804b = activity;
        this.f22805c = i11;
    }

    @Override // com.google.android.gms.common.internal.a0
    public final void a() {
        Intent intent = this.f22803a;
        if (intent != null) {
            this.f22804b.startActivityForResult(intent, this.f22805c);
        }
    }
}
