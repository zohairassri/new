package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vr extends pr implements yr {
    vr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void L(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        I0(7, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void U2(byte[] bArr) {
        Parcel parcelR = R();
        parcelR.writeByteArray(bArr);
        I0(5, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void w2(int[] iArr) {
        Parcel parcelR = R();
        parcelR.writeIntArray(null);
        I0(4, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void zze(com.google.android.gms.dynamic.a aVar, String str) {
        Parcel parcelR = R();
        rr.e(parcelR, aVar);
        parcelR.writeString("GMA_SDK");
        I0(2, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void zzf() {
        I0(3, R());
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void zzi(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(0);
        I0(6, parcelR);
    }
}
