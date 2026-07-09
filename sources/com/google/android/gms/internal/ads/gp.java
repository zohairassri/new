package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f27186a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f27187b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27188c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27189d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27190e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f27191f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f27192g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27193h = -1;

    private static boolean l(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    private static DisplayMetrics m(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    public final void a() {
        this.f27187b = this.f27186a;
        this.f27186a = SystemClock.uptimeMillis();
    }

    public final void b(Context context, View view) {
        this.f27189d = this.f27188c;
        this.f27188c = SystemClock.uptimeMillis();
        long j11 = this.f27190e;
        if (j11 != -1) {
            this.f27191f = j11;
        }
        DisplayMetrics displayMetricsM = m(context);
        int i11 = displayMetricsM.widthPixels * displayMetricsM.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsM.widthPixels) * Math.min(view.getHeight(), displayMetricsM.heightPixels);
            if (iMin + iMin >= i11 || (iMin == 0 && l(view))) {
                this.f27190e = this.f27188c;
                return;
            }
        }
        this.f27190e = -1L;
    }

    public final void c() {
        this.f27193h = this.f27192g;
        this.f27192g = SystemClock.uptimeMillis();
    }

    public final long d() {
        return this.f27187b;
    }

    public final long e() {
        return this.f27186a;
    }

    public final long f() {
        return this.f27188c;
    }

    public final long g() {
        return this.f27189d;
    }

    public final long h() {
        return this.f27191f;
    }

    public final long i() {
        return this.f27190e;
    }

    public final long j() {
        return this.f27192g;
    }

    public final long k() {
        return this.f27193h;
    }
}
