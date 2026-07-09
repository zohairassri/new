package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ag f27489b;

    h12(Context context) {
        this.f27488a = context;
    }

    public final void a() {
        this.f27489b = zf.a(this.f27488a);
    }

    public final void b(fg fgVar) {
        this.f27489b.b(fgVar);
    }

    public final void c() {
        this.f27489b.c();
    }

    public final gg d() {
        try {
            ag agVar = this.f27489b;
            if (agVar != null && agVar.a()) {
                return agVar.d();
            }
        } catch (RemoteException unused) {
        }
        return null;
    }
}
