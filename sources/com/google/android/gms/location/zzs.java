package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f42748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f42749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f42750e;

    public zzs() {
        this(true, 50L, 0.0f, LongCompanionObject.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f42746a == zzsVar.f42746a && this.f42747b == zzsVar.f42747b && Float.compare(this.f42748c, zzsVar.f42748c) == 0 && this.f42749d == zzsVar.f42749d && this.f42750e == zzsVar.f42750e;
    }

    public final int hashCode() {
        return m.b(Boolean.valueOf(this.f42746a), Long.valueOf(this.f42747b), Float.valueOf(this.f42748c), Long.valueOf(this.f42749d), Integer.valueOf(this.f42750e));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f42746a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f42747b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f42748c);
        long j11 = this.f42749d;
        if (j11 != LongCompanionObject.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f42750e != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f42750e);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.c(parcel, 1, this.f42746a);
        um.a.p(parcel, 2, this.f42747b);
        um.a.i(parcel, 3, this.f42748c);
        um.a.p(parcel, 4, this.f42749d);
        um.a.l(parcel, 5, this.f42750e);
        um.a.b(parcel, iA);
    }

    zzs(boolean z11, long j11, float f11, long j12, int i11) {
        this.f42746a = z11;
        this.f42747b = j11;
        this.f42748c = f11;
        this.f42749d = j12;
        this.f42750e = i11;
    }
}
