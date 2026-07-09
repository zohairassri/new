package co.datadome.sdk;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class m {
    public static final Map a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkExpressionValueIsNotNull(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Intrinsics.checkExpressionValueIsNotNull(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkExpressionValueIsNotNull(string, "jsonObject.getString(key)");
                linkedHashMap.put(key, string);
            }
            return linkedHashMap;
        } catch (JSONException e11) {
            Log.e("Datadome", "Error parsing JSON: " + str + " \n" + e11.getMessage());
            return linkedHashMap;
        }
    }
}
