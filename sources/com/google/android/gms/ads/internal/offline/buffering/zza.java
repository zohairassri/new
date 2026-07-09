package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import zl.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22364c;

    public zza(String str, String str2, String str3) {
        this.f22362a = str;
        this.f22363b = str2;
        this.f22364c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f22362a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.u(parcel, 2, this.f22363b, false);
        um.a.u(parcel, 3, this.f22364c, false);
        um.a.b(parcel, iA);
    }
}
