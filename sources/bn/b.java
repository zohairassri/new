package bn;

import android.content.Context;
import com.google.android.gms.common.util.p;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f14945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f14946b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f14945a;
        if (context2 != null && (bool = f14946b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f14946b = null;
        if (p.e()) {
            f14946b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f14946b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f14946b = Boolean.FALSE;
            }
        }
        f14945a = applicationContext;
        return f14946b.booleanValue();
    }
}
