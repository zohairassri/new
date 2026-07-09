package aq;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final g f13617c = new g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13619b = 4;

    public g(String str) {
        this.f13618a = str;
    }

    private boolean a(int i11) {
        return this.f13619b <= i11 || Log.isLoggable(this.f13618a, i11);
    }

    public static g f() {
        return f13617c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        a(3);
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f13618a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f13618a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        a(2);
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f13618a, str, th2);
        }
    }
}
