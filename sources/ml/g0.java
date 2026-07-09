package ml;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import ml.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g0 implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f116772b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f116773a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f116774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g0 f116775b;

        private b() {
        }

        private void b() {
            this.f116774a = null;
            this.f116775b = null;
            g0.o(this);
        }

        @Override // ml.m.a
        public void a() {
            ((Message) ml.a.e(this.f116774a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) ml.a.e(this.f116774a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, g0 g0Var) {
            this.f116774a = message;
            this.f116775b = g0Var;
            return this;
        }
    }

    public g0(Handler handler) {
        this.f116773a = handler;
    }

    private static b n() {
        b bVar;
        List list = f116772b;
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
        List list = f116772b;
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

    @Override // ml.m
    public m.a a(int i11) {
        return n().d(this.f116773a.obtainMessage(i11), this);
    }

    @Override // ml.m
    public boolean b(int i11) {
        return this.f116773a.hasMessages(i11);
    }

    @Override // ml.m
    public m.a c(int i11, int i12, int i13, Object obj) {
        return n().d(this.f116773a.obtainMessage(i11, i12, i13, obj), this);
    }

    @Override // ml.m
    public m.a d(int i11, Object obj) {
        return n().d(this.f116773a.obtainMessage(i11, obj), this);
    }

    @Override // ml.m
    public void e(Object obj) {
        this.f116773a.removeCallbacksAndMessages(obj);
    }

    @Override // ml.m
    public Looper f() {
        return this.f116773a.getLooper();
    }

    @Override // ml.m
    public m.a g(int i11, int i12, int i13) {
        return n().d(this.f116773a.obtainMessage(i11, i12, i13), this);
    }

    @Override // ml.m
    public boolean h(Runnable runnable) {
        return this.f116773a.post(runnable);
    }

    @Override // ml.m
    public boolean i(int i11) {
        return this.f116773a.sendEmptyMessage(i11);
    }

    @Override // ml.m
    public boolean j(int i11, long j11) {
        return this.f116773a.sendEmptyMessageAtTime(i11, j11);
    }

    @Override // ml.m
    public void k(int i11) {
        this.f116773a.removeMessages(i11);
    }

    @Override // ml.m
    public boolean l(m.a aVar) {
        return ((b) aVar).c(this.f116773a);
    }
}
