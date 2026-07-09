package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import yl.v2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new v2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zze f22351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f22352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22356h;

    public zzv(String str, long j11, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f22349a = str;
        this.f22350b = j11;
        this.f22351c = zzeVar;
        this.f22352d = bundle;
        this.f22353e = str2;
        this.f22354f = str3;
        this.f22355g = str4;
        this.f22356h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f22349a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.p(parcel, 2, this.f22350b);
        um.a.s(parcel, 3, this.f22351c, i11, false);
        um.a.e(parcel, 4, this.f22352d, false);
        um.a.u(parcel, 5, this.f22353e, false);
        um.a.u(parcel, 6, this.f22354f, false);
        um.a.u(parcel, 7, this.f22355g, false);
        um.a.u(parcel, 8, this.f22356h, false);
        um.a.b(parcel, iA);
    }
}
