package com.comscore.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CommonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19377a = "persist.sys.dalvik.vm.lib";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19378b = "libdvm.so";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f19379c = "libart.so";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f19380d = "libartd.so";

    private CommonUtils() {
    }

    private static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean b() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getApplicationName(Context context) {
        if (context == null) {
            return "unknown";
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
            return applicationLabel != null ? applicationLabel.toString() : "unknown";
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static String getApplicationResolution(Context context) {
        Point applicationSize = getApplicationSize(context);
        return applicationSize.x + "x" + applicationSize.y;
    }

    public static Point getApplicationSize(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return new Point(point.x, point.y);
        }
        WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i11 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i12 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = currentWindowMetrics.getBounds();
        return new Point(bounds.width() - i11, bounds.height() - i12);
    }

    public static String getApplicationVersion(Context context) {
        if (context == null) {
            return "unknown";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    public static int getConnectivityType(Context context) {
        if (context == null || !a.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue()) {
            return ConnectivityType.UNKNOWN;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return ConnectivityType.DISCONNECTED;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null ? networkCapabilities.hasTransport(0) ? ConnectivityType.WWAN : networkCapabilities.hasTransport(1) ? ConnectivityType.WIFI : networkCapabilities.hasTransport(3) ? ConnectivityType.ETHERNET : networkCapabilities.hasTransport(2) ? ConnectivityType.BLUETOOTH : ConnectivityType.CONNECTED : ConnectivityType.UNKNOWN;
    }

    public static String getDeviceArchitecture() {
        return System.getProperty("os.arch");
    }

    public static String getDeviceModel() {
        return Build.DEVICE;
    }

    public static String getDisplayResolution(Context context) {
        Point displaySize = getDisplaySize(context);
        return displaySize.x + "x" + displaySize.y;
    }

    public static Point getDisplaySize(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
            return new Point(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Point(point.x, point.y);
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getOsName() {
        return "android";
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getPackageName(Context context) {
        return context == null ? "unknown" : context.getPackageName();
    }

    public static String getRuntime() {
        String property = System.getProperty("java.vm.name");
        Locale locale = Locale.US;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, f19377a, "Dalvik");
            return f19378b.equals(str) ? "Dalvik".toLowerCase(locale) : f19379c.equals(str) ? "ART".toLowerCase(locale) : f19380d.equals(str) ? "ART_Debug".toLowerCase(locale) : str.toLowerCase(locale);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return property.toLowerCase(locale);
        }
    }

    public static boolean isDeviceRooted() {
        return a() || b();
    }
}
