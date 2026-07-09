package mr;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f116920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f116921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeUnit f116922c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116923a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f116923a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116923a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116923a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j11, long j12, TimeUnit timeUnit) {
        this.f116920a = j11;
        this.f116921b = j12;
        this.f116922c = timeUnit;
    }

    public double a() {
        int i11 = a.f116923a[this.f116922c.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? this.f116920a / this.f116922c.toSeconds(this.f116921b) : (this.f116920a / this.f116921b) * TimeUnit.SECONDS.toMillis(1L) : (this.f116920a / this.f116921b) * TimeUnit.SECONDS.toMicros(1L) : (this.f116920a / this.f116921b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
