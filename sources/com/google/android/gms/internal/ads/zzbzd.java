package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzd> CREATOR = new tg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39642a;

    public zzbzd(String str) {
        this.f39642a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39642a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.b(parcel, iA);
    }
}
