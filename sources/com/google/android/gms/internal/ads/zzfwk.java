package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfwk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfwk> CREATOR = new nc3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39767c;

    zzfwk(int i11, String str, String str2) {
        this.f39765a = i11;
        this.f39766b = str;
        this.f39767c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f39765a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.u(parcel, 2, this.f39766b, false);
        um.a.u(parcel, 3, this.f39767c, false);
        um.a.b(parcel, iA);
    }

    public zzfwk(String str, String str2) {
        this(1, str, str2);
    }
}
