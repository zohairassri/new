package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class sr extends pr implements ur {
    sr(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.ads.ur
    public final Bundle v0(Bundle bundle) {
        Parcel parcelR = R();
        rr.c(parcelR, bundle);
        Parcel parcelY = Y(1, parcelR);
        Bundle bundle2 = (Bundle) rr.b(parcelY, Bundle.CREATOR);
        parcelY.recycle();
        return bundle2;
    }
}
