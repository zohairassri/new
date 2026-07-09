package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g14 extends d34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26788b;

    g14(Object obj) {
        this.f26787a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f26788b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f26788b) {
            throw new NoSuchElementException();
        }
        this.f26788b = true;
        return this.f26787a;
    }
}
