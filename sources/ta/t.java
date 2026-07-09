package ta;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f129547a = androidx.work.z.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i11, boolean z11) {
        return i11 == 0 ? z11 : i11 == 1;
    }

    public static void c(Context context, Class cls, boolean z11) {
        try {
            if (z11 == b(a(context, cls.getName()), false)) {
                androidx.work.z.e().a(f129547a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z11 ? 1 : 2, 1);
            androidx.work.z zVarE = androidx.work.z.e();
            String str = f129547a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z11 ? "enabled" : "disabled");
            zVarE.a(str, sb2.toString());
        } catch (Exception e11) {
            androidx.work.z zVarE2 = androidx.work.z.e();
            String str2 = f129547a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z11 ? "enabled" : "disabled");
            zVarE2.b(str2, sb3.toString(), e11);
        }
    }
}
