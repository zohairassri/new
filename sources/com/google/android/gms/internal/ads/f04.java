package com.google.android.gms.internal.ads;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f04 extends c04 implements Queue {
    protected f04() {
    }

    @Override // java.util.Queue
    public final Object element() {
        return x().element();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return x().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return x().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return x().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return x().remove();
    }

    protected abstract Queue x();
}
