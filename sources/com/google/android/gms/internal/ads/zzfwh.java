package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfwh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfwh> CREATOR = new lc3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f39764b;

    zzfwh(int i11, byte[] bArr) {
        this.f39763a = i11;
        this.f39764b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f39763a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.f(parcel, 2, this.f39764b, false);
        um.a.b(parcel, iA);
    }

    public zzfwh(byte[] bArr) {
        this(1, bArr);
    }
}
