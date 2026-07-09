package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ma3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f30659a = 2;

    public static void a(Context context) {
        context.registerReceiver(new la3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (ia3.b() != u83.CTV) {
            return 2;
        }
        return f30659a;
    }
}
