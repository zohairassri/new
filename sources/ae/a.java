package ae;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import w4.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f819a = new C0027a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements d {
        b() {
        }

        @Override // ae.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class c implements g {
        c() {
        }

        @Override // ae.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface d {
        Object a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class e implements w4.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final w4.f f822c;

        e(w4.f fVar, d dVar, g gVar) {
            this.f822c = fVar;
            this.f820a = dVar;
            this.f821b = gVar;
        }

        @Override // w4.f
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).e().b(true);
            }
            this.f821b.a(obj);
            return this.f822c.a(obj);
        }

        @Override // w4.f
        public Object b() {
            Object objB = this.f822c.b();
            if (objB == null) {
                objB = this.f820a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    objB.getClass().toString();
                }
            }
            if (objB instanceof f) {
                ((f) objB).e().b(false);
            }
            return objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface f {
        ae.c e();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface g {
        void a(Object obj);
    }

    private static w4.f a(w4.f fVar, d dVar) {
        return b(fVar, dVar, c());
    }

    private static w4.f b(w4.f fVar, d dVar, g gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static g c() {
        return f819a;
    }

    public static w4.f d(int i11, d dVar) {
        return a(new h(i11), dVar);
    }

    public static w4.f e() {
        return f(20);
    }

    public static w4.f f(int i11) {
        return b(new h(i11), new b(), new c());
    }

    /* JADX INFO: renamed from: ae.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C0027a implements g {
        C0027a() {
        }

        @Override // ae.a.g
        public void a(Object obj) {
        }
    }
}
