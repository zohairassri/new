package rm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.p;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f125032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f125033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f125034c = 0;

    public g(Context context) {
        this.f125032a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoF;
        if (this.f125033b == 0) {
            try {
                packageInfoF = bn.d.a(this.f125032a).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e11) {
                String strValueOf = String.valueOf(e11);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(strValueOf);
                Log.w("Metadata", sb2.toString());
                packageInfoF = null;
            }
            if (packageInfoF != null) {
                this.f125033b = packageInfoF.versionCode;
            }
        }
        return this.f125033b;
    }

    public final synchronized int b() {
        int i11 = this.f125034c;
        if (i11 != 0) {
            return i11;
        }
        PackageManager packageManager = this.f125032a.getPackageManager();
        if (bn.d.a(this.f125032a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i12 = 1;
        if (!p.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f125034c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f125034c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (p.e()) {
            this.f125034c = 2;
            i12 = 2;
        } else {
            this.f125034c = 1;
        }
        return i12;
    }
}
