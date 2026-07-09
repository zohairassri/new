package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f43766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f43768c;

    zaa(int i11, int i12, Intent intent) {
        this.f43766a = i11;
        this.f43767b = i12;
        this.f43768c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f43766a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.f43767b);
        um.a.s(parcel, 3, this.f43768c, i11, false);
        um.a.b(parcel, iA);
    }
}
