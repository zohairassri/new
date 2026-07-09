package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hb0 f24822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f24823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i01 f24824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q60 f24825e = new a01(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q60 f24826f = new c01(this);

    public d01(String str, hb0 hb0Var, Executor executor) {
        this.f24821a = str;
        this.f24822b = hb0Var;
        this.f24823c = executor;
    }

    public final void a(i01 i01Var) {
        hb0 hb0Var = this.f24822b;
        hb0Var.b("/updateActiveView", this.f24825e);
        hb0Var.b("/untrackActiveViewUnit", this.f24826f);
        this.f24824d = i01Var;
    }

    public final void b(vq0 vq0Var) {
        vq0Var.q0("/updateActiveView", this.f24825e);
        vq0Var.q0("/untrackActiveViewUnit", this.f24826f);
    }

    public final void c(vq0 vq0Var) {
        vq0Var.a1("/updateActiveView", this.f24825e);
        vq0Var.a1("/untrackActiveViewUnit", this.f24826f);
    }

    public final void d() {
        hb0 hb0Var = this.f24822b;
        hb0Var.c("/updateActiveView", this.f24825e);
        hb0Var.c("/untrackActiveViewUnit", this.f24826f);
    }

    final /* synthetic */ boolean e(Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f24821a);
    }

    final /* synthetic */ Executor f() {
        return this.f24823c;
    }

    final /* synthetic */ i01 g() {
        return this.f24824d;
    }
}
