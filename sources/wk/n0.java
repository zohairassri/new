package wk;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ml.h f135790c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f135789b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f135788a = -1;

    public n0(ml.h hVar) {
        this.f135790c = hVar;
    }

    public void a(int i11, Object obj) {
        if (this.f135788a == -1) {
            ml.a.f(this.f135789b.size() == 0);
            this.f135788a = 0;
        }
        if (this.f135789b.size() > 0) {
            SparseArray sparseArray = this.f135789b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            ml.a.a(i11 >= iKeyAt);
            if (iKeyAt == i11) {
                ml.h hVar = this.f135790c;
                SparseArray sparseArray2 = this.f135789b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f135789b.append(i11, obj);
    }

    public void b() {
        for (int i11 = 0; i11 < this.f135789b.size(); i11++) {
            this.f135790c.accept(this.f135789b.valueAt(i11));
        }
        this.f135788a = -1;
        this.f135789b.clear();
    }

    public void c(int i11) {
        for (int size = this.f135789b.size() - 1; size >= 0 && i11 < this.f135789b.keyAt(size); size--) {
            this.f135790c.accept(this.f135789b.valueAt(size));
            this.f135789b.removeAt(size);
        }
        this.f135788a = this.f135789b.size() > 0 ? Math.min(this.f135788a, this.f135789b.size() - 1) : -1;
    }

    public void d(int i11) {
        int i12 = 0;
        while (i12 < this.f135789b.size() - 1) {
            int i13 = i12 + 1;
            if (i11 < this.f135789b.keyAt(i13)) {
                return;
            }
            this.f135790c.accept(this.f135789b.valueAt(i12));
            this.f135789b.removeAt(i12);
            int i14 = this.f135788a;
            if (i14 > 0) {
                this.f135788a = i14 - 1;
            }
            i12 = i13;
        }
    }

    public Object e(int i11) {
        if (this.f135788a == -1) {
            this.f135788a = 0;
        }
        while (true) {
            int i12 = this.f135788a;
            if (i12 <= 0 || i11 >= this.f135789b.keyAt(i12)) {
                break;
            }
            this.f135788a--;
        }
        while (this.f135788a < this.f135789b.size() - 1 && i11 >= this.f135789b.keyAt(this.f135788a + 1)) {
            this.f135788a++;
        }
        return this.f135789b.valueAt(this.f135788a);
    }

    public Object f() {
        return this.f135789b.valueAt(r1.size() - 1);
    }

    public boolean g() {
        return this.f135789b.size() == 0;
    }
}
