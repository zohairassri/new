package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lk0 extends qr implements nk0 {
    public lk0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            parcel.readString();
            parcel.readString();
            rr.h(parcel);
        } else if (i11 == 2) {
            String string = parcel.readString();
            rr.h(parcel);
            d(string);
        } else {
            if (i11 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) rr.b(parcel, Bundle.CREATOR);
            rr.h(parcel);
            p1(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
