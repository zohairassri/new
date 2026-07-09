package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hf0 extends pr implements jf0 {
    hf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void H(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelR = R();
        rr.e(parcelR, aVar);
        I0(13, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void H3(Bundle bundle) {
        Parcel parcelR = R();
        rr.c(parcelR, bundle);
        I0(1, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void L4(int i11, String[] strArr, int[] iArr) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        parcelR.writeStringArray(strArr);
        parcelR.writeIntArray(iArr);
        I0(15, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void g0(Bundle bundle) {
        Parcel parcelR = R();
        rr.c(parcelR, bundle);
        Parcel parcelY = Y(6, parcelR);
        if (parcelY.readInt() != 0) {
            bundle.readFromParcel(parcelY);
        }
        parcelY.recycle();
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void u1(int i11, int i12, Intent intent) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        parcelR.writeInt(i12);
        rr.c(parcelR, intent);
        I0(12, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zze() {
        I0(10, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzf() {
        I0(14, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final boolean zzg() {
        Parcel parcelY = Y(11, R());
        boolean zA = rr.a(parcelY);
        parcelY.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzi() {
        I0(2, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzj() {
        I0(3, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzk() {
        I0(4, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzl() {
        I0(5, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzp() {
        I0(7, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzq() {
        I0(8, R());
    }

    @Override // com.google.android.gms.internal.ads.jf0
    public final void zzs() {
        I0(9, R());
    }
}
