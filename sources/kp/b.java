package kp;

import cp.y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rp.a f111954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f111955b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1354b f111956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rp.a aVar, Class cls, InterfaceC1354b interfaceC1354b) {
            super(aVar, cls, null);
            this.f111956c = interfaceC1354b;
        }

        @Override // kp.b
        public cp.g d(q qVar, y yVar) {
            return this.f111956c.a(qVar, yVar);
        }
    }

    /* JADX INFO: renamed from: kp.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC1354b {
        cp.g a(q qVar, y yVar);
    }

    /* synthetic */ b(rp.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static b a(InterfaceC1354b interfaceC1354b, rp.a aVar, Class cls) {
        return new a(aVar, cls, interfaceC1354b);
    }

    public final rp.a b() {
        return this.f111954a;
    }

    public final Class c() {
        return this.f111955b;
    }

    public abstract cp.g d(q qVar, y yVar);

    private b(rp.a aVar, Class cls) {
        this.f111954a = aVar;
        this.f111955b = cls;
    }
}
