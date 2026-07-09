package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f43773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f43774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zav f43775c;

    zak(int i11, ConnectionResult connectionResult, zav zavVar) {
        this.f43773a = i11;
        this.f43774b = connectionResult;
        this.f43775c = zavVar;
    }

    public final ConnectionResult j() {
        return this.f43774b;
    }

    public final zav l() {
        return this.f43775c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f43773a);
        um.a.s(parcel, 2, this.f43774b, i11, false);
        um.a.s(parcel, 3, this.f43775c, i11, false);
        um.a.b(parcel, iA);
    }
}
