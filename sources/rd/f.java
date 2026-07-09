package rd;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f124742a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f124743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f124744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f124745c;

        a(Class cls, Class cls2, e eVar) {
            this.f124743a = cls;
            this.f124744b = cls2;
            this.f124745c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f124743a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f124744b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f124742a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f124745c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f124742a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f124744b)) {
                arrayList.add(aVar.f124744b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f124742a.add(new a(cls, cls2, eVar));
    }
}
