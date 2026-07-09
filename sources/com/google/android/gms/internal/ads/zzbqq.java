package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbqq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqq> CREATOR = new p80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f39591b;

    public zzbqq(String str, Bundle bundle) {
        this.f39590a = str;
        this.f39591b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39590a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.e(parcel, 2, this.f39591b, false);
        um.a.b(parcel, iA);
    }
}
