package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzb> CREATOR = new sg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39641b;

    public zzbzb(boolean z11, List list) {
        this.f39640a = z11;
        this.f39641b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        boolean z11 = this.f39640a;
        int iA = um.a.a(parcel);
        um.a.c(parcel, 2, z11);
        um.a.w(parcel, 3, this.f39641b, false);
        um.a.b(parcel, iA);
    }
}
