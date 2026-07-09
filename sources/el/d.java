package el;

import android.text.Spannable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static void a(Spannable spannable, Object obj, int i11, int i12, int i13) {
        for (Object obj2 : spannable.getSpans(i11, i12, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i11 && spannable.getSpanEnd(obj2) == i12 && spannable.getSpanFlags(obj2) == i13) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i11, i12, i13);
    }
}
