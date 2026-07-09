package jx;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
