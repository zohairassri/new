package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class i14 extends i24 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f28149a;

    i14(Comparator comparator) {
        this.f28149a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.i24, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f28149a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i14) {
            return this.f28149a.equals(((i14) obj).f28149a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28149a.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.f28149a.toString().concat(".lexicographical()");
    }
}
