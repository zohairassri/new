package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class fb extends w9 implements gb {
    public fb() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    @Override // com.google.android.gms.internal.pal.w9
    protected final boolean R(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            Bundle bundle = (Bundle) x9.a(parcel, Bundle.CREATOR);
            x9.b(parcel);
            zzc(bundle);
        } else {
            if (i11 != 2) {
                return false;
            }
            int i13 = parcel.readInt();
            x9.b(parcel);
            zzb(i13);
        }
        return true;
    }
}
