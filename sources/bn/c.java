package bn;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.p;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f14947a;

    public c(Context context) {
        this.f14947a = context;
    }

    public int a(String str) {
        return this.f14947a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f14947a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i11) {
        return this.f14947a.getPackageManager().getApplicationInfo(str, i11);
    }

    public CharSequence d(String str) {
        Context context = this.f14947a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public w4.d e(String str) throws PackageManager.NameNotFoundException {
        Context context = this.f14947a;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
        return w4.d.a(context.getPackageManager().getApplicationLabel(applicationInfo), context.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i11) {
        return this.f14947a.getPackageManager().getPackageInfo(str, i11);
    }

    public boolean g() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f14947a);
        }
        if (!p.e()) {
            return false;
        }
        Context context = this.f14947a;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final boolean h(int i11, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f14947a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i11, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
