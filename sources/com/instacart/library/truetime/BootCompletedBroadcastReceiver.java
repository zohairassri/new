package com.instacart.library.truetime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class BootCompletedBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47591a = "BootCompletedBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.b(f47591a, "---- clearing TrueTime disk cache as we've detected a boot");
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            d.d();
        }
    }
}
