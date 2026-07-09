package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import yl.w2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new w2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22357a;

    public zzx(int i11) {
        this.f22357a = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22357a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 2, i12);
        um.a.b(parcel, iA);
    }
}
