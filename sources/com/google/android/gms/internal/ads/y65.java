package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class y65 extends AbstractList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z65 f38338c = z65.b(y65.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f38339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterator f38340b;

    public y65(List list, Iterator it) {
        this.f38339a = list;
        this.f38340b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        List list = this.f38339a;
        if (list.size() > i11) {
            return list.get(i11);
        }
        Iterator it = this.f38340b;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x65(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        z65 z65Var = f38338c;
        z65Var.a("potentially expensive size() call");
        z65Var.a("blowup running");
        while (true) {
            Iterator it = this.f38340b;
            if (!it.hasNext()) {
                return this.f38339a.size();
            }
            this.f38339a.add(it.next());
        }
    }
}
