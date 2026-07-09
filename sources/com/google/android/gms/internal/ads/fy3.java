package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class fy3 {
    public static by3 a(by3 by3Var) {
        return ((by3Var instanceof ey3) || (by3Var instanceof cy3)) ? by3Var : by3Var instanceof Serializable ? new cy3(by3Var) : new ey3(by3Var);
    }
}
