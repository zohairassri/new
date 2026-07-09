package com.google.android.gms.internal.atv_ads_framework;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b4 extends AbstractList implements RandomAccess, q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q2 f39849a;

    public b4(q2 q2Var) {
        this.f39849a = q2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((p2) this.f39849a).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a4(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new z3(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39849a.size();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.q2
    public final Object t(int i11) {
        return this.f39849a.t(i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.q2
    public final List zzh() {
        return this.f39849a.zzh();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.q2
    public final q2 zzd() {
        return this;
    }
}
