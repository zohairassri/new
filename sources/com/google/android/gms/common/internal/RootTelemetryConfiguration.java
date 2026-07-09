package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22713e;

    public RootTelemetryConfiguration(int i11, boolean z11, boolean z12, int i12, int i13) {
        this.f22709a = i11;
        this.f22710b = z11;
        this.f22711c = z12;
        this.f22712d = i12;
        this.f22713e = i13;
    }

    public boolean C() {
        return this.f22710b;
    }

    public boolean M() {
        return this.f22711c;
    }

    public int j() {
        return this.f22712d;
    }

    public int l() {
        return this.f22713e;
    }

    public int p0() {
        return this.f22709a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, p0());
        um.a.c(parcel, 2, C());
        um.a.c(parcel, 3, M());
        um.a.l(parcel, 4, j());
        um.a.l(parcel, 5, l());
        um.a.b(parcel, iA);
    }
}
