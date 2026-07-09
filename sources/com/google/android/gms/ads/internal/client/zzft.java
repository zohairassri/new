package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
import yl.k2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzft extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzft> CREATOR = new k2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzm f22300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22301d;

    public zzft(String str, int i11, zzm zzmVar, int i12) {
        this.f22298a = str;
        this.f22299b = i11;
        this.f22300c = zzmVar;
        this.f22301d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (this.f22298a.equals(zzftVar.f22298a) && this.f22299b == zzftVar.f22299b && this.f22300c.j(zzftVar.f22300c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f22298a, Integer.valueOf(this.f22299b), this.f22300c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f22298a;
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, str, false);
        um.a.l(parcel, 2, this.f22299b);
        um.a.s(parcel, 3, this.f22300c, i11, false);
        um.a.l(parcel, 4, this.f22301d);
        um.a.b(parcel, iA);
    }
}
