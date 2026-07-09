package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new gb();
    public final long B;
    public final List N;
    private final String S;
    public final String X;
    public final String Y;
    public final String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f43744i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final boolean f43745i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final long f43746j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f43747k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f43748l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f43749l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f43750m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int f43751m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f43752n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final long f43753n0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f43754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f43755s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f43756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f43757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f43758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f43759y;

    zzo(String str, String str2, String str3, long j11, String str4, long j12, long j13, String str5, boolean z11, boolean z12, String str6, long j14, long j15, int i11, boolean z13, boolean z14, String str7, Boolean bool, long j16, List list, String str8, String str9, String str10, String str11, boolean z15, long j17, int i12, String str12, int i13, long j18) {
        com.google.android.gms.common.internal.n.f(str);
        this.f43736a = str;
        this.f43737b = TextUtils.isEmpty(str2) ? null : str2;
        this.f43738c = str3;
        this.f43748l = j11;
        this.f43739d = str4;
        this.f43740e = j12;
        this.f43741f = j13;
        this.f43742g = str5;
        this.f43743h = z11;
        this.f43744i = z12;
        this.f43750m = str6;
        this.f43752n = j14;
        this.f43754r = j15;
        this.f43755s = i11;
        this.f43756v = z13;
        this.f43757w = z14;
        this.f43758x = str7;
        this.f43759y = bool;
        this.B = j16;
        this.N = list;
        this.S = null;
        this.X = str9;
        this.Y = str10;
        this.Z = str11;
        this.f43745i0 = z15;
        this.f43746j0 = j17;
        this.f43747k0 = i12;
        this.f43749l0 = str12;
        this.f43751m0 = i13;
        this.f43753n0 = j18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.u(parcel, 2, this.f43736a, false);
        um.a.u(parcel, 3, this.f43737b, false);
        um.a.u(parcel, 4, this.f43738c, false);
        um.a.u(parcel, 5, this.f43739d, false);
        um.a.p(parcel, 6, this.f43740e);
        um.a.p(parcel, 7, this.f43741f);
        um.a.u(parcel, 8, this.f43742g, false);
        um.a.c(parcel, 9, this.f43743h);
        um.a.c(parcel, 10, this.f43744i);
        um.a.p(parcel, 11, this.f43748l);
        um.a.u(parcel, 12, this.f43750m, false);
        um.a.p(parcel, 13, this.f43752n);
        um.a.p(parcel, 14, this.f43754r);
        um.a.l(parcel, 15, this.f43755s);
        um.a.c(parcel, 16, this.f43756v);
        um.a.c(parcel, 18, this.f43757w);
        um.a.u(parcel, 19, this.f43758x, false);
        um.a.d(parcel, 21, this.f43759y, false);
        um.a.p(parcel, 22, this.B);
        um.a.w(parcel, 23, this.N, false);
        um.a.u(parcel, 24, this.S, false);
        um.a.u(parcel, 25, this.X, false);
        um.a.u(parcel, 26, this.Y, false);
        um.a.u(parcel, 27, this.Z, false);
        um.a.c(parcel, 28, this.f43745i0);
        um.a.p(parcel, 29, this.f43746j0);
        um.a.l(parcel, 30, this.f43747k0);
        um.a.u(parcel, 31, this.f43749l0, false);
        um.a.l(parcel, 32, this.f43751m0);
        um.a.p(parcel, 34, this.f43753n0);
        um.a.b(parcel, iA);
    }

    zzo(String str, String str2, String str3, String str4, long j11, long j12, String str5, boolean z11, boolean z12, long j13, String str6, long j14, long j15, int i11, boolean z13, boolean z14, String str7, Boolean bool, long j16, List list, String str8, String str9, String str10, String str11, boolean z15, long j17, int i12, String str12, int i13, long j18) {
        this.f43736a = str;
        this.f43737b = str2;
        this.f43738c = str3;
        this.f43748l = j13;
        this.f43739d = str4;
        this.f43740e = j11;
        this.f43741f = j12;
        this.f43742g = str5;
        this.f43743h = z11;
        this.f43744i = z12;
        this.f43750m = str6;
        this.f43752n = j14;
        this.f43754r = j15;
        this.f43755s = i11;
        this.f43756v = z13;
        this.f43757w = z14;
        this.f43758x = str7;
        this.f43759y = bool;
        this.B = j16;
        this.N = list;
        this.S = str8;
        this.X = str9;
        this.Y = str10;
        this.Z = str11;
        this.f43745i0 = z15;
        this.f43746j0 = j17;
        this.f43747k0 = i12;
        this.f43749l0 = str12;
        this.f43751m0 = i13;
        this.f43753n0 = j18;
    }
}
