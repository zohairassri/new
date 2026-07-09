package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import yl.l2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfv> CREATOR = new l2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22303b;

    public zzfv(int i11, int i12) {
        this.f22302a = i11;
        this.f22303b = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22302a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.l(parcel, 2, this.f22303b);
        um.a.b(parcel, iA);
    }

    public zzfv(ql.o oVar) {
        this.f22302a = oVar.c();
        this.f22303b = oVar.d();
    }
}
