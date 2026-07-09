package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface d7 {
    String a(Context context, byte[] bArr);

    String b(Context context, View view, Activity activity);

    String c(Context context);

    String d(Context context, String str, View view, Activity activity);

    void e(View view);

    void f(MotionEvent motionEvent);
}
