package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f22857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f22858c;

    zac(int i11, String str, int i12) {
        this.f22856a = i11;
        this.f22857b = str;
        this.f22858c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22856a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.u(parcel, 2, this.f22857b, false);
        um.a.l(parcel, 3, this.f22858c);
        um.a.b(parcel, iA);
    }

    zac(String str, int i11) {
        this.f22856a = 1;
        this.f22857b = str;
        this.f22858c = i11;
    }
}
