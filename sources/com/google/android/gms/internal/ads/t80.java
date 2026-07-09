package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t80 extends pr implements v80 {
    t80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void f(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        I0(2, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.v80
    public final void zze() {
        I0(1, R());
    }
}
