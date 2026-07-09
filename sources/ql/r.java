package ql;

import android.os.RemoteException;
import yl.m1;
import yl.m2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f122855a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m1 f122856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f122857c;

    public void a(a aVar) {
        m2 m2Var;
        synchronized (this.f122855a) {
            this.f122857c = aVar;
            m1 m1Var = this.f122856b;
            if (m1Var == null) {
                return;
            }
            if (aVar == null) {
                m2Var = null;
            } else {
                try {
                    m2Var = new m2(aVar);
                } catch (RemoteException e11) {
                    cm.o.d("Unable to call setVideoLifecycleCallbacks on video controller.", e11);
                }
            }
            m1Var.I2(m2Var);
        }
    }

    public final void b(m1 m1Var) {
        synchronized (this.f122855a) {
            try {
                this.f122856b = m1Var;
                a aVar = this.f122857c;
                if (aVar != null) {
                    a(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m1 c() {
        m1 m1Var;
        synchronized (this.f122855a) {
            m1Var = this.f122856b;
        }
        return m1Var;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {
        public abstract void a();

        public abstract void c();

        public abstract void e();

        public void d() {
        }

        public void b(boolean z11) {
        }
    }
}
