package bq;

import android.os.Bundle;
import aq.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f14976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f14978c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f14980e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f14979d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14981f = false;

    public c(e eVar, int i11, TimeUnit timeUnit) {
        this.f14976a = eVar;
        this.f14977b = i11;
        this.f14978c = timeUnit;
    }

    @Override // bq.b
    public void C0(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f14980e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // bq.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f14979d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f14980e = new CountDownLatch(1);
                this.f14981f = false;
                this.f14976a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f14980e.await(this.f14977b, this.f14978c)) {
                        this.f14981f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f14980e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
