package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class y1 extends z0 implements v1 {
    public y1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.z0
    protected final boolean R(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) y0.a(parcel, Bundle.CREATOR);
        y0.f(parcel);
        E(bundle);
        parcel2.writeNoException();
        return true;
    }
}
