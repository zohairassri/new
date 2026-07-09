package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new ma();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43727c;

    zzmh(String str, long j11, int i11) {
        this.f43725a = str;
        this.f43726b = j11;
        this.f43727c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, this.f43725a, false);
        um.a.p(parcel, 2, this.f43726b);
        um.a.l(parcel, 3, this.f43727c);
        um.a.b(parcel, iA);
    }
}
