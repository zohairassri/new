package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class w implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40832a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t f40833b;

    w(t tVar) {
        this.f40833b = tVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40832a < this.f40833b.f40739a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f40832a >= this.f40833b.f40739a.length()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f40832a;
        this.f40832a = i11 + 1;
        return new t(String.valueOf(i11));
    }
}
