package h6;

import k6.n0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f100397d = new w(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f100398e = n0.B0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f100399f = n0.B0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f100400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f100401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f100402c;

    public w(float f11) {
        this(f11, 1.0f);
    }

    public long a(long j11) {
        return j11 * ((long) this.f100402c);
    }

    public w b(float f11) {
        return new w(f11, this.f100401b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f100400a == wVar.f100400a && this.f100401b == wVar.f100401b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f100400a)) * 31) + Float.floatToRawIntBits(this.f100401b);
    }

    public String toString() {
        return n0.E("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f100400a), Float.valueOf(this.f100401b));
    }

    public w(float f11, float f12) {
        k6.a.a(f11 > 0.0f);
        k6.a.a(f12 > 0.0f);
        this.f100400a = f11;
        this.f100401b = f12;
        this.f100402c = Math.round(f11 * 1000.0f);
    }
}
