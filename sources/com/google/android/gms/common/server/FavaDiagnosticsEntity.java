package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ym.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22850c;

    public FavaDiagnosticsEntity(int i11, String str, int i12) {
        this.f22848a = i11;
        this.f22849b = str;
        this.f22850c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22848a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.u(parcel, 2, this.f22849b, false);
        um.a.l(parcel, 3, this.f22850c);
        um.a.b(parcel, iA);
    }
}
