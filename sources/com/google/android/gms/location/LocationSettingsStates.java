package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new mn.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f42708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f42709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f42711f;

    public LocationSettingsStates(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f42706a = z11;
        this.f42707b = z12;
        this.f42708c = z13;
        this.f42709d = z14;
        this.f42710e = z15;
        this.f42711f = z16;
    }

    public boolean C() {
        return this.f42709d;
    }

    public boolean M() {
        return this.f42706a;
    }

    public boolean i1() {
        return this.f42707b;
    }

    public boolean j() {
        return this.f42711f;
    }

    public boolean l() {
        return this.f42708c;
    }

    public boolean p0() {
        return this.f42710e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.c(parcel, 1, M());
        um.a.c(parcel, 2, i1());
        um.a.c(parcel, 3, l());
        um.a.c(parcel, 4, C());
        um.a.c(parcel, 5, p0());
        um.a.c(parcel, 6, j());
        um.a.b(parcel, iA);
    }
}
