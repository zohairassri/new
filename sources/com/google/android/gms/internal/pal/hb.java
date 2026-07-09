package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hb extends v9 implements jb {
    hb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.android.gms.internal.pal.jb
    public final void i6(Bundle bundle, gb gbVar) {
        Parcel parcelR = R();
        x9.d(parcelR, bundle);
        x9.e(parcelR, gbVar);
        k1(1, parcelR);
    }
}
