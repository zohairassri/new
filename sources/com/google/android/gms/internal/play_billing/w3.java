package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class w3 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f42620a = new u3(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f42621b = new u3(null);

    w3() {
    }

    private final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        t3 t3Var = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (!(runnable instanceof t3)) {
                if (runnable != f42621b) {
                    break;
                }
            } else {
                t3Var = (t3) runnable;
            }
            i11++;
            if (i11 > 1000) {
                Runnable runnable2 = f42621b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z11 = Thread.interrupted() || z11;
                    LockSupport.park(t3Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z11) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String b();

    abstract void c(Throwable th2);

    abstract void d(Object obj);

    final void e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            t3 t3Var = new t3(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, t3Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f42620a)) == f42621b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(f42620a)) == f42621b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    abstract boolean f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, f42620a)) {
                            g(threadCurrentThread);
                        }
                        c(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, f42620a)) {
                            g(threadCurrentThread);
                        }
                        d(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f42620a)) {
                g(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            d(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f42620a) {
            str = "running=[DONE]";
        } else if (runnable instanceof t3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
