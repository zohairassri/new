package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ez3 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ fz3 f25991a;

    ez3(fz3 fz3Var) {
        Objects.requireNonNull(fz3Var);
        this.f25991a = fz3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f25991a.zzf();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f25991a.h(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f25991a.f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f25991a.zzd();
    }
}
