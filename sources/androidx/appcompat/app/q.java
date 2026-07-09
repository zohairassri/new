package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q f1600d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1603c;

    q() {
    }

    static q b() {
        if (f1600d == null) {
            f1600d = new q();
        }
        return f1600d;
    }

    public void a(long j11, double d11, double d12) {
        double d13 = (0.01720197f * ((j11 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d13) * 0.03341960161924362d) + d13 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d12) / 360.0d) + (Math.sin(d13) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d14 = 0.01745329238474369d * d11;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d14) * Math.sin(dAsin))) / (Math.cos(d14) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f1603c = 1;
            this.f1601a = -1L;
            this.f1602b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f1603c = 0;
                this.f1601a = -1L;
                this.f1602b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f1601a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f1602b = jRound;
            if (jRound >= j11 || this.f1601a <= j11) {
                this.f1603c = 1;
            } else {
                this.f1603c = 0;
            }
        }
    }
}
