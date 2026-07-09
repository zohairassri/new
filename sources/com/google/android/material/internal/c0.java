package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewOverlay f44842a;

    c0(View view) {
        this.f44842a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.d0
    public void a(Drawable drawable) {
        this.f44842a.add(drawable);
    }

    @Override // com.google.android.material.internal.d0
    public void b(Drawable drawable) {
        this.f44842a.remove(drawable);
    }
}
