package l0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 {
    public static final int a(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i11) {
        while (i11 > 0) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
            i11--;
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i11) {
        return h3.d3.b(b(charSequence, i11), a(charSequence, i11));
    }
}
