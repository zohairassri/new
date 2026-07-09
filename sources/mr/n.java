package mr;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f116934a;

    public static void a(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f116934a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f116934a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
            gr.a.e().a("No perf logcat meta data found " + e11.getMessage());
            return false;
        }
    }

    public static int c(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j11 < -2147483648L ? IntCompanionObject.MIN_VALUE : (int) j11;
    }

    public static String d(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        return httpUrl != null ? httpUrl.newBuilder().username("").password("").query(null).fragment(null).toString() : str;
    }

    public static String e(String str, int i11) {
        int iLastIndexOf;
        if (str.length() <= i11) {
            return str;
        }
        if (str.charAt(i11) == '/') {
            return str.substring(0, i11);
        }
        HttpUrl httpUrl = HttpUrl.parse(str);
        return httpUrl == null ? str.substring(0, i11) : (httpUrl.encodedPath().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i11 + (-1))) < 0) ? str.substring(0, i11) : str.substring(0, iLastIndexOf);
    }
}
