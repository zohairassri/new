package androidx.work;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f13591a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile z f13592b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13593c = 20;

    public z(int i11) {
    }

    public static z e() {
        z zVar;
        synchronized (f13591a) {
            try {
                if (f13592b == null) {
                    f13592b = new a(3);
                }
                zVar = f13592b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    public static void h(z zVar) {
        synchronized (f13591a) {
            try {
                if (f13592b == null) {
                    f13592b = zVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i11 = f13593c;
        if (length >= i11) {
            sb2.append(str.substring(0, i11));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a extends z {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f13594d;

        public a(int i11) {
            super(i11);
            this.f13594d = i11;
        }

        @Override // androidx.work.z
        public void c(String str, String str2) {
            if (this.f13594d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.z
        public void d(String str, String str2, Throwable th2) {
            if (this.f13594d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // androidx.work.z
        public void f(String str, String str2) {
            if (this.f13594d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.z
        public void g(String str, String str2, Throwable th2) {
            if (this.f13594d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // androidx.work.z
        public void k(String str, String str2) {
            if (this.f13594d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.z
        public void l(String str, String str2, Throwable th2) {
            if (this.f13594d <= 5) {
                Log.w(str, str2, th2);
            }
        }

        @Override // androidx.work.z
        public void a(String str, String str2) {
        }

        @Override // androidx.work.z
        public void j(String str, String str2) {
        }

        @Override // androidx.work.z
        public void b(String str, String str2, Throwable th2) {
        }
    }
}
