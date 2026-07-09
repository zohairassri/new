package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pr;
import com.google.android.gms.internal.ads.rr;
import yl.o1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends pr implements o1 {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // yl.o1
    public final void L2(boolean z11) {
        Parcel parcelR = R();
        int i11 = rr.f34319b;
        parcelR.writeInt(z11 ? 1 : 0);
        I0(5, parcelR);
    }

    @Override // yl.o1
    public final void zze() {
        I0(1, R());
    }

    @Override // yl.o1
    public final void zzf() {
        I0(2, R());
    }

    @Override // yl.o1
    public final void zzg() {
        I0(3, R());
    }

    @Override // yl.o1
    public final void zzh() {
        I0(4, R());
    }
}
