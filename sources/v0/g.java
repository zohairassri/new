package v0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final int a(int i11) {
        return Character.charCount(i11);
    }

    public static final int b(CharSequence charSequence, int i11) {
        return Character.codePointAt(charSequence, i11);
    }

    public static final int c(CharSequence charSequence, int i11) {
        return Character.codePointBefore(charSequence, i11);
    }
}
