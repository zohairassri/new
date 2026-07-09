package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ac0 extends pr implements cc0 {
    ac0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.cc0
    public final com.google.android.gms.dynamic.a zze() {
        Parcel parcelY = Y(1, R());
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcelY.readStrongBinder());
        parcelY.recycle();
        return aVarY;
    }

    @Override // com.google.android.gms.internal.ads.cc0
    public final boolean zzf() {
        Parcel parcelY = Y(2, R());
        boolean zA = rr.a(parcelY);
        parcelY.recycle();
        return zA;
    }
}
