package o6;

import androidx.media3.datasource.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.media3.datasource.cache.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f120075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeSet f120076b = new TreeSet(new Comparator() { // from class: o6.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return h.h((c) obj, (c) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f120077c;

    public h(long j11) {
        this.f120075a = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(c cVar, c cVar2) {
        long j11 = cVar.f120069f;
        long j12 = cVar2.f120069f;
        return j11 - j12 == 0 ? cVar.compareTo(cVar2) : j11 < j12 ? -1 : 1;
    }

    private void i(Cache cache, long j11) {
        while (this.f120077c + j11 > this.f120075a && !this.f120076b.isEmpty()) {
            cache.h((c) this.f120076b.first());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void a(Cache cache, c cVar) {
        this.f120076b.add(cVar);
        this.f120077c += cVar.f120066c;
        i(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void b(Cache cache, c cVar) {
        this.f120076b.remove(cVar);
        this.f120077c -= cVar.f120066c;
    }

    @Override // androidx.media3.datasource.cache.Cache.a
    public void c(Cache cache, c cVar, c cVar2) {
        b(cache, cVar);
        a(cache, cVar2);
    }

    @Override // androidx.media3.datasource.cache.b
    public boolean d() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.b
    public void e(Cache cache, String str, long j11, long j12) {
        if (j12 != -1) {
            i(cache, j12);
        }
    }

    @Override // androidx.media3.datasource.cache.b
    public void f() {
    }
}
