package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class np implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ op f31527a;

    np(op opVar) {
        Objects.requireNonNull(opVar);
        this.f31527a = opVar;
    }

    public final void onOpActiveChanged(String str, int i11, String str2, boolean z11) {
        if (z11) {
            op opVar = this.f31527a;
            opVar.e(System.currentTimeMillis());
            opVar.h(true);
            return;
        }
        op opVar2 = this.f31527a;
        long jF = opVar2.f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jF > 0 && jCurrentTimeMillis >= opVar2.f()) {
            opVar2.g(jCurrentTimeMillis - opVar2.f());
        }
        opVar2.h(false);
    }
}
