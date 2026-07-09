package es;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.iterable.iterableapi.n0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static boolean a(PackageManager packageManager) {
        return Build.MODEL.matches("AFTN") || packageManager.hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static void b(JSONObject jSONObject, Context context, String str) throws JSONException {
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put("systemName", Build.DEVICE);
        jSONObject.put("systemVersion", Build.VERSION.RELEASE);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("sdkVersion", Build.VERSION.SDK_INT);
        jSONObject.put("deviceId", str);
        jSONObject.put("appPackageName", context.getPackageName());
        jSONObject.put("appVersion", n0.b(context));
        jSONObject.put("appBuild", n0.c(context));
        jSONObject.put("iterableSdkVersion", "3.4.17");
    }
}
