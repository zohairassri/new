package hd;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f100673a = zd.l.g(20);

    c() {
    }

    abstract l a();

    l b() {
        l lVar = (l) this.f100673a.poll();
        return lVar == null ? a() : lVar;
    }

    public void c(l lVar) {
        if (this.f100673a.size() < 20) {
            this.f100673a.offer(lVar);
        }
    }
}
