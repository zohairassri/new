package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class w extends e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f46032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f46033b;

    w(Object obj, Object obj2) {
        this.f46032a = obj;
        this.f46033b = obj2;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final Object getKey() {
        return this.f46032a;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final Object getValue() {
        return this.f46033b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
