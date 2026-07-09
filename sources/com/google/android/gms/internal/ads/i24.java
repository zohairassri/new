package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i24 implements Comparator {
    protected i24() {
    }

    public static i24 b() {
        return g24.f26798a;
    }

    public static i24 c(Comparator comparator) {
        return new wz3(comparator);
    }

    public i24 a() {
        return new s24(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final i24 d(ax3 ax3Var) {
        return new iz3(ax3Var, this);
    }
}
