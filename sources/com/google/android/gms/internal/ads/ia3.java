package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ia3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f28269a;

    public static void a(Context context) {
        if (context != null) {
            f28269a = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static u83 b() {
        UiModeManager uiModeManager = f28269a;
        if (uiModeManager == null) {
            return u83.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? u83.OTHER : u83.CTV : u83.MOBILE;
    }
}
