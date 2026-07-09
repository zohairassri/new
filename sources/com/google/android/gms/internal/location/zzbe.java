package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import io.agora.base.internal.video.FactorBitrateAdjuster;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new in.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f40122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f40123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f40124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f40125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f40126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f40127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f40128i;

    public zzbe(String str, int i11, short s11, double d11, double d12, float f11, long j11, int i12, int i13) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f11 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("invalid radius: ");
            sb2.append(f11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d11 > 90.0d || d11 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("invalid latitude: ");
            sb3.append(d11);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d12 > 180.0d || d12 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(43);
            sb4.append("invalid longitude: ");
            sb4.append(d12);
            throw new IllegalArgumentException(sb4.toString());
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            StringBuilder sb5 = new StringBuilder(46);
            sb5.append("No supported transition specified: ");
            sb5.append(i11);
            throw new IllegalArgumentException(sb5.toString());
        }
        this.f40122c = s11;
        this.f40120a = str;
        this.f40123d = d11;
        this.f40124e = d12;
        this.f40125f = f11;
        this.f40121b = j11;
        this.f40126g = i14;
        this.f40127h = i12;
        this.f40128i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.f40125f == zzbeVar.f40125f && this.f40123d == zzbeVar.f40123d && this.f40124e == zzbeVar.f40124e && this.f40122c == zzbeVar.f40122c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f40123d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f40124e);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f40125f)) * 31) + this.f40122c) * 31) + this.f40126g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s11 = this.f40122c;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s11 != -1 ? s11 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.f40120a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f40126g), Double.valueOf(this.f40123d), Double.valueOf(this.f40124e), Float.valueOf(this.f40125f), Integer.valueOf(this.f40127h / FactorBitrateAdjuster.FACTOR_BASE), Integer.valueOf(this.f40128i), Long.valueOf(this.f40121b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iA = um.a.a(parcel);
        um.a.u(parcel, 1, this.f40120a, false);
        um.a.p(parcel, 2, this.f40121b);
        um.a.t(parcel, 3, this.f40122c);
        um.a.g(parcel, 4, this.f40123d);
        um.a.g(parcel, 5, this.f40124e);
        um.a.i(parcel, 6, this.f40125f);
        um.a.l(parcel, 7, this.f40126g);
        um.a.l(parcel, 8, this.f40127h);
        um.a.l(parcel, 9, this.f40128i);
        um.a.b(parcel, iA);
    }
}
