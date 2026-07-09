package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f40977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f40978h;

    public zzdd(long j11, long j12, boolean z11, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f40971a = j11;
        this.f40972b = j12;
        this.f40973c = z11;
        this.f40974d = str;
        this.f40975e = str2;
        this.f40976f = str3;
        this.f40977g = bundle;
        this.f40978h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.p(parcel, 1, this.f40971a);
        um.a.p(parcel, 2, this.f40972b);
        um.a.c(parcel, 3, this.f40973c);
        um.a.u(parcel, 4, this.f40974d, false);
        um.a.u(parcel, 5, this.f40975e, false);
        um.a.u(parcel, 6, this.f40976f, false);
        um.a.e(parcel, 7, this.f40977g, false);
        um.a.u(parcel, 8, this.f40978h, false);
        um.a.b(parcel, iA);
    }
}
