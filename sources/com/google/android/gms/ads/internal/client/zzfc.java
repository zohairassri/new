package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import yl.y1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfc> CREATOR = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22297c;

    public zzfc(int i11, int i12, String str) {
        this.f22295a = i11;
        this.f22296b = i12;
        this.f22297c = str;
    }

    public final int j() {
        return this.f22296b;
    }

    public final String l() {
        return this.f22297c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f22295a);
        um.a.l(parcel, 2, this.f22296b);
        um.a.u(parcel, 3, this.f22297c, false);
        um.a.b(parcel, iA);
    }
}
