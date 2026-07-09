package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40220b;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f40219a = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        f40220b = i11 >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, int i11, Intent intent, int i12) {
        return PendingIntent.getBroadcast(context, 0, intent, i12);
    }
}
