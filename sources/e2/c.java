package e2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final String a(float f11, int i11) {
        if (Float.isNaN(f11)) {
            return "NaN";
        }
        if (Float.isInfinite(f11)) {
            return f11 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i11, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f12 = f11 * fPow;
        int i12 = (int) f12;
        if (f12 - i12 >= 0.5f) {
            i12++;
        }
        float f13 = i12 / fPow;
        return iMax > 0 ? String.valueOf(f13) : String.valueOf((int) f13);
    }
}
