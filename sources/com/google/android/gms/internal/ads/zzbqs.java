package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbqs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqs> CREATOR = new q80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39595d;

    public zzbqs(int i11, int i12, String str, int i13) {
        this.f39592a = i11;
        this.f39593b = i12;
        this.f39594c = str;
        this.f39595d = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f39593b;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.u(parcel, 2, this.f39594c, false);
        um.a.l(parcel, 3, this.f39595d);
        um.a.l(parcel, FactorBitrateAdjuster.FACTOR_BASE, this.f39592a);
        um.a.b(parcel, iA);
    }
}
