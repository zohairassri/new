package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ky3 extends d34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f29911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29912b = 2;

    protected ky3() {
    }

    protected final Object a() {
        this.f29912b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        jx3.i(this.f29912b != 4);
        int i11 = this.f29912b;
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 == 0) {
            return true;
        }
        if (i12 != 2) {
            this.f29912b = 4;
            this.f29911a = zza();
            if (this.f29912b != 3) {
                this.f29912b = 1;
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
        this.f29912b = 2;
        Object obj = this.f29911a;
        this.f29911a = null;
        return obj;
    }

    protected abstract Object zza();
}
