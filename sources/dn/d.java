package dn;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // dn.f
    public final boolean e0(boolean z11) {
        Parcel parcelR = R();
        c.a(parcelR, true);
        Parcel parcelY = Y(2, parcelR);
        boolean zB = c.b(parcelY);
        parcelY.recycle();
        return zB;
    }

    @Override // dn.f
    public final String zzc() {
        Parcel parcelY = Y(1, R());
        String string = parcelY.readString();
        parcelY.recycle();
        return string;
    }

    @Override // dn.f
    public final boolean zzd() {
        Parcel parcelY = Y(6, R());
        boolean zB = c.b(parcelY);
        parcelY.recycle();
        return zB;
    }
}
