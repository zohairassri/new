package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class p93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cb3 f32786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v83 f32788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32789d = "Ad overlay";

    public p93(View view, v83 v83Var, String str) {
        this.f32786a = new cb3(view);
        this.f32787b = view.getClass().getCanonicalName();
        this.f32788c = v83Var;
    }

    public final cb3 a() {
        return this.f32786a;
    }

    public final String b() {
        return this.f32787b;
    }

    public final v83 c() {
        return this.f32788c;
    }

    public final String d() {
        return this.f32789d;
    }
}
