package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class rz3 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uz3 f34434a;

    /* synthetic */ rz3(uz3 uz3Var, byte[] bArr) {
        Objects.requireNonNull(uz3Var);
        this.f34434a = uz3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f34434a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f34434a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        uz3 uz3Var = this.f34434a;
        Map mapH = uz3Var.h();
        return mapH != null ? mapH.keySet().iterator() : new mz3(uz3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        uz3 uz3Var = this.f34434a;
        Map mapH = uz3Var.h();
        return mapH != null ? mapH.keySet().remove(obj) : uz3Var.o(obj) != uz3.f36515l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34434a.size();
    }
}
