package androidx.media3.exoplayer.video;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f10807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Range f10808d;

    public l(float f11) {
        k6.a.a(f11 > 0.0f);
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f11)));
        this.f10808d = range;
        this.f10807c = ((Double) range.getUpper()).doubleValue();
        this.f10805a = -9223372036854775807L;
        this.f10806b = -9223372036854775807L;
    }

    private double a(long j11, long j12) {
        long j13 = this.f10805a;
        if (j13 != -9223372036854775807L) {
            if (this.f10806b != -9223372036854775807L && j11 != j13) {
                return (j12 - r4) / (j11 - j13);
            }
        }
        return ((Double) this.f10808d.getUpper()).doubleValue();
    }

    private void f(double d11) {
        this.f10807c = (this.f10807c * 0.800000011920929d) + (d11 * 0.20000000298023224d);
    }

    public void b(long j11, long j12) {
        k6.a.a(j11 != -9223372036854775807L);
        k6.a.a(j12 != -9223372036854775807L);
        f(((Double) this.f10808d.clamp(Double.valueOf(a(j11, j12)))).doubleValue());
        this.f10805a = j11;
        this.f10806b = j12;
    }

    public long c(long j11) {
        if (this.f10805a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f10806b + ((j11 - r0) * this.f10807c));
    }

    public void d() {
        this.f10807c = ((Double) this.f10808d.getUpper()).doubleValue();
        this.f10805a = -9223372036854775807L;
        this.f10806b = -9223372036854775807L;
    }

    public void e(float f11) {
        k6.a.a(f11 > 0.0f);
        this.f10808d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f11)));
        d();
    }
}
