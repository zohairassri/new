package ya;

import android.content.Context;
import android.os.BatteryManager;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BatteryManager f140177a;

    public b(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("batterymanager");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.os.BatteryManager");
        }
        this.f140177a = (BatteryManager) systemService;
    }

    private final Map b() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("d_b_ttfc", Long.valueOf(this.f140177a.computeChargeTimeRemaining()));
        int intProperty = this.f140177a.getIntProperty(6);
        if (intProperty == 2) {
            str = "charging";
        } else if (intProperty == 3) {
            str = "discharging";
        } else if (intProperty == 4) {
            str = "not_charging";
        } else if (intProperty != 5) {
            str = "n:" + intProperty;
        } else {
            str = "full";
        }
        linkedHashMap.put("d_b_state", str);
        linkedHashMap.put("d_b_c", Integer.valueOf(this.f140177a.getIntProperty(1)));
        linkedHashMap.put("d_b_lvl", Integer.valueOf(this.f140177a.getIntProperty(4)));
        linkedHashMap.put("d_b_e", Integer.valueOf(this.f140177a.getIntProperty(5)));
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
