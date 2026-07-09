package te0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f129895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f129896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f129897c;

    public b(Object obj, long j11, TimeUnit timeUnit) {
        this.f129895a = obj;
        this.f129896b = j11;
        this.f129897c = (TimeUnit) ae0.b.e(timeUnit, "unit is null");
    }

    public long a() {
        return this.f129896b;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f129896b, this.f129897c);
    }

    public Object c() {
        return this.f129895a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (ae0.b.c(this.f129895a, bVar.f129895a) && this.f129896b == bVar.f129896b && ae0.b.c(this.f129897c, bVar.f129897c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f129895a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        long j11 = this.f129896b;
        return (((iHashCode * 31) + ((int) (j11 ^ (j11 >>> 31)))) * 31) + this.f129897c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f129896b + ", unit=" + this.f129897c + ", value=" + this.f129895a + "]";
    }
}
