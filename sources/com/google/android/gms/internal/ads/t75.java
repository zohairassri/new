package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f35326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f35327b;

    /* synthetic */ t75(int i11, int i12, s75 s75Var) {
        this.f35326a = f75.a(i11);
        this.f35327b = f75.a(i12);
    }

    public final t75 a(r75 r75Var) {
        this.f35326a.add(r75Var);
        return this;
    }

    public final t75 b(r75 r75Var) {
        this.f35327b.add(r75Var);
        return this;
    }

    public final u75 c() {
        return new u75(this.f35326a, this.f35327b, null);
    }
}
