package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bh2 implements yl.a, th1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yl.i f23929a;

    @Override // com.google.android.gms.internal.ads.th1
    public final synchronized void N() {
        yl.i iVar = this.f23929a;
        if (iVar != null) {
            try {
                iVar.zzb();
            } catch (RemoteException e11) {
                int i11 = bm.k1.f14837b;
                cm.o.g("Remote Exception at onPhysicalClick.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.th1
    public final synchronized void V() {
    }

    public final synchronized void b(yl.i iVar) {
        this.f23929a = iVar;
    }

    @Override // yl.a
    public final synchronized void i() {
        yl.i iVar = this.f23929a;
        if (iVar != null) {
            try {
                iVar.zzb();
            } catch (RemoteException e11) {
                int i11 = bm.k1.f14837b;
                cm.o.g("Remote Exception at onAdClicked.", e11);
            }
        }
    }
}
