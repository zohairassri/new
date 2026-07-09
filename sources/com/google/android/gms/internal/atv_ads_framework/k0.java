package com.google.android.gms.internal.atv_ads_framework;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class k0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f39940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f39941b;

    k0(Object obj) {
        this.f39941b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f39940a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f39940a) {
            throw new NoSuchElementException();
        }
        this.f39940a = true;
        return this.f39941b;
    }
}
