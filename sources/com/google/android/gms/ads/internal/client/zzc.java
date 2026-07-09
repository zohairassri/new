package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new yl.q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22288b;

    public zzc(String str, String str2) {
        this.f22287a = str;
        this.f22288b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f22287a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.u(parcel, 2, this.f22288b, false);
        um.a.b(parcel, iA);
    }
}
