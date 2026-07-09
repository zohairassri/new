package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class da2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f24953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ fe2 f24955c;

    public da2(fe2 fe2Var, c82 c82Var, Executor executor) {
        Objects.requireNonNull(fe2Var);
        this.f24955c = fe2Var;
        this.f24953a = new WeakReference(c82Var);
        this.f24954b = executor;
    }

    public final boolean a() {
        return this.f24953a.get() == null;
    }

    public final void b() {
        this.f24954b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.d92
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f24945a.c();
            }
        });
    }

    final /* synthetic */ void c() {
        c82 c82Var = (c82) this.f24953a.get();
        if (c82Var != null) {
            c82Var.zza(this.f24955c.c());
        }
    }
}
