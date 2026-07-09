package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22552d;

    public Feature(String str, int i11, long j11, boolean z11) {
        this.f22549a = str;
        this.f22550b = i11;
        this.f22551c = j11;
        this.f22552d = z11;
    }

    public long C() {
        long j11 = this.f22551c;
        return j11 == -1 ? this.f22550b : j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (com.google.android.gms.common.internal.m.a(l(), feature.l()) && C() == feature.C() && j() == feature.j()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.m.b(l(), Long.valueOf(C()), Boolean.valueOf(j()));
    }

    public boolean j() {
        return this.f22552d;
    }

    public String l() {
        return this.f22549a;
    }

    public final String toString() {
        m.a aVarC = com.google.android.gms.common.internal.m.c(this);
        aVarC.a("name", l());
        aVarC.a("version", Long.valueOf(C()));
        aVarC.a("is_fully_rolled_out", Boolean.valueOf(j()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, l(), false);
        um.a.l(parcel, 2, this.f22550b);
        um.a.p(parcel, 3, C());
        um.a.c(parcel, 4, j());
        um.a.b(parcel, iA);
    }

    public Feature(String str, long j11) {
        this(str, -1, j11, false);
    }

    public Feature(String str, long j11, boolean z11) {
        this(str, -1, j11, z11);
    }
}
