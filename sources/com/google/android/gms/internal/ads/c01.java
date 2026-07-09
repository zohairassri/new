package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class c01 implements q60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d01 f24307a;

    c01(d01 d01Var) {
        Objects.requireNonNull(d01Var);
        this.f24307a = d01Var;
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void a(Object obj, Map map) {
        d01 d01Var = this.f24307a;
        if (d01Var.e(map)) {
            d01Var.f().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.b01
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f23626a.f24307a.g().d();
                }
            });
        }
    }
}
