package hy;

import android.net.UrlQuerySanitizer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class l {
    public static final String a(UrlQuerySanitizer urlQuerySanitizer, String key) {
        Intrinsics.checkNotNullParameter(urlQuerySanitizer, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String value = urlQuerySanitizer.getValue(key);
        return value == null ? "" : value;
    }
}
