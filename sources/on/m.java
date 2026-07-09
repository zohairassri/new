package on;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.t5;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f120607a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(Context context, Intent intent);
    }

    public m(a aVar) {
        com.google.android.gms.common.internal.n.l(aVar);
        this.f120607a = aVar;
    }

    public final void a(Context context, Intent intent) {
        k4 k4VarZzj = t5.a(context, null, null).zzj();
        if (intent == null) {
            k4VarZzj.G().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        k4VarZzj.F().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                k4VarZzj.G().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            k4VarZzj.F().a("Starting wakeful intent.");
            this.f120607a.a(context, className);
        }
    }
}
