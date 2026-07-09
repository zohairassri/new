package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class tj {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tj f35504d = new tj(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35507c;

    static {
        String str = yy2.f38899a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public tj(float f11, float f12) {
        jx3.a(f11 > 0.0f);
        jx3.a(f12 > 0.0f);
        this.f35505a = f11;
        this.f35506b = f12;
        this.f35507c = Math.round(f11 * 1000.0f);
    }

    public final long a(long j11) {
        return j11 * ((long) this.f35507c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tj.class == obj.getClass()) {
            tj tjVar = (tj) obj;
            if (this.f35505a == tjVar.f35505a && this.f35506b == tjVar.f35506b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f35505a) + 527) * 31) + Float.floatToRawIntBits(this.f35506b);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f35505a), Float.valueOf(this.f35506b)};
        String str = yy2.f38899a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
