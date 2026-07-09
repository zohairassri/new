package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f22514c;

    GoogleSignInOptionsExtensionParcelable(int i11, int i12, Bundle bundle) {
        this.f22512a = i11;
        this.f22513b = i12;
        this.f22514c = bundle;
    }

    public int j() {
        return this.f22513b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f22512a);
        um.a.l(parcel, 2, j());
        um.a.e(parcel, 3, this.f22514c, false);
        um.a.b(parcel, iA);
    }
}
