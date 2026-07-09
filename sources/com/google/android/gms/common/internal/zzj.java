package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f22824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Feature[] f22825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f22826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ConnectionTelemetryConfiguration f22827d;

    zzj(Bundle bundle, Feature[] featureArr, int i11, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f22824a = bundle;
        this.f22825b = featureArr;
        this.f22826c = i11;
        this.f22827d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.e(parcel, 1, this.f22824a, false);
        um.a.x(parcel, 2, this.f22825b, i11, false);
        um.a.l(parcel, 3, this.f22826c);
        um.a.s(parcel, 4, this.f22827d, i11, false);
        um.a.b(parcel, iA);
    }
}
