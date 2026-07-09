package hm;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f102483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f102484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f102485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f102486d = new Object();

    y0(Context context) {
        this.f102485c = context;
    }

    private final void k() {
        synchronized (this.f102486d) {
            try {
                if (this.f102483a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f102485c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f102483a = sharedPreferences;
                this.f102484b = sharedPreferences.edit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(String str, String str2) {
        k();
        synchronized (this.f102486d) {
            this.f102484b.putString(str, str2).commit();
        }
    }

    public final String b(String str) {
        String string;
        k();
        synchronized (this.f102486d) {
            string = this.f102483a.getString(str, null);
            this.f102484b.remove(str).commit();
        }
        return string;
    }

    public final boolean c(String str) {
        boolean zContains;
        k();
        synchronized (this.f102486d) {
            zContains = this.f102483a.contains(str);
        }
        return zContains;
    }

    public final void d(String str, int i11, String str2, int i12) {
        k();
        synchronized (this.f102486d) {
            this.f102484b.putString("pn", str).putInt("vc", i11).putString("dm", str2).putInt("aav", i12).commit();
        }
    }

    public final String e() {
        String string;
        k();
        synchronized (this.f102486d) {
            string = this.f102483a.getString("pn", null);
        }
        return string;
    }

    public final int f() {
        int i11;
        k();
        synchronized (this.f102486d) {
            i11 = this.f102483a.getInt("vc", -1);
        }
        return i11;
    }

    public final String g() {
        String string;
        k();
        synchronized (this.f102486d) {
            string = this.f102483a.getString("dm", null);
        }
        return string;
    }

    public final int h() {
        int i11;
        k();
        synchronized (this.f102486d) {
            i11 = this.f102483a.getInt("aav", -1);
        }
        return i11;
    }

    public final void i() {
        k();
        synchronized (this.f102486d) {
            this.f102484b.clear().commit();
        }
    }

    public final Map j() {
        HashMap map;
        k();
        synchronized (this.f102486d) {
            try {
                Map<String, ?> all = this.f102483a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }
}
