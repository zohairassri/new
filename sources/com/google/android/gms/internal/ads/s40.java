package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class s40 extends pr implements t40 {
    s40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.t40
    public final void i(String str) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        I0(1, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.t40
    public final void zzf() {
        I0(2, R());
    }
}
