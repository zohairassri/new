package com.google.android.gms.internal.pal;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n8 implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ o8 f41596a;

    n8(o8 o8Var) {
        this.f41596a = o8Var;
    }

    public final void onOpActiveChanged(String str, int i11, String str2, boolean z11) {
        if (z11) {
            this.f41596a.f41620a = System.currentTimeMillis();
            this.f41596a.f41623d = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            o8 o8Var = this.f41596a;
            if (o8Var.f41621b > 0 && jCurrentTimeMillis >= o8Var.f41621b) {
                o8Var.f41622c = jCurrentTimeMillis - o8Var.f41621b;
            }
            this.f41596a.f41623d = false;
        }
    }
}
