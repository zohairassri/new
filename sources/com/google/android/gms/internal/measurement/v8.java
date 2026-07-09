package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class v8 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f40793a;

    public v8(Iterator it) {
        this.f40793a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40793a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f40793a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40793a.remove();
    }
}
