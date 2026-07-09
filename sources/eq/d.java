package eq;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f92818a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f92820c;

    public d(int i11, int i12) {
        this.f92819b = i11;
        this.f92820c = i12;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f92820c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i11) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i11 ? strTrim.substring(0, i11) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f92818a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f92818a.size() >= this.f92819b && !this.f92818a.containsKey(strB)) {
            aq.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f92819b);
            return false;
        }
        String strC = c(str2, this.f92820c);
        if (dq.i.y((String) this.f92818a.get(strB), strC)) {
            return false;
        }
        Map map = this.f92818a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f92818a.size() < this.f92819b || this.f92818a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f92818a.put(strB, str == null ? "" : c(str, this.f92820c));
                } else {
                    i11++;
                }
            }
            if (i11 > 0) {
                aq.g.f().k("Ignored " + i11 + " entries when adding custom keys. Maximum allowable: " + this.f92819b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
