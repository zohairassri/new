package h3;

import h3.t2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f99877a = a.f99878a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f99878a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final t2 f99879b = new t2() { // from class: h3.q2
            @Override // h3.t2
            public final boolean a(e2.h hVar, e2.h hVar2) {
                return t2.a.d(hVar, hVar2);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final t2 f99880c = new t2() { // from class: h3.r2
            @Override // h3.t2
            public final boolean a(e2.h hVar, e2.h hVar2) {
                return t2.a.e(hVar, hVar2);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final t2 f99881d = new t2() { // from class: h3.s2
            @Override // h3.t2
            public final boolean a(e2.h hVar, e2.h hVar2) {
                return t2.a.f(hVar, hVar2);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(e2.h hVar, e2.h hVar2) {
            return hVar.t(hVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(e2.h hVar, e2.h hVar2) {
            return !hVar2.s() && hVar.j() >= hVar2.j() && hVar.k() <= hVar2.k() && hVar.m() >= hVar2.m() && hVar.e() <= hVar2.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(e2.h hVar, e2.h hVar2) {
            return hVar2.b(hVar.h());
        }

        public final t2 g() {
            return f99879b;
        }

        public final t2 h() {
            return f99881d;
        }
    }

    boolean a(e2.h hVar, e2.h hVar2);
}
