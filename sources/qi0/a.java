package qi0;

import java.util.concurrent.atomic.AtomicReference;
import rx.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ii0.a f122789b = new C1637a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference f122790a;

    public a() {
        this.f122790a = new AtomicReference();
    }

    public static a a() {
        return new a();
    }

    public static a b(ii0.a aVar) {
        return new a(aVar);
    }

    @Override // rx.i
    public boolean isUnsubscribed() {
        return this.f122790a.get() == f122789b;
    }

    @Override // rx.i
    public final void unsubscribe() {
        ii0.a aVar;
        ii0.a aVar2 = (ii0.a) this.f122790a.get();
        ii0.a aVar3 = f122789b;
        if (aVar2 == aVar3 || (aVar = (ii0.a) this.f122790a.getAndSet(aVar3)) == null || aVar == aVar3) {
            return;
        }
        aVar.call();
    }

    private a(ii0.a aVar) {
        this.f122790a = new AtomicReference(aVar);
    }

    /* JADX INFO: renamed from: qi0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class C1637a implements ii0.a {
        C1637a() {
        }

        @Override // ii0.a
        public void call() {
        }
    }
}
