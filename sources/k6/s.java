package k6;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f107672b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f107673c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f107671a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f107674d = a.f107675a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107675a = new C1320a();

        /* JADX INFO: renamed from: k6.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class C1320a implements a {
            C1320a() {
            }

            @Override // k6.s.a
            public void a(String str, String str2, Throwable th2) {
                s.a(str2, th2);
            }

            @Override // k6.s.a
            public void b(String str, String str2, Throwable th2) {
                Log.w(str, s.a(str2, th2));
            }

            @Override // k6.s.a
            public void c(String str, String str2, Throwable th2) {
                Log.i(str, s.a(str2, th2));
            }

            @Override // k6.s.a
            public void e(String str, String str2, Throwable th2) {
                Log.e(str, s.a(str2, th2));
            }
        }

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void c(String str, String str2, Throwable th2);

        void e(String str, String str2, Throwable th2);
    }

    public static String a(String str, Throwable th2) {
        String strF = f(th2);
        if (TextUtils.isEmpty(strF)) {
            return str;
        }
        return str + "\n  " + strF.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f107671a) {
            try {
                if (f107672b == 0) {
                    f107674d.a(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        synchronized (f107671a) {
            try {
                if (f107672b == 0) {
                    f107674d.a(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void d(String str, String str2) {
        synchronized (f107671a) {
            try {
                if (f107672b <= 3) {
                    f107674d.e(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        synchronized (f107671a) {
            try {
                if (f107672b <= 3) {
                    f107674d.e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String f(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f107671a) {
            try {
                if (h(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (f107673c) {
                    return Log.getStackTraceString(th2).trim().replace("\t", "    ");
                }
                return th2.getMessage();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void g(String str, String str2) {
        synchronized (f107671a) {
            try {
                if (f107672b <= 1) {
                    f107674d.c(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
        synchronized (f107671a) {
            try {
                if (f107672b <= 2) {
                    f107674d.b(str, str2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        synchronized (f107671a) {
            try {
                if (f107672b <= 2) {
                    f107674d.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
