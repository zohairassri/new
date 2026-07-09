package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class wa implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f40845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ ma f40846d;

    private final Iterator a() {
        if (this.f40845c == null) {
            this.f40845c = this.f40846d.f40553c.entrySet().iterator();
        }
        return this.f40845c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40843a + 1 < this.f40846d.f40552b.size() || (!this.f40846d.f40553c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f40844b = true;
        int i11 = this.f40843a + 1;
        this.f40843a = i11;
        return i11 < this.f40846d.f40552b.size() ? (Map.Entry) this.f40846d.f40552b.get(this.f40843a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40844b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f40844b = false;
        this.f40846d.t();
        if (this.f40843a >= this.f40846d.f40552b.size()) {
            a().remove();
            return;
        }
        ma maVar = this.f40846d;
        int i11 = this.f40843a;
        this.f40843a = i11 - 1;
        maVar.m(i11);
    }

    private wa(ma maVar) {
        this.f40846d = maVar;
        this.f40843a = -1;
    }
}
