package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class a4 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f39839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b4 f39840b;

    a4(b4 b4Var) {
        this.f39840b = b4Var;
        this.f39839a = b4Var.f39849a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39839a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f39839a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
