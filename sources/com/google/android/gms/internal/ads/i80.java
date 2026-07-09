package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i80 extends qr implements j80 {
    public i80() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static j80 n7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof j80 ? (j80) iInterfaceQueryLocalInterface : new h80(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            zze();
        } else {
            if (i11 != 3) {
                return false;
            }
            String string = parcel.readString();
            rr.h(parcel);
            c(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
