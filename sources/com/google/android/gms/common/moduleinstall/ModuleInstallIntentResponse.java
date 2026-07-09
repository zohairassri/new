package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import um.a;
import wm.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f22832a;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f22832a = pendingIntent;
    }

    public PendingIntent j() {
        return this.f22832a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = a.a(parcel);
        a.s(parcel, 1, j(), i11, false);
        a.b(parcel, iA);
    }
}
