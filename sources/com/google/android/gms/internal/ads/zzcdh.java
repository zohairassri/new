package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcdh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdh> CREATOR = new uk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzr f39677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzm f39678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39680f;

    public zzcdh(String str, String str2, zzr zzrVar, zzm zzmVar, int i11, String str3) {
        this.f39675a = str;
        this.f39676b = str2;
        this.f39677c = zzrVar;
        this.f39678d = zzmVar;
        this.f39679e = i11;
        this.f39680f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f39675a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.u(parcel, 2, this.f39676b, false);
        um.a.s(parcel, 3, this.f39677c, i11, false);
        um.a.s(parcel, 4, this.f39678d, i11, false);
        um.a.l(parcel, 5, this.f39679e);
        um.a.u(parcel, 6, this.f39680f, false);
        um.a.b(parcel, iA);
    }
}
