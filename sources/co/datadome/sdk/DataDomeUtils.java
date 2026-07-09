package co.datadome.sdk;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Keep
public class DataDomeUtils {
    DataDomeUtils() {
        throw new IllegalStateException("Utility class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ValueCallback valueCallback, Boolean bool) {
        valueCallback.onReceiveValue(Boolean.TRUE);
    }

    @NonNull
    private static String cleanCookie(@NonNull String str) {
        String[] strArrSplit = str.split("; ");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!str2.startsWith(j.DATADOME_COOKIE_PREFIX)) {
                sb2.append("; ");
                sb2.append(str2);
            }
        }
        return sb2.toString();
    }

    static String extractDatadomeCookie(String str) {
        Matcher matcher = Pattern.compile("datadome=([^;]*)").matcher(str);
        String str2 = "";
        while (matcher.find()) {
            str2 = "datadome=" + matcher.group(1);
        }
        return str2;
    }

    @NonNull
    static String getCookieValueName(String str) {
        return str.split(";")[0];
    }

    static String isHeaderPresent(Map<String, String> map, String str) {
        for (String str2 : map.keySet()) {
            if (str2.equalsIgnoreCase(str)) {
                return map.get(str2);
            }
        }
        return null;
    }

    @NonNull
    public static Boolean isNullOrEmpty(String str) {
        return str == null ? Boolean.TRUE : Boolean.valueOf(str.isEmpty());
    }

    @NonNull
    public static Boolean isValidCookie(String str) {
        return str == null ? Boolean.FALSE : !str.startsWith(j.DATADOME_COOKIE_PREFIX) ? Boolean.FALSE : Boolean.valueOf(!isNullOrEmpty(parseCookieValue(str)).booleanValue());
    }

    public static Boolean isValidParameter(String str) {
        return Boolean.valueOf((str == null || str.trim().isEmpty()) ? false : true);
    }

    @NonNull
    public static String mergeCookie(@NonNull String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + cleanCookie(str2);
    }

    @NonNull
    static String parseCookieValue(String str) {
        String[] strArrSplit = str.split("=");
        return strArrSplit.length > 1 ? strArrSplit[1].contains(";") ? strArrSplit[1].split(";")[0] : strArrSplit[1] : "";
    }

    static void removeCookiesSequentially(final ValueCallback<Boolean> valueCallback) {
        CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: co.datadome.sdk.a
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                DataDomeUtils.a(valueCallback, (Boolean) obj);
            }
        });
    }

    private static void setCookieRecursively(final String str, final List<String> list, final int i11, final ValueCallback<Boolean> valueCallback) {
        if (i11 >= list.size()) {
            valueCallback.onReceiveValue(Boolean.TRUE);
            return;
        }
        String str2 = list.get(i11);
        if (TextUtils.isEmpty(str2)) {
            setCookieRecursively(str, list, i11 + 1, valueCallback);
        } else {
            CookieManager.getInstance().setCookie(str, str2, new ValueCallback() { // from class: co.datadome.sdk.c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    DataDomeUtils.a(str, list, i11, valueCallback, (Boolean) obj);
                }
            });
        }
    }

    static void setCookiesSequentially(String str, List<String> list, ValueCallback<Boolean> valueCallback) {
        if (list == null || list.isEmpty()) {
            valueCallback.onReceiveValue(Boolean.FALSE);
        } else {
            setCookieRecursively(str, list, 0, valueCallback);
        }
    }

    @NonNull
    static String stringOrEmpty(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, List list, int i11, ValueCallback valueCallback, Boolean bool) {
        setCookieRecursively(str, list, i11 + 1, valueCallback);
    }
}
