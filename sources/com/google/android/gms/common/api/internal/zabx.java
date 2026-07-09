package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import sm.l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zabx extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f22607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f22608b;

    public zabx(l0 l0Var) {
        this.f22608b = l0Var;
    }

    public final void a(Context context) {
        this.f22607a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f22607a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f22607a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f22608b.a();
            b();
        }
    }
}
