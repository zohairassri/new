package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzu> CREATOR = new ih0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f39646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f39647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f39648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PackageInfo f39651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f39653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zzflg f39654i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f39655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f39656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f39657n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bundle f39658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f39659s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f39660v;

    public zzbzu(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzflg zzflgVar, String str4, boolean z11, boolean z12, Bundle bundle2, Bundle bundle3, int i11) {
        this.f39646a = bundle;
        this.f39647b = versionInfoParcel;
        this.f39649d = str;
        this.f39648c = applicationInfo;
        this.f39650e = list;
        this.f39651f = packageInfo;
        this.f39652g = str2;
        this.f39653h = str3;
        this.f39654i = zzflgVar;
        this.f39655l = str4;
        this.f39656m = z11;
        this.f39657n = z12;
        this.f39658r = bundle2;
        this.f39659s = bundle3;
        this.f39660v = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Bundle bundle = this.f39646a;
        int iA = um.a.a(parcel);
        um.a.e(parcel, 1, bundle, false);
        um.a.s(parcel, 2, this.f39647b, i11, false);
        um.a.s(parcel, 3, this.f39648c, i11, false);
        um.a.u(parcel, 4, this.f39649d, false);
        um.a.w(parcel, 5, this.f39650e, false);
        um.a.s(parcel, 6, this.f39651f, i11, false);
        um.a.u(parcel, 7, this.f39652g, false);
        um.a.u(parcel, 9, this.f39653h, false);
        um.a.s(parcel, 10, this.f39654i, i11, false);
        um.a.u(parcel, 11, this.f39655l, false);
        um.a.c(parcel, 12, this.f39656m);
        um.a.c(parcel, 13, this.f39657n);
        um.a.e(parcel, 14, this.f39658r, false);
        um.a.e(parcel, 15, this.f39659s, false);
        um.a.l(parcel, 16, this.f39660v);
        um.a.b(parcel, iA);
    }
}
