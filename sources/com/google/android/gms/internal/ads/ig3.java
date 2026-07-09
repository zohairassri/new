package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ig3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ig3 f28385b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final eg3 f28386a;

    private ig3(Context context) {
        this.f28386a = eg3.a(context);
        dg3.a(context);
    }

    public static final ig3 a(Context context) {
        ig3 ig3Var;
        synchronized (ig3.class) {
            try {
                if (f28385b == null) {
                    f28385b = new ig3(context);
                }
                ig3Var = f28385b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ig3Var;
    }

    public final void b(cg3 cg3Var) {
        synchronized (ig3.class) {
            eg3 eg3Var = this.f28386a;
            eg3Var.f("vendor_scoped_gpid_v2_id");
            eg3Var.f("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
