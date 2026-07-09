package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class v93 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ w93 f36670a;

    v93(w93 w93Var) {
        Objects.requireNonNull(w93Var);
        this.f36670a = w93Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            w93 w93Var = this.f36670a;
            w93Var.d(true, w93Var.f());
            w93Var.e(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            w93 w93Var2 = this.f36670a;
            w93Var2.d(false, w93Var2.f());
            w93Var2.e(false);
        }
    }
}
