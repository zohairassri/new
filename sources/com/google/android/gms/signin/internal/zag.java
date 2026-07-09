package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zag> CREATOR = new qn.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43770b;

    public zag(List list, String str) {
        this.f43769a = list;
        this.f43770b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        List list = this.f43769a;
        int iA = um.a.a(parcel);
        um.a.w(parcel, 1, list, false);
        um.a.u(parcel, 2, this.f43770b, false);
        um.a.b(parcel, iA);
    }
}
