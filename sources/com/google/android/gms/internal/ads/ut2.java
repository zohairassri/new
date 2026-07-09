package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ut2 implements rv1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f36323b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f36324a;

    public ut2(Handler handler) {
        this.f36324a = handler;
    }

    static /* synthetic */ void b(ts2 ts2Var) {
        List list = f36323b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(ts2Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static ts2 c() {
        ts2 ts2Var;
        List list = f36323b;
        synchronized (list) {
            try {
                ts2Var = list.isEmpty() ? new ts2(null) : (ts2) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ts2Var;
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final qu1 a(int i11, int i12, int i13) {
        Handler handler = this.f36324a;
        ts2 ts2VarC = c();
        ts2VarC.a(handler.obtainMessage(i11, i12, i13), this);
        return ts2VarC;
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final boolean f(int i11, long j11) {
        return this.f36324a.sendEmptyMessageAtTime(2, j11);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final boolean g(Runnable runnable, long j11) {
        return this.f36324a.postDelayed(runnable, 1000L);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final boolean h(qu1 qu1Var) {
        return ((ts2) qu1Var).b(this.f36324a);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final boolean i(Runnable runnable) {
        return this.f36324a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final void j(Object obj) {
        this.f36324a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final void k(Runnable runnable) {
        this.f36324a.removeCallbacks(runnable);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final qu1 l(int i11, Object obj) {
        Handler handler = this.f36324a;
        ts2 ts2VarC = c();
        ts2VarC.a(handler.obtainMessage(i11, obj), this);
        return ts2VarC;
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final qu1 m(int i11, int i12, int i13, Object obj) {
        Handler handler = this.f36324a;
        ts2 ts2VarC = c();
        ts2VarC.a(handler.obtainMessage(31, 0, 0, obj), this);
        return ts2VarC;
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final qu1 q(int i11) {
        Handler handler = this.f36324a;
        ts2 ts2VarC = c();
        ts2VarC.a(handler.obtainMessage(i11), this);
        return ts2VarC;
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final void u(int i11) {
        this.f36324a.removeMessages(i11);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final Looper zza() {
        return this.f36324a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final boolean zzb(int i11) {
        return this.f36324a.hasMessages(i11);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final boolean zzh(int i11) {
        return this.f36324a.sendEmptyMessage(i11);
    }

    @Override // com.google.android.gms.internal.ads.rv1
    public final boolean zzi(int i11, int i12) {
        return this.f36324a.sendEmptyMessageDelayed(i11, i12);
    }
}
