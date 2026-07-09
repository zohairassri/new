package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ab1 {
    public static void a(Spannable spannable, Object obj, int i11, int i12, int i13) {
        for (Object obj2 : spannable.getSpans(i11, i12, obj.getClass())) {
            c(spannable, obj2, i11, i12, 33);
        }
        spannable.setSpan(obj, i11, i12, 33);
    }

    public static void b(Spannable spannable, float f11, int i11, int i12, int i13) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i11, i12, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i11 && spannable.getSpanEnd(relativeSizeSpan) >= i12) {
                f11 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i11, i12, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f11), i11, i12, 33);
    }

    private static void c(Spannable spannable, Object obj, int i11, int i12, int i13) {
        if (spannable.getSpanStart(obj) == i11 && spannable.getSpanEnd(obj) == i12 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
