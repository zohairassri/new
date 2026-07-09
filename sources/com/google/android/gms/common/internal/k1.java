package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class k1 extends hn.a implements m1 {
    k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.m1
    public final com.google.android.gms.dynamic.a zzd() {
        Parcel parcelR = R(1, Y());
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcelR.readStrongBinder());
        parcelR.recycle();
        return aVarY;
    }

    @Override // com.google.android.gms.common.internal.m1
    public final int zze() {
        Parcel parcelR = R(2, Y());
        int i11 = parcelR.readInt();
        parcelR.recycle();
        return i11;
    }
}
