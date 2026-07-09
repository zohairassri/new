package androidx.media3.exoplayer.source;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k6.m f10449c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f10448b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10447a = -1;

    public j0(k6.m mVar) {
        this.f10449c = mVar;
    }

    public void a(int i11, Object obj) {
        if (this.f10447a == -1) {
            k6.a.g(this.f10448b.size() == 0);
            this.f10447a = 0;
        }
        if (this.f10448b.size() > 0) {
            SparseArray sparseArray = this.f10448b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            k6.a.a(i11 >= iKeyAt);
            if (iKeyAt == i11) {
                k6.m mVar = this.f10449c;
                SparseArray sparseArray2 = this.f10448b;
                mVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f10448b.append(i11, obj);
    }

    public void b() {
        for (int i11 = 0; i11 < this.f10448b.size(); i11++) {
            this.f10449c.accept(this.f10448b.valueAt(i11));
        }
        this.f10447a = -1;
        this.f10448b.clear();
    }

    public void c(int i11) {
        for (int size = this.f10448b.size() - 1; size >= 0 && i11 < this.f10448b.keyAt(size); size--) {
            this.f10449c.accept(this.f10448b.valueAt(size));
            this.f10448b.removeAt(size);
        }
        this.f10447a = this.f10448b.size() > 0 ? Math.min(this.f10447a, this.f10448b.size() - 1) : -1;
    }

    public void d(int i11) {
        int i12 = 0;
        while (i12 < this.f10448b.size() - 1) {
            int i13 = i12 + 1;
            if (i11 < this.f10448b.keyAt(i13)) {
                return;
            }
            this.f10449c.accept(this.f10448b.valueAt(i12));
            this.f10448b.removeAt(i12);
            int i14 = this.f10447a;
            if (i14 > 0) {
                this.f10447a = i14 - 1;
            }
            i12 = i13;
        }
    }

    public Object e(int i11) {
        if (this.f10447a == -1) {
            this.f10447a = 0;
        }
        while (true) {
            int i12 = this.f10447a;
            if (i12 <= 0 || i11 >= this.f10448b.keyAt(i12)) {
                break;
            }
            this.f10447a--;
        }
        while (this.f10447a < this.f10448b.size() - 1 && i11 >= this.f10448b.keyAt(this.f10447a + 1)) {
            this.f10447a++;
        }
        return this.f10448b.valueAt(this.f10447a);
    }

    public Object f() {
        return this.f10448b.valueAt(r1.size() - 1);
    }

    public boolean g() {
        return this.f10448b.size() == 0;
    }
}
