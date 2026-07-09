package t4;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f129360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f129361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f129362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f129363d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void onCancel();
    }

    private void c() {
        while (this.f129363d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f129360a) {
                    return;
                }
                this.f129360a = true;
                this.f129363d = true;
                a aVar = this.f129361b;
                Object obj = this.f129362c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f129363d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f129363d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f129361b == aVar) {
                    return;
                }
                this.f129361b = aVar;
                if (this.f129360a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}
