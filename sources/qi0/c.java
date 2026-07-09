package qi0;

import java.util.concurrent.atomic.AtomicReference;
import rx.i;
import w.c1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference f122793a = new AtomicReference(new a(false, e.b()));

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f122794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i f122795b;

        a(boolean z11, i iVar) {
            this.f122794a = z11;
            this.f122795b = iVar;
        }

        a a(i iVar) {
            return new a(this.f122794a, iVar);
        }

        a b() {
            return new a(true, this.f122795b);
        }
    }

    public void a(i iVar) {
        a aVar;
        if (iVar == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        AtomicReference atomicReference = this.f122793a;
        do {
            aVar = (a) atomicReference.get();
            if (aVar.f122794a) {
                iVar.unsubscribe();
                return;
            }
        } while (!c1.a(atomicReference, aVar, aVar.a(iVar)));
    }

    @Override // rx.i
    public boolean isUnsubscribed() {
        return ((a) this.f122793a.get()).f122794a;
    }

    @Override // rx.i
    public void unsubscribe() {
        a aVar;
        AtomicReference atomicReference = this.f122793a;
        do {
            aVar = (a) atomicReference.get();
            if (aVar.f122794a) {
                return;
            }
        } while (!c1.a(atomicReference, aVar, aVar.b()));
        aVar.f122795b.unsubscribe();
    }
}
