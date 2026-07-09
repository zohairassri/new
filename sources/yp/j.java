package yp;

import com.google.android.gms.common.internal.n;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class j implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f140830f = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f140831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque f140832b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f140833c = c.IDLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f140834d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f140835e = new b(this, null);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f140836a;

        a(Runnable runnable) {
            this.f140836a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f140836a.run();
        }

        public String toString() {
            return this.f140836a.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Runnable f140838a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f140838a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            yp.j.f140830f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f140838a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f140838a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                yp.j r2 = yp.j.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = yp.j.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                yp.j r0 = yp.j.this     // Catch: java.lang.Throwable -> L20
                yp.j$c r0 = yp.j.b(r0)     // Catch: java.lang.Throwable -> L20
                yp.j$c r3 = yp.j.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                r8.interrupt()
                goto L48
            L20:
                r8 = move-exception
                goto L7d
            L22:
                yp.j r0 = yp.j.this     // Catch: java.lang.Throwable -> L20
                yp.j.d(r0)     // Catch: java.lang.Throwable -> L20
                yp.j r0 = yp.j.this     // Catch: java.lang.Throwable -> L20
                yp.j.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                yp.j r3 = yp.j.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = yp.j.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f140838a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                yp.j r8 = yp.j.this     // Catch: java.lang.Throwable -> L20
                yp.j$c r0 = yp.j.c.IDLE     // Catch: java.lang.Throwable -> L20
                yp.j.c(r8, r0)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f140838a     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.f140838a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r8 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = yp.j.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f140838a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.f140838a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r8     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L88:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: yp.j.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e11) {
                synchronized (j.this.f140832b) {
                    j.this.f140833c = c.IDLE;
                    throw e11;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f140838a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + j.this.f140833c + "}";
        }

        /* synthetic */ b(j jVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    j(Executor executor) {
        this.f140831a = (Executor) n.l(executor);
    }

    static /* synthetic */ long d(j jVar) {
        long j11 = jVar.f140834d;
        jVar.f140834d = 1 + j11;
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.android.gms.common.internal.n.l(r8)
            java.util.Deque r0 = r7.f140832b
            monitor-enter(r0)
            yp.j$c r1 = r7.f140833c     // Catch: java.lang.Throwable -> L6b
            yp.j$c r2 = yp.j.c.RUNNING     // Catch: java.lang.Throwable -> L6b
            if (r1 == r2) goto L6d
            yp.j$c r2 = yp.j.c.QUEUED     // Catch: java.lang.Throwable -> L6b
            if (r1 != r2) goto L11
            goto L6d
        L11:
            long r3 = r7.f140834d     // Catch: java.lang.Throwable -> L6b
            yp.j$a r1 = new yp.j$a     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6b
            java.util.Deque r8 = r7.f140832b     // Catch: java.lang.Throwable -> L6b
            r8.add(r1)     // Catch: java.lang.Throwable -> L6b
            yp.j$c r8 = yp.j.c.QUEUING     // Catch: java.lang.Throwable -> L6b
            r7.f140833c = r8     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.Executor r0 = r7.f140831a     // Catch: java.lang.Throwable -> L44
            yp.j$b r5 = r7.f140835e     // Catch: java.lang.Throwable -> L44
            r0.execute(r5)     // Catch: java.lang.Throwable -> L44
            yp.j$c r0 = r7.f140833c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f140832b
            monitor-enter(r0)
            long r5 = r7.f140834d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            yp.j$c r1 = r7.f140833c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f140833c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r7 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r7
        L44:
            r8 = move-exception
            java.util.Deque r2 = r7.f140832b
            monitor-enter(r2)
            yp.j$c r0 = r7.f140833c     // Catch: java.lang.Throwable -> L53
            yp.j$c r3 = yp.j.c.IDLE     // Catch: java.lang.Throwable -> L53
            if (r0 == r3) goto L55
            yp.j$c r3 = yp.j.c.QUEUING     // Catch: java.lang.Throwable -> L53
            if (r0 != r3) goto L5f
            goto L55
        L53:
            r7 = move-exception
            goto L69
        L55:
            java.util.Deque r7 = r7.f140832b     // Catch: java.lang.Throwable -> L53
            boolean r7 = r7.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L5f
            r7 = 1
            goto L60
        L5f:
            r7 = 0
        L60:
            boolean r0 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L68
            if (r7 != 0) goto L68
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            return
        L68:
            throw r8     // Catch: java.lang.Throwable -> L53
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r7
        L6b:
            r7 = move-exception
            goto L74
        L6d:
            java.util.Deque r7 = r7.f140832b     // Catch: java.lang.Throwable -> L6b
            r7.add(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.j.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f140831a + "}";
    }
}
