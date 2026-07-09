package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class u20 extends pr implements w20 {
    u20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.w20
    public final String zzb() {
        Parcel parcelY = Y(2, R());
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.w20
    public final List zzc() {
        Parcel parcelY = Y(3, R());
        ArrayList arrayListF = rr.f(parcelY);
        parcelY.recycle();
        return arrayListF;
    }
}
