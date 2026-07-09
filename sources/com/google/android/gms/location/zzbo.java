package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42738d;

    zzbo(int i11, int i12, long j11, long j12) {
        this.f42735a = i11;
        this.f42736b = i12;
        this.f42737c = j11;
        this.f42738d = j12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f42735a == zzboVar.f42735a && this.f42736b == zzboVar.f42736b && this.f42737c == zzboVar.f42737c && this.f42738d == zzboVar.f42738d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return m.b(Integer.valueOf(this.f42736b), Integer.valueOf(this.f42735a), Long.valueOf(this.f42738d), Long.valueOf(this.f42737c));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f42735a + " Cell status: " + this.f42736b + " elapsed time NS: " + this.f42738d + " system time ms: " + this.f42737c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f42735a);
        um.a.l(parcel, 2, this.f42736b);
        um.a.p(parcel, 3, this.f42737c);
        um.a.p(parcel, 4, this.f42738d);
        um.a.b(parcel, iA);
    }
}
