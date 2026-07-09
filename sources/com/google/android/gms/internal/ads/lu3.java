package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClipData f30450a = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i11, Intent intent, int i12) {
        return PendingIntent.getActivity(context, 0, c(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent b(Context context, int i11, Intent intent, int i12, int i13) {
        return PendingIntent.getService(context, 0, c(intent, 1140850688, 0), 1140850688);
    }

    private static Intent c(Intent intent, int i11, int i12) {
        jx3.b((i11 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        jx3.b((i11 & 1) == 0 || d(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        jx3.b((i11 & 2) == 0 || d(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        jx3.b((i11 & 4) == 0 || d(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        jx3.b((i11 & 128) == 0 || d(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        jx3.b(intent.getComponent() != null, "Must set component on Intent.");
        if (d(0, 1)) {
            jx3.b(!d(i11, AudioRoutingController.DEVICE_OUT_USB_HEADSET), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            jx3.b(d(i11, AudioRoutingController.DEVICE_OUT_USB_HEADSET), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!d(i11, AudioRoutingController.DEVICE_OUT_USB_HEADSET)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!d(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!d(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!d(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!d(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f30450a);
            }
        }
        return intent2;
    }

    private static boolean d(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
