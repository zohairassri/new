package js;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import sd0.t;
import w.c1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a[] f105947b = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AtomicReference f105948a = new AtomicReference(f105947b);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a extends AtomicBoolean implements vd0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final t f105949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f105950b;

        a(t tVar, c cVar) {
            this.f105949a = tVar;
            this.f105950b = cVar;
        }

        public void a(Object obj) {
            if (get()) {
                return;
            }
            this.f105949a.onNext(obj);
        }

        @Override // vd0.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f105950b.h(this);
            }
        }

        @Override // vd0.b
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return get();
        }
    }

    c() {
    }

    public static c g() {
        return new c();
    }

    @Override // yd0.g
    public void accept(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        for (a aVar : (a[]) this.f105948a.get()) {
            aVar.a(obj);
        }
    }

    void f(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f105948a.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!c1.a(this.f105948a, aVarArr, aVarArr2));
    }

    void h(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f105948a.get();
            if (aVarArr == f105947b) {
                return;
            }
            int length = aVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (aVarArr[i11] == aVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = f105947b;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i11);
                System.arraycopy(aVarArr, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!c1.a(this.f105948a, aVarArr, aVarArr2));
    }

    @Override // sd0.n
    protected void subscribeActual(t tVar) {
        a aVar = new a(tVar, this);
        tVar.onSubscribe(aVar);
        f(aVar);
        if (aVar.getDisposed()) {
            h(aVar);
        }
    }
}
