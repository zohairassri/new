package com.theathletic.ads.ui;

import android.content.res.Resources;
import android.util.Size;
import com.theathletic.ads.ui.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/content/res/Resources;", "Landroid/util/Size;", "a", "(Landroid/content/res/Resources;)Landroid/util/Size;", "screenSizeForAds", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k0 {
    public static final Size a(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return new Size(com.theathletic.drawable.k0.a(resources.getDisplayMetrics().widthPixels) - (com.theathletic.drawable.k0.a((int) resources.getDimension(j0.g.global_list_gutter_padding)) * 2), com.theathletic.drawable.k0.a(resources.getDisplayMetrics().heightPixels));
    }
}
