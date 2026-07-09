package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new rm.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Intent f22515a;

    public CloudMessage(Intent intent) {
        this.f22515a = intent;
    }

    public Intent j() {
        return this.f22515a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.s(parcel, 1, this.f22515a, i11, false);
        um.a.b(parcel, iA);
    }
}
