package m8;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f115822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f115825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f115826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f115827f;

    private a(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f115822a = i11;
        this.f115823b = i12;
        this.f115824c = i13;
        this.f115825d = i14;
        this.f115826e = i15;
        this.f115827f = i16;
    }

    public static a a(String str) {
        k6.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < strArrSplit.length; i16++) {
            String strE = zo.c.e(strArrSplit[i16].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i13 = i16;
                    break;
                case "text":
                    i15 = i16;
                    break;
                case "layer":
                    i11 = i16;
                    break;
                case "start":
                    i12 = i16;
                    break;
                case "style":
                    i14 = i16;
                    break;
            }
        }
        if (i12 == -1 || i13 == -1 || i15 == -1) {
            return null;
        }
        return new a(i11, i12, i13, i14, i15, strArrSplit.length);
    }
}
