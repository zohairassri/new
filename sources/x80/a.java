package x80;

import g90.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static Object a(Object obj, Class cls) {
        if (obj instanceof g90.a) {
            return cls.cast(obj);
        }
        if (obj instanceof b) {
            return a(((b) obj).k(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), g90.a.class, b.class));
    }
}
