package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22183a;

    AdManagerAdViewOptions(boolean z11) {
        this.f22183a = z11;
    }

    public boolean j() {
        return this.f22183a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.c(parcel, 1, j());
        um.a.b(parcel, iA);
    }
}
