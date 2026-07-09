package v4;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static Spanned a(String str, int i11) {
            return Html.fromHtml(str, i11);
        }

        static Spanned b(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i11, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i11) {
            return Html.toHtml(spanned, i11);
        }
    }

    public static Spanned a(String str, int i11) {
        return a.a(str, i11);
    }

    public static Spanned b(String str, int i11, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return a.b(str, i11, imageGetter, tagHandler);
    }

    public static String c(Spanned spanned, int i11) {
        return a.c(spanned, i11);
    }
}
