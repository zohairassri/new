package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f39905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39906b = 2;

    protected f() {
    }

    protected final Object a() {
        this.f39906b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f39906b;
        if (i11 == 4) {
            throw new IllegalStateException();
        }
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 0) {
            return true;
        }
        if (i12 != 2) {
            this.f39906b = 4;
            this.f39905a = zza();
            if (this.f39906b != 3) {
                this.f39906b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f39906b = 2;
        Object obj = this.f39905a;
        this.f39905a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract Object zza();
}
