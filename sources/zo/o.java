package zo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class o {
    private static String a(int i11, int i12, String str) {
        if (i11 < 0) {
            return t.a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return t.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    private static String b(int i11, int i12, String str) {
        if (i11 < 0) {
            return t.a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return t.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    private static String c(int i11, int i12, int i13) {
        return (i11 < 0 || i11 > i13) ? b(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? b(i12, i13, "end index") : t.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public static void d(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z11, String str, int i11, int i12) {
        if (!z11) {
            throw new IllegalArgumentException(t.a(str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    public static void g(boolean z11, String str, long j11) {
        if (!z11) {
            throw new IllegalArgumentException(t.a(str, Long.valueOf(j11)));
        }
    }

    public static void h(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(t.a(str, obj));
        }
    }

    public static int i(int i11, int i12) {
        return j(i11, i12, "index");
    }

    public static int j(int i11, int i12, String str) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(a(i11, i12, str));
        }
        return i11;
    }

    public static Object k(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object l(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int m(int i11, int i12) {
        return n(i11, i12, "index");
    }

    public static int n(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(b(i11, i12, str));
        }
        return i11;
    }

    public static void o(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException(c(i11, i12, i13));
        }
    }

    public static void p(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static void q(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void r(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalStateException(t.a(str, obj));
        }
    }
}
