package ya;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f140187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Display f140188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f140189c;

    public k(Context context) {
        this.f140189c = context;
        Object systemService = context.getApplicationContext().getSystemService("window");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        this.f140187a = windowManager;
        this.f140188b = windowManager.getDefaultDisplay();
    }

    private final Float b() {
        try {
            return Float.valueOf(g.a(Settings.System.getInt(this.f140189c.getContentResolver(), "screen_brightness") / 255.0f));
        } catch (Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    private final Map c() {
        String str;
        Display.Mode mode;
        Display.Mode mode2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Resources resources = this.f140189c.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        linkedHashMap.put("d_s_is_w", Integer.valueOf(displayMetrics.widthPixels));
        linkedHashMap.put("d_s_is_h", Integer.valueOf(displayMetrics.heightPixels));
        linkedHashMap.put("screen_d", Float.valueOf(displayMetrics.density));
        linkedHashMap.put("d_s_dpi", Integer.valueOf(displayMetrics.densityDpi));
        Display display = this.f140188b;
        Integer numValueOf = null;
        linkedHashMap.put("d_s_mrr", display != null ? Integer.valueOf((int) display.getRefreshRate()) : null);
        Display display2 = this.f140188b;
        linkedHashMap.put("d_s_cutout", Boolean.valueOf((display2 != null ? display2.getCutout() : null) != null));
        Display display3 = this.f140188b;
        Integer numValueOf2 = display3 != null ? Integer.valueOf(display3.getRotation()) : null;
        if (numValueOf2 != null && numValueOf2.intValue() == 0) {
            str = "portrait";
        } else if (numValueOf2 != null && numValueOf2.intValue() == 1) {
            str = "landscape_left";
        } else if (numValueOf2 != null && numValueOf2.intValue() == 2) {
            str = "portrait_upside_down";
        } else if (numValueOf2 != null && numValueOf2.intValue() == 3) {
            str = "landscape_right";
        } else {
            str = "n:" + numValueOf2;
        }
        linkedHashMap.put("d_or", str);
        Display display4 = this.f140188b;
        linkedHashMap.put("d_s_n", display4 != null ? display4.getName() : null);
        Display display5 = this.f140188b;
        linkedHashMap.put("d_s_hdr", display5 != null ? Boolean.valueOf(display5.isHdr()) : null);
        Display display6 = this.f140188b;
        linkedHashMap.put("screen_x", (display6 == null || (mode2 = display6.getMode()) == null) ? null : Integer.valueOf(mode2.getPhysicalWidth()));
        Display display7 = this.f140188b;
        if (display7 != null && (mode = display7.getMode()) != null) {
            numValueOf = Integer.valueOf(mode.getPhysicalHeight());
        }
        linkedHashMap.put("screen_y", numValueOf);
        linkedHashMap.put("d_s_br", b());
        return linkedHashMap;
    }

    @Override // ya.l
    public Map a() {
        Map mapC = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapC.entrySet()) {
            Object value = entry.getValue();
            if (value != null && !TextUtils.isEmpty(value.toString())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
