package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbb extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbb> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f43720a;

    zzbb(Bundle bundle) {
        this.f43720a = bundle;
    }

    final Double C(String str) {
        return Double.valueOf(this.f43720a.getDouble(str));
    }

    public final Bundle M() {
        return new Bundle(this.f43720a);
    }

    final String h2(String str) {
        return this.f43720a.getString(str);
    }

    final Object i1(String str) {
        return this.f43720a.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new a0(this);
    }

    public final int j() {
        return this.f43720a.size();
    }

    final Long p0(String str) {
        return Long.valueOf(this.f43720a.getLong(str));
    }

    public final String toString() {
        return this.f43720a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.e(parcel, 2, M(), false);
        um.a.b(parcel, iA);
    }
}
