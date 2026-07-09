package ud;

import ed.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f131324a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f131325b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f131326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f131327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j f131328c;

        public a(Class cls, Class cls2, j jVar) {
            this.f131326a = cls;
            this.f131327b = cls2;
            this.f131328c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f131326a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f131327b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f131324a.contains(str)) {
                this.f131324a.add(str);
            }
            arrayList = (List) this.f131325b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f131325b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f131324a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f131325b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f131328c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f131324a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f131325b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f131327b)) {
                        arrayList.add(aVar.f131327b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(String str, j jVar, Class cls, Class cls2) {
        c(str).add(0, new a(cls, cls2, jVar));
    }

    public synchronized void f(List list) {
        try {
            ArrayList arrayList = new ArrayList(this.f131324a);
            this.f131324a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f131324a.add((String) it.next());
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.f131324a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
