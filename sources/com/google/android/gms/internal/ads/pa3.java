package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p93 f32802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f32803b;

    public pa3(p93 p93Var, String str) {
        ArrayList arrayList = new ArrayList();
        this.f32803b = arrayList;
        this.f32802a = p93Var;
        arrayList.add(str);
    }

    public final void a(String str) {
        this.f32803b.add(str);
    }

    public final p93 b() {
        return this.f32802a;
    }

    public final ArrayList c() {
        return this.f32803b;
    }
}
