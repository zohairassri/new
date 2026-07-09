package rt;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {
    public static final String a(Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        StringBuilder sb2 = new StringBuilder();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            sb2.append(packageInfo.versionName);
            if (z11) {
                sb2.append("-");
                sb2.append(packageInfo.versionCode);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            sb2.append("unknown");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String b(Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return a(context, z11);
    }
}
