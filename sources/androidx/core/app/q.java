package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    static int a(boolean z11, int i11) {
        int i12;
        if (!z11) {
            i12 = AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i11;
            }
            i12 = 33554432;
        }
        return i12 | i11;
    }

    public static PendingIntent b(Context context, int i11, Intent intent, int i12, boolean z11) {
        return PendingIntent.getActivity(context, i11, intent, a(z11, i12));
    }
}
