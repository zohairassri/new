package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22582b;

    Scope(int i11, String str) {
        n.g(str, "scopeUri must not be null or empty");
        this.f22581a = i11;
        this.f22582b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f22582b.equals(((Scope) obj).f22582b);
        }
        return false;
    }

    public int hashCode() {
        return this.f22582b.hashCode();
    }

    public String j() {
        return this.f22582b;
    }

    public String toString() {
        return this.f22582b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.f22581a;
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, i12);
        um.a.u(parcel, 2, j(), false);
        um.a.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
