package ya;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.android.id.IdHelperAndroid;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f140185a;

    public f(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.f140185a = (ConnectivityManager) systemService;
    }

    private final Map b() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NetworkCapabilities networkCapabilities = this.f140185a.getNetworkCapabilities(this.f140185a.getActiveNetwork());
        String str2 = IdHelperAndroid.NO_ID_AVAILABLE;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                str2 = QueryKeys.SCROLL_WINDOW_HEIGHT;
            } else if (networkCapabilities.hasTransport(0)) {
                str2 = QueryKeys.TIME_ON_VIEW_IN_MINUTES;
            } else if (networkCapabilities.hasTransport(3)) {
                str2 = QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING;
            }
            str = "d_n_type";
        } else {
            str = "d.n.type";
        }
        linkedHashMap.put(str, str2);
        return linkedHashMap;
    }

    @Override // ya.l
    public Map a() {
        Map mapB = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapB.entrySet()) {
            Object value = entry.getValue();
            if (value != null && !TextUtils.isEmpty(value.toString())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
