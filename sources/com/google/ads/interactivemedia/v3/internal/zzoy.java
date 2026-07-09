package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzoy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoy> CREATOR = new zzoz();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    zzoy(int i11, int i12, int i13, String str, String str2) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.zzb);
        um.a.u(parcel, 3, this.zzc, false);
        um.a.u(parcel, 4, this.zzd, false);
        um.a.l(parcel, 5, this.zze);
        um.a.b(parcel, iA);
    }

    public zzoy(int i11, int i12, String str, String str2) {
        this(1, 1, i12 - 1, str, str2);
    }
}
