package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class p1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f42515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f42517c;

    public p1(Iterator it) {
        it.getClass();
        this.f42515a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42516b || this.f42515a.hasNext();
    }

    @Override // com.google.android.gms.internal.play_billing.x1, java.util.Iterator
    public final Object next() {
        if (!this.f42516b) {
            return this.f42515a.next();
        }
        Object obj = this.f42517c;
        this.f42516b = false;
        this.f42517c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f42516b) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f42515a.remove();
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final Object zza() {
        if (!this.f42516b) {
            this.f42517c = this.f42515a.next();
            this.f42516b = true;
        }
        return this.f42517c;
    }
}
