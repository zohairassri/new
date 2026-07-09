package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbqg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqg> CREATOR = new g80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39589d;

    public zzbqg(String str, boolean z11, int i11, String str2) {
        this.f39586a = str;
        this.f39587b = z11;
        this.f39588c = i11;
        this.f39589d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39586a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.c(parcel, 2, this.f39587b);
        um.a.l(parcel, 3, this.f39588c);
        um.a.u(parcel, 4, this.f39589d, false);
        um.a.b(parcel, iA);
    }
}
