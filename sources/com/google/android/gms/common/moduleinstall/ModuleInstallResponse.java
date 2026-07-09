package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import um.a;
import wm.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22834b;

    public ModuleInstallResponse(int i11, boolean z11) {
        this.f22833a = i11;
        this.f22834b = z11;
    }

    public int j() {
        return this.f22833a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = a.a(parcel);
        a.l(parcel, 1, j());
        a.c(parcel, 2, this.f22834b);
        a.b(parcel, iA);
    }
}
