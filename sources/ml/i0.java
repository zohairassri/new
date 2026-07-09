package ml;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f116784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f116785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f116786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f116787d = new ThreadLocal();

    public i0(long j11) {
        g(j11);
    }

    public static long f(long j11) {
        return (j11 * 1000000) / 90000;
    }

    public static long h(long j11) {
        return (j11 * 90000) / 1000000;
    }

    public synchronized long a(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f116785b == -9223372036854775807L) {
                long jLongValue = this.f116784a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.e((Long) this.f116787d.get())).longValue();
                }
                this.f116785b = jLongValue - j11;
                notifyAll();
            }
            this.f116786c = j11;
            return j11 + this.f116785b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f116786c;
            if (j12 != -9223372036854775807L) {
                long jH = h(j12);
                long j13 = (4294967296L + jH) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j11;
                j11 += j13 * 8589934592L;
                if (Math.abs(j14 - jH) < Math.abs(j11 - jH)) {
                    j11 = j14;
                }
            }
            return a(f(j11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c() {
        long j11;
        j11 = this.f116784a;
        if (j11 == LongCompanionObject.MAX_VALUE || j11 == 9223372036854775806L) {
            j11 = -9223372036854775807L;
        }
        return j11;
    }

    public synchronized long d() {
        long j11;
        try {
            j11 = this.f116786c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 != -9223372036854775807L ? j11 + this.f116785b : c();
    }

    public synchronized long e() {
        return this.f116785b;
    }

    public synchronized void g(long j11) {
        this.f116784a = j11;
        this.f116785b = j11 == LongCompanionObject.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f116786c = -9223372036854775807L;
    }
}
