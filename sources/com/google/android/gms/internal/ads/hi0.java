package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hi0 extends pr implements ji0 {
    hi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final String zze() {
        Parcel parcelY = Y(1, R());
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ji0
    public final int zzf() {
        Parcel parcelY = Y(2, R());
        int i11 = parcelY.readInt();
        parcelY.recycle();
        return i11;
    }
}
