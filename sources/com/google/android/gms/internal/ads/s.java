package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f34436a = new CopyOnWriteArrayList();

    public final void a(Handler handler, t tVar) {
        b(tVar);
        this.f34436a.add(new r(handler, tVar));
    }

    public final void b(t tVar) {
        CopyOnWriteArrayList<r> copyOnWriteArrayList = this.f34436a;
        for (r rVar : copyOnWriteArrayList) {
            if (rVar.c() == tVar) {
                rVar.a();
                copyOnWriteArrayList.remove(rVar);
            }
        }
    }

    public final void c(final int i11, final long j11, final long j12) {
        for (final r rVar : this.f34436a) {
            if (!rVar.d()) {
                rVar.b().post(new Runnable() { // from class: com.google.android.gms.internal.ads.q
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        rVar.c().S(i11, j11, j12);
                    }
                });
            }
        }
    }
}
