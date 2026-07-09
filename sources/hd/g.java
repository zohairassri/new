package hd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f100674a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f100675b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f100676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f100677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f100678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f100679d;

        a() {
            this(null);
        }

        public void a(Object obj) {
            if (this.f100677b == null) {
                this.f100677b = new ArrayList();
            }
            this.f100677b.add(obj);
        }

        public Object b() {
            int iC = c();
            if (iC > 0) {
                return this.f100677b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List list = this.f100677b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f100679d = this;
            this.f100678c = this;
            this.f100676a = obj;
        }
    }

    g() {
    }

    private void b(a aVar) {
        e(aVar);
        a aVar2 = this.f100674a;
        aVar.f100679d = aVar2;
        aVar.f100678c = aVar2.f100678c;
        g(aVar);
    }

    private void c(a aVar) {
        e(aVar);
        a aVar2 = this.f100674a;
        aVar.f100679d = aVar2.f100679d;
        aVar.f100678c = aVar2;
        g(aVar);
    }

    private static void e(a aVar) {
        a aVar2 = aVar.f100679d;
        aVar2.f100678c = aVar.f100678c;
        aVar.f100678c.f100679d = aVar2;
    }

    private static void g(a aVar) {
        aVar.f100678c.f100679d = aVar;
        aVar.f100679d.f100678c = aVar;
    }

    public Object a(l lVar) {
        a aVar = (a) this.f100675b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            this.f100675b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(l lVar, Object obj) {
        a aVar = (a) this.f100675b.get(lVar);
        if (aVar == null) {
            aVar = new a(lVar);
            c(aVar);
            this.f100675b.put(lVar, aVar);
        } else {
            lVar.a();
        }
        aVar.a(obj);
    }

    public Object f() {
        for (a aVar = this.f100674a.f100679d; !aVar.equals(this.f100674a); aVar = aVar.f100679d) {
            Object objB = aVar.b();
            if (objB != null) {
                return objB;
            }
            e(aVar);
            this.f100675b.remove(aVar.f100676a);
            ((l) aVar.f100676a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f100674a.f100678c;
        boolean z11 = false;
        while (!aVar.equals(this.f100674a)) {
            sb2.append('{');
            sb2.append(aVar.f100676a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f100678c;
            z11 = true;
        }
        if (z11) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
