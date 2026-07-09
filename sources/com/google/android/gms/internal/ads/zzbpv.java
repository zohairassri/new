package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbpv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbpv> CREATOR = new v70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f39581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f39582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f39583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f39585h;

    zzbpv(boolean z11, String str, int i11, byte[] bArr, String[] strArr, String[] strArr2, boolean z12, long j11) {
        this.f39578a = z11;
        this.f39579b = str;
        this.f39580c = i11;
        this.f39581d = bArr;
        this.f39582e = strArr;
        this.f39583f = strArr2;
        this.f39584g = z12;
        this.f39585h = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        boolean z11 = this.f39578a;
        int iA = um.a.a(parcel);
        um.a.c(parcel, 1, z11);
        um.a.u(parcel, 2, this.f39579b, false);
        um.a.l(parcel, 3, this.f39580c);
        um.a.f(parcel, 4, this.f39581d, false);
        um.a.v(parcel, 5, this.f39582e, false);
        um.a.v(parcel, 6, this.f39583f, false);
        um.a.c(parcel, 7, this.f39584g);
        um.a.p(parcel, 8, this.f39585h);
        um.a.b(parcel, iA);
    }
}
