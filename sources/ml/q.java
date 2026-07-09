package ml;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f116825b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f116826c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f116824a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f116827d = a.f116828a;

    private static String a(String str, Throwable th2) {
        String strE = e(th2);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f116824a) {
            try {
                if (f116825b == 0) {
                    f116827d.d(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f116824a) {
            try {
                if (f116825b <= 3) {
                    f116827d.e(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static String e(Throwable th2) {
        synchronized (f116824a) {
            try {
                if (th2 == null) {
                    return null;
                }
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f116826c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f116824a) {
            try {
                if (f116825b <= 1) {
                    f116827d.i(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        f(str, a(str2, th2));
    }

    private static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f116824a) {
            try {
                if (f116825b <= 2) {
                    f116827d.w(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        i(str, a(str2, th2));
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f116828a = new C1445a();

        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);

        /* JADX INFO: renamed from: ml.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class C1445a implements a {
            C1445a() {
            }

            @Override // ml.q.a
            public void e(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // ml.q.a
            public void i(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // ml.q.a
            public void w(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // ml.q.a
            public void d(String str, String str2) {
            }
        }
    }
}
