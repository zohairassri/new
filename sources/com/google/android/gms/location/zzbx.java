package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import mn.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42745d;

    public zzbx(int i11, int i12, int i13, int i14) {
        n.q(i11 >= 0 && i11 <= 23, "Start hour must be in range [0, 23].");
        n.q(i12 >= 0 && i12 <= 59, "Start minute must be in range [0, 59].");
        n.q(i13 >= 0 && i13 <= 23, "End hour must be in range [0, 23].");
        n.q(i14 >= 0 && i14 <= 59, "End minute must be in range [0, 59].");
        n.q(((i11 + i12) + i13) + i14 > 0, "Parameters can't be all 0.");
        this.f42742a = i11;
        this.f42743b = i12;
        this.f42744c = i13;
        this.f42745d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.f42742a == zzbxVar.f42742a && this.f42743b == zzbxVar.f42743b && this.f42744c == zzbxVar.f42744c && this.f42745d == zzbxVar.f42745d;
    }

    public final int hashCode() {
        return m.b(Integer.valueOf(this.f42742a), Integer.valueOf(this.f42743b), Integer.valueOf(this.f42744c), Integer.valueOf(this.f42745d));
    }

    public final String toString() {
        int i11 = this.f42742a;
        int i12 = this.f42743b;
        int i13 = this.f42744c;
        int i14 = this.f42745d;
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i11);
        sb2.append(", startMinute=");
        sb2.append(i12);
        sb2.append(", endHour=");
        sb2.append(i13);
        sb2.append(", endMinute=");
        sb2.append(i14);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        n.l(parcel);
        int iA = um.a.a(parcel);
        um.a.l(parcel, 1, this.f42742a);
        um.a.l(parcel, 2, this.f42743b);
        um.a.l(parcel, 3, this.f42744c);
        um.a.l(parcel, 4, this.f42745d);
        um.a.b(parcel, iA);
    }
}
