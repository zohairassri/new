package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42734c;

    zzbj(String str, String str2, String str3) {
        this.f42734c = str;
        this.f42732a = str2;
        this.f42733b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, this.f42732a, false);
        um.a.u(parcel, 2, this.f42733b, false);
        um.a.u(parcel, 5, this.f42734c, false);
        um.a.b(parcel, iA);
    }
}
