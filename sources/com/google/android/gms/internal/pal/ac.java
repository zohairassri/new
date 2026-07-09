package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ac extends v9 implements cc {
    ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.pal.cc
    public final void zze(com.google.android.gms.dynamic.a aVar, String str, String str2) {
        Parcel parcelR = R();
        x9.e(parcelR, aVar);
        parcelR.writeString("ADSHIELD");
        parcelR.writeString(null);
        I0(8, parcelR);
    }

    @Override // com.google.android.gms.internal.pal.cc
    public final void zzf() {
        I0(3, R());
    }

    @Override // com.google.android.gms.internal.pal.cc
    public final void zzg(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        I0(7, parcelR);
    }

    @Override // com.google.android.gms.internal.pal.cc
    public final void zzh(int[] iArr) {
        Parcel parcelR = R();
        parcelR.writeIntArray(null);
        I0(4, parcelR);
    }

    @Override // com.google.android.gms.internal.pal.cc
    public final void zzi(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        I0(6, parcelR);
    }

    @Override // com.google.android.gms.internal.pal.cc
    public final void zzj(byte[] bArr) {
        Parcel parcelR = R();
        parcelR.writeByteArray(bArr);
        I0(5, parcelR);
    }
}
