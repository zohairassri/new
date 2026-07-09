package zd;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f142258a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f142259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f142260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f142261d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f142262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f142263b;

        a(Object obj, int i11) {
            this.f142262a = obj;
            this.f142263b = i11;
        }
    }

    public h(long j11) {
        this.f142259b = j11;
        this.f142260c = j11;
    }

    private void f() {
        m(this.f142260c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f142258a.get(obj);
        return aVar != null ? aVar.f142262a : null;
    }

    public synchronized long h() {
        return this.f142260c;
    }

    protected int i(Object obj) {
        return 1;
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i11 = i(obj2);
        long j11 = i11;
        if (j11 >= this.f142260c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f142261d += j11;
        }
        a aVar = (a) this.f142258a.put(obj, obj2 == null ? null : new a(obj2, i11));
        if (aVar != null) {
            this.f142261d -= (long) aVar.f142263b;
            if (!aVar.f142262a.equals(obj2)) {
                j(obj, aVar.f142262a);
            }
        }
        f();
        return aVar != null ? aVar.f142262a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f142258a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f142261d -= (long) aVar.f142263b;
        return aVar.f142262a;
    }

    protected synchronized void m(long j11) {
        while (this.f142261d > j11) {
            Iterator it = this.f142258a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f142261d -= (long) aVar.f142263b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f142262a);
        }
    }

    protected void j(Object obj, Object obj2) {
    }
}
