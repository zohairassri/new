package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfwt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfwt> CREATOR = new uc3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39775e;

    zzfwt(int i11, int i12, int i13, String str, String str2) {
        this.f39771a = i11;
        this.f39772b = i12;
        this.f39773c = str;
        this.f39774d = str2;
        this.f39775e = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f39771a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.f39772b);
        um.a.u(parcel, 3, this.f39773c, false);
        um.a.u(parcel, 4, this.f39774d, false);
        um.a.l(parcel, 5, this.f39775e);
        um.a.b(parcel, iA);
    }

    public zzfwt(int i11, er erVar, String str, String str2) {
        this(1, 1, erVar.zza(), str, str2);
    }
}
