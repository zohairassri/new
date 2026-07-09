package a80;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/webkit/WebSettings;", "Landroid/content/Context;", "context", "", "a", "(Landroid/webkit/WebSettings;Landroid/content/Context;)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void a(WebSettings webSettings, Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(webSettings, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        webSettings.setUserAgentString(webSettings.getUserAgentString() + " theathletic-android/" + packageInfo.versionName + " (" + packageInfo.getLongVersionCode() + ")");
    }
}
