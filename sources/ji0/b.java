package ji0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f105649a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f105650b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f105651c = new C1304b();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a implements Serializable {
        a() {
        }

        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* JADX INFO: renamed from: ji0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class C1304b implements Serializable {
        C1304b() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    private b() {
    }

    public static b b() {
        return f105649a;
    }

    public Object a(Object obj) {
        if (obj == f105651c) {
            return null;
        }
        return obj;
    }

    public Object c(Object obj) {
        return obj == null ? f105651c : obj;
    }
}
