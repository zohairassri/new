package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class dg3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dg3 f25045b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final eg3 f25046a;

    private dg3(Context context) {
        this.f25046a = eg3.a(context);
    }

    public static final dg3 a(Context context) {
        dg3 dg3Var;
        synchronized (dg3.class) {
            try {
                if (f25045b == null) {
                    f25045b = new dg3(context);
                }
                dg3Var = f25045b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dg3Var;
    }

    public final void b(boolean z11) {
        synchronized (dg3.class) {
            try {
                eg3 eg3Var = this.f25046a;
                eg3Var.b("paidv2_publisher_option", Boolean.valueOf(z11));
                if (!z11) {
                    eg3Var.f("paidv2_creation_time");
                    eg3Var.f("paidv2_id");
                    eg3Var.f("vendor_scoped_gpid_v2_id");
                    eg3Var.f("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean zE;
        synchronized (dg3.class) {
            zE = this.f25046a.e("paidv2_publisher_option", true);
        }
        return zE;
    }

    public final void d(boolean z11) {
        synchronized (dg3.class) {
            this.f25046a.b("paidv2_user_option", Boolean.valueOf(z11));
        }
    }

    public final boolean e() {
        boolean zE;
        synchronized (dg3.class) {
            zE = this.f25046a.e("paidv2_user_option", true);
        }
        return zE;
    }
}
