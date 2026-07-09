package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ug4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f36102a = new HashMap();

    public final vg4 a() {
        if (this.f36102a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        vg4 vg4Var = new vg4(Collections.unmodifiableMap(this.f36102a), null);
        this.f36102a = null;
        return vg4Var;
    }
}
