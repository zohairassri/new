package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class wc implements Serializable {
    wc() {
    }

    public static wc e() {
        return qc.f41681a;
    }

    public static wc f(Object obj) {
        obj.getClass();
        return new bd(obj);
    }

    public abstract wc a(tc tcVar);

    public abstract Object b();

    public abstract Object c(Object obj);

    public abstract boolean d();
}
