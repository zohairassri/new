package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class hx3 implements Serializable {
    hx3() {
    }

    public static hx3 c() {
        return qw3.f33828a;
    }

    public static hx3 d(Object obj) {
        return obj == null ? qw3.f33828a : new ox3(obj);
    }

    public abstract Object a(Object obj);

    public abstract hx3 b(ax3 ax3Var);
}
