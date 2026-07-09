package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22958e;

    zzr(boolean z11, String str, int i11, int i12, long j11) {
        this.f22954a = z11;
        this.f22955b = str;
        this.f22956c = g0.a(i11) - 1;
        this.f22957d = m.a(i12) - 1;
        this.f22958e = j11;
    }

    public final int C() {
        return m.a(this.f22957d);
    }

    public final String j() {
        return this.f22955b;
    }

    public final int l() {
        return g0.a(this.f22956c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.c(parcel, 1, this.f22954a);
        um.a.u(parcel, 2, this.f22955b, false);
        um.a.l(parcel, 3, this.f22956c);
        um.a.l(parcel, 4, this.f22957d);
        um.a.p(parcel, 5, this.f22958e);
        um.a.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f22954a;
    }

    public final long zzc() {
        return this.f22958e;
    }
}
