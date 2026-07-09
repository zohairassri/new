package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nm.e;
import um.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22470b;

    public zzc(String str, int i11) {
        this.f22469a = str;
        this.f22470b = i11;
    }

    public final int j() {
        return this.f22470b;
    }

    public final String l() {
        return this.f22469a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = a.a(parcel);
        a.u(parcel, 1, this.f22469a, false);
        a.l(parcel, 2, this.f22470b);
        a.b(parcel, iA);
    }
}
