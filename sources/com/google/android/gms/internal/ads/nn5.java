package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class nn5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final np1 f31515c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f31514b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31513a = -1;

    public nn5(np1 np1Var) {
        this.f31515c = np1Var;
    }

    public final Object a(int i11) {
        SparseArray sparseArray;
        if (this.f31513a == -1) {
            this.f31513a = 0;
        }
        while (true) {
            int i12 = this.f31513a;
            if (i12 <= 0 || i11 >= this.f31514b.keyAt(i12)) {
                break;
            }
            this.f31513a--;
        }
        while (true) {
            int i13 = this.f31513a;
            sparseArray = this.f31514b;
            if (i13 >= sparseArray.size() - 1 || i11 < sparseArray.keyAt(this.f31513a + 1)) {
                break;
            }
            this.f31513a++;
        }
        return sparseArray.valueAt(this.f31513a);
    }

    public final void b(int i11, Object obj) {
        if (this.f31513a == -1) {
            jx3.i(this.f31514b.size() == 0);
            this.f31513a = 0;
        }
        SparseArray sparseArray = this.f31514b;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            jx3.a(i11 >= iKeyAt);
            if (iKeyAt == i11) {
                this.f31515c.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i11, obj);
    }

    public final Object c() {
        return this.f31514b.valueAt(r1.size() - 1);
    }

    public final void d(int i11) {
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f31514b;
            if (i12 >= sparseArray.size() - 1) {
                return;
            }
            int i13 = i12 + 1;
            if (i11 < sparseArray.keyAt(i13)) {
                return;
            }
            this.f31515c.zza(sparseArray.valueAt(i12));
            sparseArray.removeAt(i12);
            int i14 = this.f31513a;
            if (i14 > 0) {
                this.f31513a = i14 - 1;
            }
            i12 = i13;
        }
    }

    public final void e() {
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f31514b;
            if (i11 >= sparseArray.size()) {
                this.f31513a = -1;
                sparseArray.clear();
                return;
            } else {
                this.f31515c.zza(sparseArray.valueAt(i11));
                i11++;
            }
        }
    }

    public final boolean f() {
        return this.f31514b.size() == 0;
    }
}
