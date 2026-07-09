package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nm.d;
import um.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22468b;

    public zza(String str, String str2) {
        this.f22467a = str;
        this.f22468b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = a.a(parcel);
        a.u(parcel, 1, this.f22467a, false);
        a.u(parcel, 2, this.f22468b, false);
        a.b(parcel, iA);
    }
}
