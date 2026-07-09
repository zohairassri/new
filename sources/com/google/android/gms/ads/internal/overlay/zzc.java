package com.google.android.gms.ads.internal.overlay;

import am.l;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f22404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final am.b f22405i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f22406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f22407m;

    public zzc(Intent intent, am.b bVar) {
        this(null, null, null, null, null, null, null, intent, com.google.android.gms.dynamic.b.k1(bVar).asBinder(), false, new Bundle());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f22397a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 2, str, false);
        um.a.u(parcel, 3, this.f22398b, false);
        um.a.u(parcel, 4, this.f22399c, false);
        um.a.u(parcel, 5, this.f22400d, false);
        um.a.u(parcel, 6, this.f22401e, false);
        um.a.u(parcel, 7, this.f22402f, false);
        um.a.u(parcel, 8, this.f22403g, false);
        um.a.s(parcel, 9, this.f22404h, i11, false);
        um.a.k(parcel, 10, com.google.android.gms.dynamic.b.k1(this.f22405i).asBinder(), false);
        um.a.c(parcel, 11, this.f22406l);
        um.a.e(parcel, 12, this.f22407m, false);
        um.a.b(parcel, iA);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z11, Bundle bundle) {
        this.f22397a = str;
        this.f22398b = str2;
        this.f22399c = str3;
        this.f22400d = str4;
        this.f22401e = str5;
        this.f22402f = str6;
        this.f22403g = str7;
        this.f22404h = intent;
        this.f22405i = (am.b) com.google.android.gms.dynamic.b.I0(a.AbstractBinderC0319a.Y(iBinder));
        this.f22406l = z11;
        this.f22407m = bundle;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, am.b bVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, com.google.android.gms.dynamic.b.k1(bVar).asBinder(), false, new Bundle());
    }
}
