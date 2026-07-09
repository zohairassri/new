package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f18356e = Executors.newCachedThreadPool(new ec.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f18357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f18358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f18359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile q0 f18360d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a extends FutureTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s0 f18361a;

        a(s0 s0Var, Callable callable) {
            super(callable);
            this.f18361a = s0Var;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f18361a.l((q0) get());
                } catch (InterruptedException | ExecutionException e11) {
                    this.f18361a.l(new q0(e11));
                }
            } finally {
                this.f18361a = null;
            }
        }
    }

    public s0(Callable callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f18358b);
        if (arrayList.isEmpty()) {
            ec.d.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((n0) obj).onResult(th2);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f18359c.post(new Runnable() { // from class: com.airbnb.lottie.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18351a.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        q0 q0Var = this.f18360d;
        if (q0Var == null) {
            return;
        }
        if (q0Var.b() != null) {
            i(q0Var.b());
        } else {
            f(q0Var.a());
        }
    }

    private synchronized void i(Object obj) {
        ArrayList arrayList = new ArrayList(this.f18357a);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ((n0) obj2).onResult(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(q0 q0Var) {
        if (this.f18360d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f18360d = q0Var;
        g();
    }

    public synchronized s0 c(n0 n0Var) {
        try {
            q0 q0Var = this.f18360d;
            if (q0Var != null && q0Var.a() != null) {
                n0Var.onResult(q0Var.a());
            }
            this.f18358b.add(n0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized s0 d(n0 n0Var) {
        try {
            q0 q0Var = this.f18360d;
            if (q0Var != null && q0Var.b() != null) {
                n0Var.onResult(q0Var.b());
            }
            this.f18357a.add(n0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public q0 e() {
        return this.f18360d;
    }

    public synchronized s0 j(n0 n0Var) {
        this.f18358b.remove(n0Var);
        return this;
    }

    public synchronized s0 k(n0 n0Var) {
        this.f18357a.remove(n0Var);
        return this;
    }

    public s0(Object obj) {
        this.f18357a = new LinkedHashSet(1);
        this.f18358b = new LinkedHashSet(1);
        this.f18359c = new Handler(Looper.getMainLooper());
        this.f18360d = null;
        l(new q0(obj));
    }

    s0(Callable callable, boolean z11) {
        this.f18357a = new LinkedHashSet(1);
        this.f18358b = new LinkedHashSet(1);
        this.f18359c = new Handler(Looper.getMainLooper());
        this.f18360d = null;
        if (z11) {
            try {
                l((q0) callable.call());
                return;
            } catch (Throwable th2) {
                l(new q0(th2));
                return;
            }
        }
        f18356e.execute(new a(this, callable));
    }
}
