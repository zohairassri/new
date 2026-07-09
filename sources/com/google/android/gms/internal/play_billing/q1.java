package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class q1 extends o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42529b;

    q1(Object obj) {
        this.f42528a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f42529b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f42529b) {
            throw new NoSuchElementException();
        }
        this.f42529b = true;
        return this.f42528a;
    }
}
