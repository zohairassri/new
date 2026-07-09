package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class dd3 extends pr implements fd3 {
    dd3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.fd3
    public final void J3(int[] iArr) {
        Parcel parcelR = R();
        parcelR.writeIntArray(null);
        I0(4, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.fd3
    public final void U5(com.google.android.gms.dynamic.a aVar, String str, String str2) {
        Parcel parcelR = R();
        rr.e(parcelR, aVar);
        parcelR.writeString(str);
        parcelR.writeString(null);
        I0(8, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.fd3
    public final void o2(byte[] bArr) {
        Parcel parcelR = R();
        parcelR.writeByteArray(bArr);
        I0(5, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.fd3
    public final void zze() {
        I0(3, R());
    }

    @Override // com.google.android.gms.internal.ads.fd3
    public final void zzh(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        I0(6, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.fd3
    public final void zzi(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        I0(7, parcelR);
    }
}
