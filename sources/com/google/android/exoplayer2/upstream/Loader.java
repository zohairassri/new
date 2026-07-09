package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.comscore.util.crashreport.CrashReportManager;
import io.agora.base.internal.video.FactorBitrateAdjuster;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import ml.j0;
import ml.l0;
import ml.q;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class Loader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21643d = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21644e = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f21645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f21646g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f21647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f21648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f21649c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void a(e eVar, long j11, long j12, boolean z11);

        void p(e eVar, long j11, long j12);

        c t(e eVar, long j11, long j12, IOException iOException, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f21651b;

        public boolean c() {
            int i11 = this.f21650a;
            return i11 == 0 || i11 == 1;
        }

        private c(int i11, long j11) {
            this.f21650a = i11;
            this.f21651b = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f21653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f21654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b f21655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IOException f21656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f21657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Thread f21658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f21659h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile boolean f21660i;

        public d(Looper looper, e eVar, b bVar, int i11, long j11) {
            super(looper);
            this.f21653b = eVar;
            this.f21655d = bVar;
            this.f21652a = i11;
            this.f21654c = j11;
        }

        private void b() {
            this.f21656e = null;
            Loader.this.f21647a.execute((Runnable) ml.a.e(Loader.this.f21648b));
        }

        private void c() {
            Loader.this.f21648b = null;
        }

        private long d() {
            return Math.min((this.f21657f - 1) * FactorBitrateAdjuster.FACTOR_BASE, CrashReportManager.TIME_WINDOW);
        }

        public void a(boolean z11) {
            this.f21660i = z11;
            this.f21656e = null;
            if (hasMessages(0)) {
                this.f21659h = true;
                removeMessages(0);
                if (!z11) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f21659h = true;
                        this.f21653b.b();
                        Thread thread = this.f21658g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z11) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) ml.a.e(this.f21655d)).a(this.f21653b, jElapsedRealtime, jElapsedRealtime - this.f21654c, true);
                this.f21655d = null;
            }
        }

        public void e(int i11) throws IOException {
            IOException iOException = this.f21656e;
            if (iOException != null && this.f21657f > i11) {
                throw iOException;
            }
        }

        public void f(long j11) {
            ml.a.f(Loader.this.f21648b == null);
            Loader.this.f21648b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(0, j11);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f21660i) {
                return;
            }
            int i11 = message.what;
            if (i11 == 0) {
                b();
                return;
            }
            if (i11 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = jElapsedRealtime - this.f21654c;
            b bVar = (b) ml.a.e(this.f21655d);
            if (this.f21659h) {
                bVar.a(this.f21653b, jElapsedRealtime, j11, false);
                return;
            }
            int i12 = message.what;
            if (i12 == 1) {
                try {
                    bVar.p(this.f21653b, jElapsedRealtime, j11);
                    return;
                } catch (RuntimeException e11) {
                    q.d("LoadTask", "Unexpected exception handling load completed", e11);
                    Loader.this.f21649c = new UnexpectedLoaderException(e11);
                    return;
                }
            }
            if (i12 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f21656e = iOException;
            int i13 = this.f21657f + 1;
            this.f21657f = i13;
            c cVarT = bVar.t(this.f21653b, jElapsedRealtime, j11, iOException, i13);
            if (cVarT.f21650a == 3) {
                Loader.this.f21649c = this.f21656e;
            } else if (cVarT.f21650a != 2) {
                if (cVarT.f21650a == 1) {
                    this.f21657f = 1;
                }
                f(cVarT.f21651b != -9223372036854775807L ? cVarT.f21651b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            try {
                synchronized (this) {
                    z11 = this.f21659h;
                    this.f21658g = Thread.currentThread();
                }
                if (!z11) {
                    j0.a("load:" + this.f21653b.getClass().getSimpleName());
                    try {
                        this.f21653b.a();
                        j0.c();
                    } catch (Throwable th2) {
                        j0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f21658g = null;
                    Thread.interrupted();
                }
                if (this.f21660i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e11) {
                if (this.f21660i) {
                    return;
                }
                obtainMessage(2, e11).sendToTarget();
            } catch (Error e12) {
                if (!this.f21660i) {
                    q.d("LoadTask", "Unexpected error loading stream", e12);
                    obtainMessage(3, e12).sendToTarget();
                }
                throw e12;
            } catch (Exception e13) {
                if (this.f21660i) {
                    return;
                }
                q.d("LoadTask", "Unexpected exception loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            } catch (OutOfMemoryError e14) {
                if (this.f21660i) {
                    return;
                }
                q.d("LoadTask", "OutOfMemory error loading stream", e14);
                obtainMessage(2, new UnexpectedLoaderException(e14)).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface e {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface f {
        void k();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f21662a;

        public g(f fVar) {
            this.f21662a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21662a.k();
        }
    }

    static {
        long j11 = -9223372036854775807L;
        f21645f = new c(2, j11);
        f21646g = new c(3, j11);
    }

    public Loader(String str) {
        this.f21647a = l0.y0("ExoPlayer:Loader:" + str);
    }

    public static c g(boolean z11, long j11) {
        return new c(z11 ? 1 : 0, j11);
    }

    public void e() {
        ((d) ml.a.h(this.f21648b)).a(false);
    }

    public void f() {
        this.f21649c = null;
    }

    public boolean h() {
        return this.f21649c != null;
    }

    public boolean i() {
        return this.f21648b != null;
    }

    public void j(int i11) throws IOException {
        IOException iOException = this.f21649c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f21648b;
        if (dVar != null) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = dVar.f21652a;
            }
            dVar.e(i11);
        }
    }

    public void k(f fVar) {
        d dVar = this.f21648b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f21647a.execute(new g(fVar));
        }
        this.f21647a.shutdown();
    }

    public long l(e eVar, b bVar, int i11) {
        Looper looper = (Looper) ml.a.h(Looper.myLooper());
        this.f21649c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i11, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
