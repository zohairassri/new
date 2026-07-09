package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class jx3 {
    public static void a(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void c(boolean z11, String str, char c11) {
        if (!z11) {
            throw new IllegalArgumentException(ay3.d(str, Character.valueOf(c11)));
        }
    }

    public static void d(boolean z11, String str, int i11) {
        if (!z11) {
            throw new IllegalArgumentException(ay3.d(str, Integer.valueOf(i11)));
        }
    }

    public static void e(boolean z11, String str, long j11) {
        if (!z11) {
            throw new IllegalArgumentException(ay3.d(str, Long.valueOf(j11)));
        }
    }

    public static void f(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(ay3.d(str, obj));
        }
    }

    public static void g(boolean z11, String str, int i11, int i12) {
        if (!z11) {
            throw new IllegalArgumentException(ay3.d(str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    public static void h(boolean z11, String str, Object obj, Object obj2) {
        if (!z11) {
            throw new IllegalArgumentException(ay3.d(str, obj, obj2));
        }
    }

    public static void i(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object k(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object l(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(ay3.d(str, obj2));
    }

    public static int m(int i11, int i12, String str) {
        String strD;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            strD = ay3.d("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            strD = ay3.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(strD);
    }

    public static int n(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(p(i11, i12, "index"));
        }
        return i11;
    }

    public static void o(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? p(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? p(i12, i13, "end index") : ay3.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    private static String p(int i11, int i12, String str) {
        if (i11 < 0) {
            return ay3.d("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return ay3.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }
}
