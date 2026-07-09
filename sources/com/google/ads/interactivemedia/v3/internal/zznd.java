package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zznd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznd> CREATOR = new zzne();
    private final String zza;

    public zznd(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.b(parcel, iA);
    }

    public final String zza() {
        return this.zza;
    }
}
