package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfwv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfwv> CREATOR = new vc3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f39777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39778c;

    zzfwv(int i11, byte[] bArr, int i12) {
        this.f39776a = i11;
        this.f39777b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f39778c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f39776a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.f(parcel, 2, this.f39777b, false);
        um.a.l(parcel, 3, this.f39778c);
        um.a.b(parcel, iA);
    }

    public zzfwv(byte[] bArr, int i11) {
        this(1, null, 1);
    }
}
