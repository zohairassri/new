package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22676b;

    public ClientIdentity(int i11, String str) {
        this.f22675a = i11;
        this.f22676b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f22675a == this.f22675a && m.a(clientIdentity.f22676b, this.f22676b);
    }

    public final int hashCode() {
        return this.f22675a;
    }

    public final String toString() {
        return this.f22675a + ":" + this.f22676b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22675a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.u(parcel, 2, this.f22676b, false);
        um.a.b(parcel, iA);
    }
}
