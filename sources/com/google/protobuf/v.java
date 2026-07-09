package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class v implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f47555a;

    public v(Iterator it) {
        this.f47555a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f47555a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f47555a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f47555a.remove();
    }
}
