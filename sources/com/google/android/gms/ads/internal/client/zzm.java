package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import yl.r2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new r2();
    public final zzc B;
    public final int N;
    public final String S;
    public final List X;
    public final int Y;
    public final String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f22310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22316i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int f22317i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final long f22318j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final long f22319k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzfx f22320l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Bundle f22321l0 = new Bundle();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Location f22322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f22323n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f22324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f22325s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f22326v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f22327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f22328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f22329y;

    public zzm(int i11, long j11, Bundle bundle, int i12, List list, boolean z11, int i13, boolean z12, String str, zzfx zzfxVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z13, zzc zzcVar, int i14, String str5, List list3, int i15, String str6, int i16, long j12, long j13) {
        this.f22308a = i11;
        this.f22309b = j11;
        this.f22310c = bundle == null ? new Bundle() : bundle;
        this.f22311d = i12;
        this.f22312e = list;
        this.f22313f = z11;
        this.f22314g = i13;
        this.f22315h = z12;
        this.f22316i = str;
        this.f22320l = zzfxVar;
        this.f22322m = location;
        this.f22323n = str2;
        this.f22324r = bundle2 == null ? new Bundle() : bundle2;
        this.f22325s = bundle3;
        this.f22326v = list2;
        this.f22327w = str3;
        this.f22328x = str4;
        this.f22329y = z13;
        this.B = zzcVar;
        this.N = i14;
        this.S = str5;
        this.X = list3 == null ? new ArrayList() : list3;
        this.Y = i15;
        this.Z = str6;
        this.f22317i0 = i16;
        this.f22318j0 = j12;
        this.f22319k0 = j13;
    }

    public final boolean C() {
        return this.f22310c.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return j(obj) && this.f22318j0 == ((zzm) obj).f22318j0;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.m.b(Integer.valueOf(this.f22308a), Long.valueOf(this.f22309b), this.f22310c, Integer.valueOf(this.f22311d), this.f22312e, Boolean.valueOf(this.f22313f), Integer.valueOf(this.f22314g), Boolean.valueOf(this.f22315h), this.f22316i, this.f22320l, this.f22322m, this.f22323n, this.f22324r, this.f22325s, this.f22326v, this.f22327w, this.f22328x, Boolean.valueOf(this.f22329y), Integer.valueOf(this.N), this.S, this.X, Integer.valueOf(this.Y), this.Z, Integer.valueOf(this.f22317i0), Long.valueOf(this.f22318j0), Long.valueOf(this.f22319k0));
    }

    public final boolean j(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.f22308a == zzmVar.f22308a && this.f22309b == zzmVar.f22309b && cm.p.a(this.f22310c, zzmVar.f22310c) && this.f22311d == zzmVar.f22311d && com.google.android.gms.common.internal.m.a(this.f22312e, zzmVar.f22312e) && this.f22313f == zzmVar.f22313f && this.f22314g == zzmVar.f22314g && this.f22315h == zzmVar.f22315h && com.google.android.gms.common.internal.m.a(this.f22316i, zzmVar.f22316i) && com.google.android.gms.common.internal.m.a(this.f22320l, zzmVar.f22320l) && com.google.android.gms.common.internal.m.a(this.f22322m, zzmVar.f22322m) && com.google.android.gms.common.internal.m.a(this.f22323n, zzmVar.f22323n) && cm.p.a(this.f22324r, zzmVar.f22324r) && cm.p.a(this.f22325s, zzmVar.f22325s) && com.google.android.gms.common.internal.m.a(this.f22326v, zzmVar.f22326v) && com.google.android.gms.common.internal.m.a(this.f22327w, zzmVar.f22327w) && com.google.android.gms.common.internal.m.a(this.f22328x, zzmVar.f22328x) && this.f22329y == zzmVar.f22329y && this.N == zzmVar.N && com.google.android.gms.common.internal.m.a(this.S, zzmVar.S) && com.google.android.gms.common.internal.m.a(this.X, zzmVar.X) && this.Y == zzmVar.Y && com.google.android.gms.common.internal.m.a(this.Z, zzmVar.Z) && this.f22317i0 == zzmVar.f22317i0;
    }

    public final boolean l() {
        return zzc() || C();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22308a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.p(parcel, 2, this.f22309b);
        um.a.e(parcel, 3, this.f22310c, false);
        um.a.l(parcel, 4, this.f22311d);
        um.a.w(parcel, 5, this.f22312e, false);
        um.a.c(parcel, 6, this.f22313f);
        um.a.l(parcel, 7, this.f22314g);
        um.a.c(parcel, 8, this.f22315h);
        um.a.u(parcel, 9, this.f22316i, false);
        um.a.s(parcel, 10, this.f22320l, i11, false);
        um.a.s(parcel, 11, this.f22322m, i11, false);
        um.a.u(parcel, 12, this.f22323n, false);
        um.a.e(parcel, 13, this.f22324r, false);
        um.a.e(parcel, 14, this.f22325s, false);
        um.a.w(parcel, 15, this.f22326v, false);
        um.a.u(parcel, 16, this.f22327w, false);
        um.a.u(parcel, 17, this.f22328x, false);
        um.a.c(parcel, 18, this.f22329y);
        um.a.s(parcel, 19, this.B, i11, false);
        um.a.l(parcel, 20, this.N);
        um.a.u(parcel, 21, this.S, false);
        um.a.w(parcel, 22, this.X, false);
        um.a.l(parcel, 23, this.Y);
        um.a.u(parcel, 24, this.Z, false);
        um.a.l(parcel, 25, this.f22317i0);
        um.a.p(parcel, 26, this.f22318j0);
        um.a.p(parcel, 27, this.f22319k0);
        um.a.b(parcel, iA);
    }

    public final boolean zzc() {
        return this.f22310c.getBoolean("is_sdk_preload", false);
    }
}
