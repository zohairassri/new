package com.theathletic.article.ui.webview;

import android.graphics.Point;
import android.util.Size;
import android.webkit.WebView;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/webkit/WebView;", "", "elementX", "elementY", "Landroid/graphics/Point;", "a", "(Landroid/webkit/WebView;II)Landroid/graphics/Point;", "width", "height", "Landroid/util/Size;", QueryKeys.PAGE_LOAD_TIME, "(Landroid/webkit/WebView;II)Landroid/util/Size;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d2 {
    public static final Point a(WebView webView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        float f11 = webView.getResources().getDisplayMetrics().density;
        return new Point((int) (i11 * f11), (int) (i12 * f11));
    }

    public static final Size b(WebView webView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        float f11 = webView.getContext().getResources().getDisplayMetrics().density;
        return new Size((int) (i11 * f11), (int) (i12 * f11));
    }
}
