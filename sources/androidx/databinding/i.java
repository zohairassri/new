package androidx.databinding;

import androidx.databinding.c;
import androidx.databinding.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class i extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w4.h f7474f = new w4.h(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c.a f7475g = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends c.a {
        a() {
        }

        @Override // androidx.databinding.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m.a aVar, m mVar, int i11, b bVar) {
            if (i11 == 1) {
                aVar.e(mVar, bVar.f7476a, bVar.f7477b);
                return;
            }
            if (i11 == 2) {
                aVar.f(mVar, bVar.f7476a, bVar.f7477b);
                return;
            }
            if (i11 == 3) {
                aVar.g(mVar, bVar.f7476a, bVar.f7478c, bVar.f7477b);
            } else if (i11 != 4) {
                aVar.d(mVar);
            } else {
                aVar.h(mVar, bVar.f7476a, bVar.f7477b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7478c;

        b() {
        }
    }

    public i() {
        super(f7475g);
    }

    private static b o(int i11, int i12, int i13) {
        b bVar = (b) f7474f.b();
        if (bVar == null) {
            bVar = new b();
        }
        bVar.f7476a = i11;
        bVar.f7478c = i12;
        bVar.f7477b = i13;
        return bVar;
    }

    @Override // androidx.databinding.c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public synchronized void e(m mVar, int i11, b bVar) {
        super.e(mVar, i11, bVar);
        if (bVar != null) {
            f7474f.a(bVar);
        }
    }

    public void q(m mVar, int i11, int i12) {
        e(mVar, 1, o(i11, 0, i12));
    }

    public void r(m mVar, int i11, int i12) {
        e(mVar, 2, o(i11, 0, i12));
    }

    public void s(m mVar, int i11, int i12) {
        e(mVar, 4, o(i11, 0, i12));
    }
}
