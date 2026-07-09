package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pr;
import com.google.android.gms.internal.ads.rr;
import yl.k1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends pr implements k1 {
    h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // yl.k1
    public final void O2(String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        rr.e(parcelR, aVar);
        rr.e(parcelR, aVar2);
        I0(1, parcelR);
    }
}
