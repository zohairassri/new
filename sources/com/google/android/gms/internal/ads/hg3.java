package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hg3 extends fg3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static hg3 f27701i;

    private hg3(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final hg3 i(Context context) {
        hg3 hg3Var;
        synchronized (hg3.class) {
            try {
                if (f27701i == null) {
                    f27701i = new hg3(context);
                }
                hg3Var = f27701i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hg3Var;
    }

    public final cg3 j(long j11, boolean z11) {
        synchronized (hg3.class) {
            try {
                if (this.f26315g.c()) {
                    return a(null, null, j11, z11);
                }
                return new cg3();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        synchronized (hg3.class) {
            try {
                if (g(false)) {
                    c(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
