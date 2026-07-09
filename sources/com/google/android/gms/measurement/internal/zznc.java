package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznc> CREATOR = new cb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f43731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Float f43732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f43735h;

    zznc(eb ebVar) {
        this(ebVar.f42966c, ebVar.f42967d, ebVar.f42968e, ebVar.f42965b);
    }

    public final Object j() {
        Long l11 = this.f43731d;
        if (l11 != null) {
            return l11;
        }
        Double d11 = this.f43735h;
        if (d11 != null) {
            return d11;
        }
        String str = this.f43733f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f43728a);
        um.a.u(parcel, 2, this.f43729b, false);
        um.a.p(parcel, 3, this.f43730c);
        um.a.q(parcel, 4, this.f43731d, false);
        um.a.j(parcel, 5, null, false);
        um.a.u(parcel, 6, this.f43733f, false);
        um.a.u(parcel, 7, this.f43734g, false);
        um.a.h(parcel, 8, this.f43735h, false);
        um.a.b(parcel, iA);
    }

    zznc(String str, long j11, Object obj, String str2) {
        com.google.android.gms.common.internal.n.f(str);
        this.f43728a = 2;
        this.f43729b = str;
        this.f43730c = j11;
        this.f43734g = str2;
        if (obj == null) {
            this.f43731d = null;
            this.f43732e = null;
            this.f43735h = null;
            this.f43733f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f43731d = (Long) obj;
            this.f43732e = null;
            this.f43735h = null;
            this.f43733f = null;
            return;
        }
        if (obj instanceof String) {
            this.f43731d = null;
            this.f43732e = null;
            this.f43735h = null;
            this.f43733f = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.f43731d = null;
        this.f43732e = null;
        this.f43735h = (Double) obj;
        this.f43733f = null;
    }

    zznc(int i11, String str, long j11, Long l11, Float f11, String str2, String str3, Double d11) {
        this.f43728a = i11;
        this.f43729b = str;
        this.f43730c = j11;
        this.f43731d = l11;
        this.f43732e = null;
        if (i11 == 1) {
            this.f43735h = f11 != null ? Double.valueOf(f11.doubleValue()) : null;
        } else {
            this.f43735h = d11;
        }
        this.f43733f = str2;
        this.f43734g = str3;
    }
}
