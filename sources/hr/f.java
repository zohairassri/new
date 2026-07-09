package hr;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f102555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f102556c;

        public a(int i11, int i12, int i13) {
            this.f102554a = i11;
            this.f102555b = i12;
            this.f102556c = i13;
        }

        public a a(a aVar) {
            return new a(this.f102554a - aVar.d(), this.f102555b - aVar.c(), this.f102556c - aVar.b());
        }

        public int b() {
            return this.f102556c;
        }

        public int c() {
            return this.f102555b;
        }

        public int d() {
            return this.f102554a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        int i13 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i11 = 0;
            i12 = 0;
        } else {
            int i14 = 0;
            i11 = 0;
            i12 = 0;
            while (i13 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i13);
                int iValueAt = sparseIntArray.valueAt(i13);
                i14 += iValueAt;
                if (iKeyAt > 700) {
                    i12 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i11 += iValueAt;
                }
                i13++;
            }
            i13 = i14;
        }
        return new a(i13, i11, i12);
    }
}
