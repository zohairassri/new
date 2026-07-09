package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class bl5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24012a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24013b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x64 f24014c;

    public bl5(c4 c4Var, ib ibVar) {
    }

    public final void a(x64 x64Var) {
        if (x64Var != this.f24014c) {
            this.f24014c = x64Var;
            this.f24012a.clear();
            this.f24013b.clear();
        }
    }
}
