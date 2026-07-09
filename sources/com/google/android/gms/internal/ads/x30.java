package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class x30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w30 f37757a;

    public x30(w30 w30Var) {
        Context context;
        this.f37757a = w30Var;
        try {
            context = (Context) com.google.android.gms.dynamic.b.I0(w30Var.zzm());
        } catch (RemoteException | NullPointerException e11) {
            cm.o.d("", e11);
            context = null;
        }
        if (context != null) {
            try {
                this.f37757a.H(com.google.android.gms.dynamic.b.k1(new MediaView(context)));
            } catch (RemoteException e12) {
                cm.o.d("", e12);
            }
        }
    }

    public final w30 a() {
        return this.f37757a;
    }

    public final String b() {
        try {
            return this.f37757a.zzh();
        } catch (RemoteException e11) {
            cm.o.d("", e11);
            return null;
        }
    }
}
