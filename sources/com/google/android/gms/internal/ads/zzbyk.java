package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.a;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbyk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyk> CREATOR = new cg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f39602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f39603b;

    public zzbyk(IBinder iBinder, IBinder iBinder2) {
        this.f39602a = (View) com.google.android.gms.dynamic.b.I0(a.AbstractBinderC0319a.Y(iBinder));
        this.f39603b = (Map) com.google.android.gms.dynamic.b.I0(a.AbstractBinderC0319a.Y(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        View view = this.f39602a;
        int iA = um.a.a(parcel);
        um.a.k(parcel, 1, com.google.android.gms.dynamic.b.k1(view).asBinder(), false);
        um.a.k(parcel, 2, com.google.android.gms.dynamic.b.k1(this.f39603b).asBinder(), false);
        um.a.b(parcel, iA);
    }
}
