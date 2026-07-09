package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f00 extends qr implements g00 {
    public f00() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final boolean m7(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        } else if (i11 == 2) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else if (i11 == 3) {
            com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcel.readStrongBinder());
            rr.h(parcel);
            M(aVarY);
            parcel2.writeNoException();
        } else if (i11 == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i11 != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
