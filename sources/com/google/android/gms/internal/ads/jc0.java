package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class jc0 extends com.google.android.gms.ads.internal.client.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28999a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile yl.o1 f29000b;

    @Override // yl.m1
    public final void I2(yl.o1 o1Var) {
        synchronized (this.f28999a) {
            this.f29000b = o1Var;
        }
    }

    @Override // yl.m1
    public final void P(boolean z11) throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final float zzj() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final float zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final yl.o1 zzo() {
        yl.o1 o1Var;
        synchronized (this.f28999a) {
            o1Var = this.f29000b;
        }
        return o1Var;
    }

    @Override // yl.m1
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // yl.m1
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
