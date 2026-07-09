package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f45352e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f45353a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f45354b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0333c f45355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0333c f45356d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0333c) message.obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface b {
        void a();

        void b(int i11);
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C0333c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f45358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f45359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f45360c;

        C0333c(int i11, b bVar) {
            this.f45358a = new WeakReference(bVar);
            this.f45359b = i11;
        }

        boolean a(b bVar) {
            return bVar != null && this.f45358a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(C0333c c0333c, int i11) {
        b bVar = (b) c0333c.f45358a.get();
        if (bVar == null) {
            return false;
        }
        this.f45354b.removeCallbacksAndMessages(c0333c);
        bVar.b(i11);
        return true;
    }

    static c c() {
        if (f45352e == null) {
            f45352e = new c();
        }
        return f45352e;
    }

    private boolean f(b bVar) {
        C0333c c0333c = this.f45355c;
        return c0333c != null && c0333c.a(bVar);
    }

    private boolean g(b bVar) {
        C0333c c0333c = this.f45356d;
        return c0333c != null && c0333c.a(bVar);
    }

    private void l(C0333c c0333c) {
        int i11 = c0333c.f45359b;
        if (i11 == -2) {
            return;
        }
        if (i11 <= 0) {
            i11 = i11 == -1 ? 1500 : 2750;
        }
        this.f45354b.removeCallbacksAndMessages(c0333c);
        Handler handler = this.f45354b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0333c), i11);
    }

    private void n() {
        C0333c c0333c = this.f45356d;
        if (c0333c != null) {
            this.f45355c = c0333c;
            this.f45356d = null;
            b bVar = (b) c0333c.f45358a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f45355c = null;
            }
        }
    }

    public void b(b bVar, int i11) {
        synchronized (this.f45353a) {
            try {
                if (f(bVar)) {
                    a(this.f45355c, i11);
                } else if (g(bVar)) {
                    a(this.f45356d, i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(C0333c c0333c) {
        synchronized (this.f45353a) {
            try {
                if (this.f45355c == c0333c || this.f45356d == c0333c) {
                    a(c0333c, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z11;
        synchronized (this.f45353a) {
            try {
                z11 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z11;
    }

    public void h(b bVar) {
        synchronized (this.f45353a) {
            try {
                if (f(bVar)) {
                    this.f45355c = null;
                    if (this.f45356d != null) {
                        n();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f45353a) {
            try {
                if (f(bVar)) {
                    l(this.f45355c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f45353a) {
            try {
                if (f(bVar)) {
                    C0333c c0333c = this.f45355c;
                    if (!c0333c.f45360c) {
                        c0333c.f45360c = true;
                        this.f45354b.removeCallbacksAndMessages(c0333c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f45353a) {
            try {
                if (f(bVar)) {
                    C0333c c0333c = this.f45355c;
                    if (c0333c.f45360c) {
                        c0333c.f45360c = false;
                        l(c0333c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(int i11, b bVar) {
        synchronized (this.f45353a) {
            try {
                if (f(bVar)) {
                    C0333c c0333c = this.f45355c;
                    c0333c.f45359b = i11;
                    this.f45354b.removeCallbacksAndMessages(c0333c);
                    l(this.f45355c);
                    return;
                }
                if (g(bVar)) {
                    this.f45356d.f45359b = i11;
                } else {
                    this.f45356d = new C0333c(i11, bVar);
                }
                C0333c c0333c2 = this.f45355c;
                if (c0333c2 == null || !a(c0333c2, 4)) {
                    this.f45355c = null;
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
