package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbpt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbpt> CREATOR = new u70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f39576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f39577c;

    zzbpt(String str, String[] strArr, String[] strArr2) {
        this.f39575a = str;
        this.f39576b = strArr;
        this.f39577c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39575a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.v(parcel, 2, this.f39576b, false);
        um.a.v(parcel, 3, this.f39577c, false);
        um.a.b(parcel, iA);
    }
}
