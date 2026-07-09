package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class kk0 extends pr implements nk0 {
    kk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void d(String str) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        I0(2, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void p1(String str, String str2, Bundle bundle) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        rr.c(parcelR, bundle);
        I0(3, parcelR);
    }
}
