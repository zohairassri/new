package ya;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PowerManager f140186a;

    public i(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("power");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.os.PowerManager");
        }
        this.f140186a = (PowerManager) systemService;
    }

    private final Map b() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = Build.VERSION.SDK_INT;
        int currentThermalStatus = this.f140186a.getCurrentThermalStatus();
        if (currentThermalStatus == 1) {
            str = "light";
        } else if (currentThermalStatus == 2) {
            str = "moderate";
        } else if (currentThermalStatus == 3) {
            str = "severe";
        } else if (currentThermalStatus == 4) {
            str = "critical";
        } else if (currentThermalStatus == 5) {
            str = "emergency";
        } else if (currentThermalStatus == 6) {
            str = "shutdown";
        } else {
            str = "n:" + currentThermalStatus;
        }
        linkedHashMap.put("d_p_thermal", str);
        linkedHashMap.put("d_p_idle", Boolean.valueOf(this.f140186a.isDeviceIdleMode()));
        if (i11 >= 33) {
            linkedHashMap.put("d_p_lidle", Boolean.valueOf(this.f140186a.isDeviceLightIdleMode()));
            linkedHashMap.put("d_p_low", Boolean.valueOf(this.f140186a.isLowPowerStandbyEnabled()));
        }
        linkedHashMap.put("d_p_save", Boolean.valueOf(this.f140186a.isPowerSaveMode()));
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
