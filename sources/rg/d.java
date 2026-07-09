package rg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements pg.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pg.k[] f124836a;

    public d(pg.k... listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f124836a = listeners;
    }

    @Override // pg.k
    public void a(String sessionId, boolean z11) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        for (pg.k kVar : this.f124836a) {
            kVar.a(sessionId, z11);
        }
    }
}
