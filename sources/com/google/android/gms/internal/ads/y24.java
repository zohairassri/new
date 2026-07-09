package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class y24 extends AbstractSet {
    /* synthetic */ y24(byte[] bArr) {
    }

    static int e(Set set) {
        return set instanceof y24 ? ((y24) set).d() : set.size();
    }

    public abstract d34 a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    abstract int d();

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int iE;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (iE = e((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof y24) {
            ((y24) set).b();
            size = 0;
        } else {
            size = set.size();
        }
        if (d() < size) {
            return false;
        }
        d34 d34VarA = a();
        int i11 = 0;
        while (d34VarA.hasNext()) {
            if (!set.contains(d34VarA.next())) {
                return false;
            }
            i11++;
        }
        if (i11 == iE) {
            return true;
        }
        if (i11 < size) {
            return false;
        }
        Iterator it = set.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            it.next();
            i12++;
            if (i12 > i11) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
