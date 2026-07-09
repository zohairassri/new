package h90;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ve0.a f100557a;

        a(ve0.a aVar) {
            this.f100557a = aVar;
        }

        @Override // ve0.a
        public Object get() {
            return this.f100557a.get();
        }
    }

    public static i a(ve0.a aVar) {
        h.b(aVar);
        return aVar instanceof i ? (i) aVar : new a(aVar);
    }
}
