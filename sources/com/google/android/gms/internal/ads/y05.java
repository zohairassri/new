package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class y05 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f38270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b15 f38271d;

    /* synthetic */ y05(b15 b15Var, byte[] bArr) {
        Objects.requireNonNull(b15Var);
        this.f38271d = b15Var;
        this.f38268a = -1;
    }

    private final Iterator a() {
        if (this.f38270c == null) {
            this.f38270c = this.f38271d.m().entrySet().iterator();
        }
        return this.f38270c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f38268a + 1;
        b15 b15Var = this.f38271d;
        if (i11 >= b15Var.l()) {
            return !b15Var.m().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f38269b = true;
        int i11 = this.f38268a + 1;
        this.f38268a = i11;
        b15 b15Var = this.f38271d;
        return i11 < b15Var.l() ? (x05) b15Var.k()[i11] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f38269b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f38269b = false;
        b15 b15Var = this.f38271d;
        b15Var.j();
        int i11 = this.f38268a;
        if (i11 >= b15Var.l()) {
            a().remove();
        } else {
            this.f38268a = i11 - 1;
            b15Var.i(i11);
        }
    }
}
