package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class vh4 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f36811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator f36812b;

    /* synthetic */ vh4(Iterator it, Iterator it2, byte[] bArr) {
        this.f36811a = it;
        this.f36812b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36811a.hasNext() || this.f36812b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f36811a;
        return it.hasNext() ? it.next() : this.f36812b.next();
    }
}
