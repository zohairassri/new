package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zh0 extends pr implements bi0 {
    zh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void a2(vh0 vh0Var) {
        Parcel parcelR = R();
        rr.e(parcelR, vh0Var);
        I0(5, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void u(int i11) {
        Parcel parcelR = R();
        parcelR.writeInt(i11);
        I0(7, parcelR);
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void zze() {
        I0(1, R());
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void zzf() {
        I0(2, R());
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void zzg() {
        I0(3, R());
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void zzh() {
        I0(4, R());
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void zzj() {
        I0(6, R());
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final void zzl() {
        I0(8, R());
    }
}
