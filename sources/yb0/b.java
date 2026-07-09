package yb0;

import we0.t;
import we0.u;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public final String a() {
        Object objB;
        try {
            t.a aVar = t.f135193b;
            Class<?> cls = Class.forName("okhttp3.OkHttp", false, b.class.getClassLoader());
            Object obj = cls.getField("VERSION").get(cls);
            objB = t.b(obj != null ? obj.toString() : null);
        } catch (Throwable th2) {
            t.a aVar2 = t.f135193b;
            objB = t.b(u.a(th2));
        }
        if (t.g(objB)) {
            objB = "";
        }
        String str = (String) objB;
        return str == null ? "" : str;
    }

    public final boolean b() {
        Object objB;
        try {
            t.a aVar = t.f135193b;
            Class.forName("okhttp3.OkHttpClient", false, b.class.getClassLoader());
            objB = t.b(Boolean.TRUE);
        } catch (Throwable th2) {
            t.a aVar2 = t.f135193b;
            objB = t.b(u.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (t.g(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
