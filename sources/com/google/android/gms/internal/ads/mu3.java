package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mu3 extends pr implements ou3 {
    mu3(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.ou3
    public final void M0(Bundle bundle, qu3 qu3Var) {
        Parcel parcelR = R();
        rr.c(parcelR, bundle);
        rr.e(parcelR, qu3Var);
        k1(2, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.ou3
    public final void h1(Bundle bundle, qu3 qu3Var) {
        Parcel parcelR = R();
        rr.c(parcelR, bundle);
        rr.e(parcelR, qu3Var);
        k1(3, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.ou3
    public final void u2(String str, Bundle bundle, qu3 qu3Var) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        rr.c(parcelR, bundle);
        rr.e(parcelR, qu3Var);
        k1(1, parcelR);
    }
}
