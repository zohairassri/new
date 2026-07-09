package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ba extends v9 implements da {
    ba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.android.gms.internal.pal.da
    public final String zze(com.google.android.gms.dynamic.a aVar, String str) {
        Parcel parcelR = R();
        x9.e(parcelR, aVar);
        parcelR.writeString("");
        Parcel parcelY = Y(8, parcelR);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.pal.da
    public final String zzg(com.google.android.gms.dynamic.a aVar, byte[] bArr) {
        Parcel parcelR = R();
        x9.e(parcelR, aVar);
        parcelR.writeByteArray(null);
        Parcel parcelY = Y(12, parcelR);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.pal.da
    public final String zzk(com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelR = R();
        x9.e(parcelR, aVar);
        x9.e(parcelR, aVar2);
        x9.e(parcelR, aVar3);
        Parcel parcelY = Y(14, parcelR);
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.pal.da
    public final void zzl(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelR = R();
        x9.e(parcelR, aVar);
        I0(9, parcelR);
    }
}
