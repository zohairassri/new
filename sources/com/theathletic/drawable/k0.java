package com.theathletic.drawable;

import android.content.res.Resources;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "(I)I", "toDp", "core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k0 {
    public static final int a(int i11) {
        return (int) (i11 / Resources.getSystem().getDisplayMetrics().density);
    }
}
