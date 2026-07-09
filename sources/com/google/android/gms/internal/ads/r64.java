package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class r64 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f34011a = new q64(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f34012b = new q64(null);

    r64() {
    }

    private final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        p64 p64Var = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (!(runnable instanceof p64)) {
                if (runnable != f34012b) {
                    break;
                }
            } else {
                p64Var = (p64) runnable;
            }
            i11++;
            if (i11 > 1000) {
                Runnable runnable2 = f34012b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z11 = Thread.interrupted() || z11;
                    LockSupport.park(p64Var);
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

    abstract String c();

    abstract boolean d();

    abstract void e(Object obj);

    abstract void f(Throwable th2);

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            p64 p64Var = new p64(this, null);
            p64Var.a(Thread.currentThread());
            if (compareAndSet(runnable, p64Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f34011a)) == f34012b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(f34011a)) == f34012b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            if (!zD) {
                try {
                    objA = a();
                } catch (Throwable th2) {
                    try {
                        e74.a(th2);
                        if (!compareAndSet(threadCurrentThread, f34011a)) {
                            b(threadCurrentThread);
                        }
                        f(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, f34011a)) {
                            b(threadCurrentThread);
                        }
                        e(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f34011a)) {
                b(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == f34011a) {
            string = "running=[DONE]";
        } else if (runnable instanceof p64) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append("]");
            string = sb2.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strC = c();
        StringBuilder sb3 = new StringBuilder(string.length() + 2 + String.valueOf(strC).length());
        sb3.append(string);
        sb3.append(", ");
        sb3.append(strC);
        return sb3.toString();
    }
}
