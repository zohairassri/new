package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d2 extends w0 implements b2 {
    d2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.b2
    public final void a6(String str, String str2, Bundle bundle, long j11) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        y0.d(parcelR, bundle);
        parcelR.writeLong(j11);
        I0(1, parcelR);
    }

    @Override // com.google.android.gms.internal.measurement.b2
    public final int zza() {
        Parcel parcelY = Y(2, R());
        int i11 = parcelY.readInt();
        parcelY.recycle();
        return i11;
    }
}
