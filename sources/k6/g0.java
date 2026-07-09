package k6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import k6.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f107609b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f107610a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f107611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g0 f107612b;

        private b() {
        }

        private void b() {
            this.f107611a = null;
            this.f107612b = null;
            g0.o(this);
        }

        @Override // k6.o.a
        public void a() {
            ((Message) k6.a.e(this.f107611a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) k6.a.e(this.f107611a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, g0 g0Var) {
            this.f107611a = message;
            this.f107612b = g0Var;
            return this;
        }
    }

    public g0(Handler handler) {
        this.f107610a = handler;
    }

    private static b n() {
        b bVar;
        List list = f107609b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(b bVar) {
        List list = f107609b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k6.o
    public o.a a(int i11) {
        return n().d(this.f107610a.obtainMessage(i11), this);
    }

    @Override // k6.o
    public boolean b(int i11) {
        k6.a.a(i11 != 0);
        return this.f107610a.hasMessages(i11);
    }

    @Override // k6.o
    public o.a c(int i11, int i12, int i13, Object obj) {
        return n().d(this.f107610a.obtainMessage(i11, i12, i13, obj), this);
    }

    @Override // k6.o
    public o.a d(int i11, Object obj) {
        return n().d(this.f107610a.obtainMessage(i11, obj), this);
    }

    @Override // k6.o
    public void e(Object obj) {
        this.f107610a.removeCallbacksAndMessages(obj);
    }

    @Override // k6.o
    public Looper f() {
        return this.f107610a.getLooper();
    }

    @Override // k6.o
    public o.a g(int i11, int i12, int i13) {
        return n().d(this.f107610a.obtainMessage(i11, i12, i13), this);
    }

    @Override // k6.o
    public boolean h(Runnable runnable) {
        return this.f107610a.post(runnable);
    }

    @Override // k6.o
    public boolean i(int i11) {
        return this.f107610a.sendEmptyMessage(i11);
    }

    @Override // k6.o
    public boolean j(int i11, long j11) {
        return this.f107610a.sendEmptyMessageAtTime(i11, j11);
    }

    @Override // k6.o
    public void k(int i11) {
        k6.a.a(i11 != 0);
        this.f107610a.removeMessages(i11);
    }

    @Override // k6.o
    public boolean l(o.a aVar) {
        return ((b) aVar).c(this.f107610a);
    }
}
