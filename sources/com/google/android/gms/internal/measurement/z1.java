package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class z1 extends z0 implements b2 {
    public z1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.z0
    protected final boolean R(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) y0.a(parcel, Bundle.CREATOR);
            long j11 = parcel.readLong();
            y0.f(parcel);
            a6(string, string2, bundle, j11);
            parcel2.writeNoException();
        } else {
            if (i11 != 2) {
                return false;
            }
            int iZza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(iZza);
        }
        return true;
    }
}
