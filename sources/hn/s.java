package hn;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s {
    public static void a(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static int b(int i11, int i12, String str) {
        String strA;
        if (i11 >= 0 && i11 < i12) {
            return i11;
        }
        if (i11 < 0) {
            strA = t.a("%s (%s) must not be negative", "index", Integer.valueOf(i11));
        } else {
            if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            strA = t.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int c(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(e(i11, i12, "index"));
        }
        return i11;
    }

    public static void d(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? e(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? e(i12, i13, "end index") : t.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    private static String e(int i11, int i12, String str) {
        if (i11 < 0) {
            return t.a("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return t.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }
}
