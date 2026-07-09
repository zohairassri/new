package gr;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f98919a;

    private c() {
    }

    public static synchronized c c() {
        try {
            if (f98919a == null) {
                f98919a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f98919a;
    }

    void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    void e(String str) {
        Log.w("FirebasePerformance", str);
    }

    void a(String str) {
    }
}
