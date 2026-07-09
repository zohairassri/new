package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j extends g implements l {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.l
    public final void r1(String str, String str2, n nVar) {
        Parcel parcelR = R();
        parcelR.writeString(str);
        parcelR.writeString(str2);
        int i11 = i.f42430a;
        parcelR.writeStrongBinder(nVar);
        k1(1, parcelR);
    }
}
