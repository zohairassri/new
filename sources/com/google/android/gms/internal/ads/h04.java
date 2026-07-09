package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class h04 extends j04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f27463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f27464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f27465c;

    h04(int i11) {
        jz3.b(i11, "initialCapacity");
        this.f27463a = new Object[i11];
        this.f27464b = 0;
    }

    private final void f(int i11) {
        int length = this.f27463a.length;
        int iB = j04.b(length, this.f27464b + i11);
        if (iB > length || this.f27465c) {
            this.f27463a = Arrays.copyOf(this.f27463a, iB);
            this.f27465c = false;
        }
    }

    public final h04 c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.f27463a;
        int i11 = this.f27464b;
        this.f27464b = i11 + 1;
        objArr[i11] = obj;
        return this;
    }

    final void d(Object[] objArr, int i11) {
        h24.a(objArr, 2);
        f(2);
        System.arraycopy(objArr, 0, this.f27463a, this.f27464b, 2);
        this.f27464b += 2;
    }

    public final j04 e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof k04) {
                this.f27464b = ((k04) collection).l(this.f27463a, this.f27464b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
