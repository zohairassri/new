package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class fw3 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ mw3 f26732a;

    /* synthetic */ fw3(mw3 mw3Var, byte[] bArr) {
        Objects.requireNonNull(mw3Var);
        this.f26732a = mw3Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        mw3 mw3Var = this.f26732a;
        mw3Var.i().a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        mw3Var.h(new Runnable() { // from class: com.google.android.gms.internal.ads.ew3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IInterface iInterfaceM;
                ou3 ou3VarN7 = nu3.n7(iBinder);
                fw3 fw3Var = this.f25953a;
                mw3 mw3Var2 = fw3Var.f26732a;
                mw3Var2.n(ou3VarN7);
                mw3Var2.i().a("linkToDeath", new Object[0]);
                try {
                    iInterfaceM = mw3Var2.m();
                } catch (RemoteException e11) {
                    fw3Var.f26732a.i().d(e11, "linkToDeath failed", new Object[0]);
                }
                if (iInterfaceM == null) {
                    throw null;
                }
                iInterfaceM.asBinder().linkToDeath(mw3Var2.l(), 0);
                mw3 mw3Var3 = fw3Var.f26732a;
                mw3Var3.k(false);
                synchronized (mw3Var3.j()) {
                    try {
                        Iterator it = mw3Var3.j().iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        mw3Var3.j().clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        mw3 mw3Var = this.f26732a;
        mw3Var.i().a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        mw3Var.h(new Runnable() { // from class: com.google.android.gms.internal.ads.dw3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                mw3 mw3Var2 = this.f25488a.f26732a;
                mw3Var2.i().a("unlinkToDeath", new Object[0]);
                IInterface iInterfaceM = mw3Var2.m();
                iInterfaceM.getClass();
                iInterfaceM.asBinder().unlinkToDeath(mw3Var2.l(), 0);
                mw3Var2.n(null);
                mw3Var2.k(false);
            }
        });
    }
}
