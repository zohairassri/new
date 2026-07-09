package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f42699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final List f42698b = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new d();

    LocationResult(List list) {
        this.f42699a = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f42699a.size() != this.f42699a.size()) {
            return false;
        }
        Iterator it = locationResult.f42699a.iterator();
        Iterator it2 = this.f42699a.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator it = this.f42699a.iterator();
        int i11 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i11 = (i11 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i11;
    }

    public List j() {
        return this.f42699a;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f42699a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 27);
        sb2.append("LocationResult[locations: ");
        sb2.append(strValueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.y(parcel, 1, j(), false);
        um.a.b(parcel, iA);
    }
}
