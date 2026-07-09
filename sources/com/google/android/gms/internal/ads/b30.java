package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class b30 extends pr implements d30 {
    b30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final com.google.android.gms.dynamic.a zzb() {
        Parcel parcelY = Y(1, R());
        com.google.android.gms.dynamic.a aVarY = a.AbstractBinderC0319a.Y(parcelY.readStrongBinder());
        parcelY.recycle();
        return aVarY;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final Uri zzc() {
        Parcel parcelY = Y(2, R());
        Uri uri = (Uri) rr.b(parcelY, Uri.CREATOR);
        parcelY.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final double zzd() {
        Parcel parcelY = Y(3, R());
        double d11 = parcelY.readDouble();
        parcelY.recycle();
        return d11;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final int zze() {
        Parcel parcelY = Y(4, R());
        int i11 = parcelY.readInt();
        parcelY.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final int zzf() {
        Parcel parcelY = Y(5, R());
        int i11 = parcelY.readInt();
        parcelY.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.d30
    public final Map zzg() {
        Parcel parcelY = Y(6, R());
        HashMap mapG = rr.g(parcelY);
        parcelY.recycle();
        return mapG;
    }
}
