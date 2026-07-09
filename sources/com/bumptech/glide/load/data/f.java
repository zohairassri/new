package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a f18929b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18930a = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            zd.k.d(obj);
            aVar = (e.a) this.f18930a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f18930a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f18929b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f18930a.put(aVar.a(), aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f18931a;

        b(Object obj) {
            this.f18931a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f18931a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }
}
