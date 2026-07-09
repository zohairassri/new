package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vi0 extends pr implements IInterface {
    vi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void z1(ji0 ji0Var, String str, String str2) {
        Parcel parcelR = R();
        rr.e(parcelR, ji0Var);
        parcelR.writeString(str);
        parcelR.writeString(str2);
        I0(2, parcelR);
    }
}
