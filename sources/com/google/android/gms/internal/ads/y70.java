package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class y70 extends pr implements IInterface {
    y70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void z1(zzbpt zzbptVar, x70 x70Var) {
        Parcel parcelR = R();
        rr.c(parcelR, zzbptVar);
        rr.e(parcelR, x70Var);
        k1(2, parcelR);
    }
}
