package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import k4.b;
import l4.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b.a f7351a = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends b.a {
        a() {
        }

        @Override // k4.b
        public void r6(k4.a aVar) {
            if (aVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a(new e(aVar));
        }
    }

    protected abstract void a(e eVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7351a;
    }
}
