package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a0 implements DialogInterface.OnClickListener {
    public static a0 b(Activity activity, Intent intent, int i11) {
        return new y(intent, activity, i11);
    }

    public static a0 c(sm.i iVar, Intent intent, int i11) {
        return new z(intent, iVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e11) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e11);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
