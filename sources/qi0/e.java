package qi0;

import rx.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f122799a = new a();

    public static i a(ii0.a aVar) {
        return qi0.a.b(aVar);
    }

    public static i b() {
        return qi0.a.a();
    }

    public static i c() {
        return f122799a;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a implements i {
        a() {
        }

        @Override // rx.i
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // rx.i
        public void unsubscribe() {
        }
    }
}
