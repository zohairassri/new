package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import wm.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22831b;

    public ModuleAvailabilityResponse(boolean z11, int i11) {
        this.f22830a = z11;
        this.f22831b = i11;
    }

    public boolean j() {
        return this.f22830a;
    }

    public int l() {
        return this.f22831b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.c(parcel, 1, j());
        um.a.l(parcel, 2, l());
        um.a.b(parcel, iA);
    }
}
