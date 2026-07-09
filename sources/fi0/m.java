package fi0;

import java.io.Serializable;
import org.threeten.bp.DateTimeException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f94353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f94354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f94355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f94356d;

    private m(long j11, long j12, long j13, long j14) {
        this.f94353a = j11;
        this.f94354b = j12;
        this.f94355c = j13;
        this.f94356d = j14;
    }

    public static m i(long j11, long j12) {
        if (j11 <= j12) {
            return new m(j11, j11, j12, j12);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static m j(long j11, long j12, long j13) {
        return k(j11, j11, j12, j13);
    }

    public static m k(long j11, long j12, long j13, long j14) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j13 > j14) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j12 <= j14) {
            return new m(j11, j12, j13, j14);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public int a(long j11, i iVar) {
        if (g(j11)) {
            return (int) j11;
        }
        throw new DateTimeException("Invalid int value for " + iVar + ": " + j11);
    }

    public long b(long j11, i iVar) {
        if (h(j11)) {
            return j11;
        }
        if (iVar == null) {
            throw new DateTimeException("Invalid value (valid values " + this + "): " + j11);
        }
        throw new DateTimeException("Invalid value for " + iVar + " (valid values " + this + "): " + j11);
    }

    public long c() {
        return this.f94356d;
    }

    public long d() {
        return this.f94353a;
    }

    public boolean e() {
        return this.f94353a == this.f94354b && this.f94355c == this.f94356d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f94353a == mVar.f94353a && this.f94354b == mVar.f94354b && this.f94355c == mVar.f94355c && this.f94356d == mVar.f94356d) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return d() >= -2147483648L && c() <= 2147483647L;
    }

    public boolean g(long j11) {
        return f() && h(j11);
    }

    public boolean h(long j11) {
        return j11 >= d() && j11 <= c();
    }

    public int hashCode() {
        long j11 = this.f94353a;
        long j12 = this.f94354b;
        long j13 = (j11 + j12) << ((int) (j12 + 16));
        long j14 = this.f94355c;
        long j15 = (j13 >> ((int) (j14 + 48))) << ((int) (j14 + 32));
        long j16 = this.f94356d;
        long j17 = ((j15 >> ((int) (32 + j16))) << ((int) (j16 + 48))) >> 16;
        return (int) (j17 ^ (j17 >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f94353a);
        if (this.f94353a != this.f94354b) {
            sb2.append('/');
            sb2.append(this.f94354b);
        }
        sb2.append(" - ");
        sb2.append(this.f94355c);
        if (this.f94355c != this.f94356d) {
            sb2.append('/');
            sb2.append(this.f94356d);
        }
        return sb2.toString();
    }
}
