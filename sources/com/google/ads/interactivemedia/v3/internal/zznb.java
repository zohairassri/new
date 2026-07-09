package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zznb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznb> CREATOR = new zznc();
    private final String zza;
    private final int zzb;
    private final String zzc;

    public zznb(String str, int i11, String str2) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.l(parcel, 2, this.zzb);
        um.a.u(parcel, 3, this.zzc, false);
        um.a.b(parcel, iA);
    }
}
