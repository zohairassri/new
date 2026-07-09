package fl;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94419e;

    private b(int i11, int i12, int i13, int i14, int i15) {
        this.f94415a = i11;
        this.f94416b = i12;
        this.f94417c = i13;
        this.f94418d = i14;
        this.f94419e = i15;
    }

    public static b a(String str) {
        ml.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < strArrSplit.length; i15++) {
            String strE = zo.c.e(strArrSplit[i15].trim());
            strE.getClass();
            switch (strE) {
                case "end":
                    i12 = i15;
                    break;
                case "text":
                    i14 = i15;
                    break;
                case "start":
                    i11 = i15;
                    break;
                case "style":
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new b(i11, i12, i13, i14, strArrSplit.length);
    }
}
