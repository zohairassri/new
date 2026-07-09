package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import yl.o2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzga extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzga> CREATOR = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22307c;

    public zzga(ql.s sVar) {
        this(sVar.c(), sVar.b(), sVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        boolean z11 = this.f22305a;
        int iA = um.a.a(parcel);
        um.a.c(parcel, 2, z11);
        um.a.c(parcel, 3, this.f22306b);
        um.a.c(parcel, 4, this.f22307c);
        um.a.b(parcel, iA);
    }

    public zzga(boolean z11, boolean z12, boolean z13) {
        this.f22305a = z11;
        this.f22306b = z12;
        this.f22307c = z13;
    }
}
