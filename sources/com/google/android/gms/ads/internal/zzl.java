package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22426i;

    zzl(boolean z11, boolean z12, String str, boolean z13, float f11, int i11, boolean z14, boolean z15, boolean z16) {
        this.f22418a = z11;
        this.f22419b = z12;
        this.f22420c = str;
        this.f22421d = z13;
        this.f22422e = f11;
        this.f22423f = i11;
        this.f22424g = z14;
        this.f22425h = z15;
        this.f22426i = z16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        boolean z11 = this.f22418a;
        int iA = um.a.a(parcel);
        um.a.c(parcel, 2, z11);
        um.a.c(parcel, 3, this.f22419b);
        um.a.u(parcel, 4, this.f22420c, false);
        um.a.c(parcel, 5, this.f22421d);
        um.a.i(parcel, 6, this.f22422e);
        um.a.l(parcel, 7, this.f22423f);
        um.a.c(parcel, 8, this.f22424g);
        um.a.c(parcel, 9, this.f22425h);
        um.a.c(parcel, 10, this.f22426i);
        um.a.b(parcel, iA);
    }

    public zzl(boolean z11, boolean z12, boolean z13, float f11, int i11, boolean z14, boolean z15, boolean z16) {
        this(z11, z12, null, z13, f11, -1, z14, z15, z16);
    }
}
