package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m30 extends qr implements n30 {
    public m30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
            rr.h(parcel);
            o0(aVarY);
        } else if (i11 == 2) {
            zzc();
        } else {
            if (i11 != 3) {
                return false;
            }
            com.google.android.gms.dynamic.a aVarY2 = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
            rr.h(parcel);
            M(aVarY2);
        }
        parcel2.writeNoException();
        return true;
    }
}
