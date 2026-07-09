package com.theathletic.utility;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/theathletic/utility/q;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", QueryKeys.PAGE_LOAD_TIME, "(Landroid/content/Context;)Z", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "Ljava/lang/String;", "mPackageNameToUse", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static String mPackageNameToUse;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f84831a = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f84833c = 8;

    private q() {
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = mPackageNameToUse;
        if (str != null) {
            return str;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.test-url.com"));
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            mPackageNameToUse = null;
        } else if (arrayList.size() == 1) {
            mPackageNameToUse = (String) arrayList.get(0);
        } else if (arrayList.contains("com.android.chrome")) {
            mPackageNameToUse = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            mPackageNameToUse = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            mPackageNameToUse = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            mPackageNameToUse = "com.google.android.apps.chrome";
        }
        return mPackageNameToUse;
    }

    public final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context) != null;
    }
}
