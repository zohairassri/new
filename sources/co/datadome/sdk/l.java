package co.datadome.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f18104b = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f18103a = new LinkedHashMap();

    private l() {
    }

    public final void a(Context context) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        Intrinsics.checkExpressionValueIsNotNull(applicationInfo, "context.packageManager.g…r.GET_META_DATA\n        )");
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            for (k kVar : k.values()) {
                f18103a.put(kVar, Boolean.valueOf(bundle.getBoolean(kVar.a(), false)));
            }
        }
    }

    public final boolean b(k kVar) {
        return Intrinsics.areEqual((Boolean) f18103a.get(kVar), Boolean.TRUE);
    }
}
