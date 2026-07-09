package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhi> CREATOR = new ub();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42309c;

    zzhi(int i11, String str, String str2) {
        this.f42307a = i11;
        this.f42308b = str;
        this.f42309c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f42307a);
        um.a.u(parcel, 2, this.f42308b, false);
        um.a.u(parcel, 3, this.f42309c, false);
        um.a.b(parcel, iA);
    }

    public zzhi(String str, String str2) {
        this(1, str, str2);
    }
}
