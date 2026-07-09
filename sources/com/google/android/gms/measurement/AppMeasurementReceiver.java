package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import on.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements m.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f42754c;

    @Override // on.m.a
    public final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f42754c == null) {
            this.f42754c = new m(this);
        }
        this.f42754c.a(context, intent);
    }
}
