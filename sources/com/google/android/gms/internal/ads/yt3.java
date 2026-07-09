package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class yt3 implements gt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f38709a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38710b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38711c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38712d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f38713e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f38714f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38715g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f38716h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f38717i = SystemClock.uptimeMillis();

    public yt3(jg3 jg3Var) {
    }

    private static boolean d(View view) {
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
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    private static DisplayMetrics e(Context context) {
        WindowManager windowManager;
        if ((Build.VERSION.SDK_INT >= 33 && !context.isUiContext()) || (windowManager = (WindowManager) context.getSystemService("window")) == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    private final void f(Map map) {
        map.put("tcq", Long.valueOf(this.f38709a));
        map.put("tpq", Long.valueOf(this.f38710b));
        map.put("tcc", Long.valueOf(this.f38715g));
        map.put("tpc", Long.valueOf(this.f38716h));
        map.put("tpv", Long.valueOf(this.f38712d));
        map.put("tcv", Long.valueOf(this.f38711c));
        map.put("tchv", Long.valueOf(this.f38713e));
        map.put("tphv", Long.valueOf(this.f38714f));
        map.put("tst", Long.valueOf(this.f38717i));
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final synchronized void a(Map map) {
        this.f38716h = this.f38715g;
        this.f38715g = SystemClock.uptimeMillis();
        f(map);
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final synchronized void b(Map map) {
        this.f38710b = this.f38709a;
        this.f38709a = SystemClock.uptimeMillis();
        f(map);
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final synchronized void c(Map map, Context context, View view) {
        try {
            this.f38712d = this.f38711c;
            this.f38711c = SystemClock.uptimeMillis();
            long j11 = this.f38713e;
            if (j11 != -1) {
                this.f38714f = j11;
            }
            DisplayMetrics displayMetricsE = e(context);
            if (displayMetricsE != null) {
                int i11 = displayMetricsE.widthPixels * displayMetricsE.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetricsE.widthPixels) * Math.min(view.getHeight(), displayMetricsE.heightPixels);
                    if (iMin + iMin >= i11 || (iMin == 0 && d(view))) {
                        this.f38713e = this.f38711c;
                    }
                }
                f(map);
            }
            this.f38713e = -1L;
            f(map);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
