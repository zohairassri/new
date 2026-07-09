package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f22950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f22952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f22953g;

    zzp(String str, boolean z11, boolean z12, IBinder iBinder, boolean z13, boolean z14, boolean z15) {
        this.f22947a = str;
        this.f22948b = z11;
        this.f22949c = z12;
        this.f22950d = (Context) com.google.android.gms.dynamic.b.I0(a.AbstractBinderC0319a.Y(iBinder));
        this.f22951e = z13;
        this.f22952f = z14;
        this.f22953g = z15;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f22947a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.c(parcel, 2, this.f22948b);
        um.a.c(parcel, 3, this.f22949c);
        um.a.k(parcel, 4, com.google.android.gms.dynamic.b.k1(this.f22950d), false);
        um.a.c(parcel, 5, this.f22951e);
        um.a.c(parcel, 6, this.f22952f);
        um.a.c(parcel, 8, this.f22953g);
        um.a.b(parcel, iA);
    }
}
