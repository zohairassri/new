package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzpa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpa> CREATOR = new zzpb();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    zzpa(int i11, byte[] bArr, int i12) {
        this.zza = i11;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zza;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.f(parcel, 2, this.zzb, false);
        um.a.l(parcel, 3, this.zzc);
        um.a.b(parcel, iA);
    }

    public zzpa(byte[] bArr, int i11) {
        this(1, null, 1);
    }
}
