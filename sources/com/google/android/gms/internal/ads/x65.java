package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x65 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f37805a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y65 f37806b;

    x65(y65 y65Var) {
        this.f37806b = y65Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f37805a;
        y65 y65Var = this.f37806b;
        return i11 < y65Var.f38339a.size() || y65Var.f38340b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i11 = this.f37805a;
        y65 y65Var = this.f37806b;
        List list = y65Var.f38339a;
        if (i11 >= list.size()) {
            list.add(y65Var.f38340b.next());
            return next();
        }
        int i12 = this.f37805a;
        this.f37805a = i12 + 1;
        return list.get(i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
