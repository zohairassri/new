package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class u24 extends y24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Set f35879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f35880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u24(Set set, Set set2) {
        super(null);
        this.f35879a = set;
        this.f35880b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d34 iterator() {
        return new t24(this, this.f35879a, this.f35880b);
    }

    @Override // com.google.android.gms.internal.ads.y24
    final int b() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f35879a.contains(obj) && this.f35880b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f35879a.containsAll(collection) && this.f35880b.containsAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.y24
    final int d() {
        return Math.min(y24.e(this.f35879a), y24.e(this.f35880b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f35880b, this.f35879a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f35879a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (this.f35880b.contains(it.next())) {
                i11++;
            }
        }
        return i11;
    }
}
