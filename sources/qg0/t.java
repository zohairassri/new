package qg0;

import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f122780a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f122781b = new byte[0];

    public static final long a(int i11, int i12, int i13, int i14, int i15, int i16) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i11, i12 - 1, i13, i14, i15, i16);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int b() {
        return f122780a;
    }

    public static final byte[] c() {
        return f122781b;
    }
}
