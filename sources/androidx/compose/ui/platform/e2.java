package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {
    private static final float a(float f11) {
        return (float) (f11 >= 0.0f ? Math.ceil(f11) : Math.floor(f11));
    }

    public static final int b(float f11) {
        return ((int) a(f11)) * (-1);
    }
}
