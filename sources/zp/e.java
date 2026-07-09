package zp;

import android.os.Bundle;
import aq.g;
import java.util.Locale;
import up.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class e implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bq.b f142508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bq.b f142509b;

    e() {
    }

    private static void b(bq.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.C0(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f142508a : this.f142509b, str, bundle);
    }

    @Override // up.a.b
    public void a(int i11, Bundle bundle) {
        String string;
        g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i11), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(bq.b bVar) {
        this.f142509b = bVar;
    }

    public void e(bq.b bVar) {
        this.f142508a = bVar;
    }
}
