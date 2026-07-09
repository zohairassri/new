package b4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final float a(float f11) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f11)) & 8589934591L) / ((long) 3))) + 709952852);
        float f12 = fIntBitsToFloat - ((fIntBitsToFloat - (f11 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f12 - ((f12 - (f11 / (f12 * f12))) * 0.33333334f);
    }

    public static final float b(float f11, float f12, float f13) {
        return ((1 - f13) * f11) + (f13 * f12);
    }

    public static final int c(int i11, int i12, float f11) {
        return i11 + ((int) Math.round(((double) (i12 - i11)) * ((double) f11)));
    }
}
