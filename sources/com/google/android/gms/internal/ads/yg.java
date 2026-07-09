package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f38485a;

    public yg(Handler handler) {
        this.f38485a = new wg(this, handler);
    }

    public final void a(fh fhVar, kh khVar, Runnable runnable) {
        fhVar.r();
        fhVar.b("post-response");
        ((wg) this.f38485a).f37382a.post(new xg(fhVar, khVar, runnable));
    }

    public final void b(fh fhVar, zzash zzashVar) {
        fhVar.b("post-error");
        ((wg) this.f38485a).f37382a.post(new xg(fhVar, kh.b(zzashVar), null));
    }
}
