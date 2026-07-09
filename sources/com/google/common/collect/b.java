package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f45843a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f45844b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f45843a = a.FAILED;
        this.f45844b = a();
        if (this.f45843a == a.DONE) {
            return false;
        }
        this.f45843a = a.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f45843a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zo.o.p(this.f45843a != a.FAILED);
        int iOrdinal = this.f45843a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f45843a = a.NOT_READY;
        Object objA = o0.a(this.f45844b);
        this.f45844b = null;
        return objA;
    }
}
