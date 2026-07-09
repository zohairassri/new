package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcbn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbn> CREATOR = new bj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39666b;

    public zzcbn(String str, String str2) {
        this.f39665a = str;
        this.f39666b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39665a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.u(parcel, 2, this.f39666b, false);
        um.a.b(parcel, iA);
    }
}
