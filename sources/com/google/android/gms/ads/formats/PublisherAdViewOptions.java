package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import yl.f0;
import yl.g0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f22185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f22186c;

    PublisherAdViewOptions(boolean z11, IBinder iBinder, IBinder iBinder2) {
        this.f22184a = z11;
        this.f22185b = iBinder != null ? f0.n7(iBinder) : null;
        this.f22186c = iBinder2;
    }

    public final g0 j() {
        return this.f22185b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.c(parcel, 1, this.f22184a);
        g0 g0Var = this.f22185b;
        um.a.k(parcel, 2, g0Var == null ? null : g0Var.asBinder(), false);
        um.a.k(parcel, 3, this.f22186c, false);
        um.a.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f22184a;
    }
}
