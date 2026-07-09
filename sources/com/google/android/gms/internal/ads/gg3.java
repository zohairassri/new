package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gg3 extends fg3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static gg3 f27007i;

    private gg3(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final gg3 i(Context context) {
        gg3 gg3Var;
        synchronized (gg3.class) {
            try {
                if (f27007i == null) {
                    f27007i = new gg3(context);
                }
                gg3Var = f27007i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gg3Var;
    }

    public final cg3 j(long j11, boolean z11) {
        cg3 cg3VarA;
        synchronized (gg3.class) {
            cg3VarA = a(null, null, j11, z11);
        }
        return cg3VarA;
    }

    public final cg3 k(String str, String str2, long j11, boolean z11) {
        cg3 cg3VarA;
        synchronized (gg3.class) {
            cg3VarA = a(str, str2, j11, z11);
        }
        return cg3VarA;
    }

    public final void l() {
        synchronized (gg3.class) {
            c(false);
        }
    }

    public final void m() {
        synchronized (gg3.class) {
            c(true);
        }
    }
}
