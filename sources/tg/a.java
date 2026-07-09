package tg;

import com.amazonaws.event.ProgressEvent;
import io.agora.rtc2.Constants;
import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.rtc2.internal.Marshallable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1767a f130054q = new C1767a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f130055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f130056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f130057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f130058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f130059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f130060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f130061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f130062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f130063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f130064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f130065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f130066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f130067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f130068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f130069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f130070p;

    /* JADX INFO: renamed from: tg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1767a {
        public /* synthetic */ C1767a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1767a() {
        }
    }

    public a(int i11, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z11, long j21, long j22, long j23, long j24, double d11) {
        this.f130055a = i11;
        this.f130056b = j11;
        this.f130057c = j12;
        this.f130058d = j13;
        this.f130059e = j14;
        this.f130060f = j15;
        this.f130061g = j16;
        this.f130062h = j17;
        this.f130063i = j18;
        this.f130064j = j19;
        this.f130065k = z11;
        this.f130066l = j21;
        this.f130067m = j22;
        this.f130068n = j23;
        this.f130069o = j24;
        this.f130070p = d11;
    }

    public final long a() {
        return this.f130069o;
    }

    public final double b() {
        return this.f130070p;
    }

    public final void c(long j11) {
        this.f130058d = j11;
    }

    public final void d(long j11) {
        this.f130062h = j11;
    }

    public final void e(long j11) {
        this.f130069o = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f130055a == aVar.f130055a && this.f130056b == aVar.f130056b && this.f130057c == aVar.f130057c && this.f130058d == aVar.f130058d && this.f130059e == aVar.f130059e && this.f130060f == aVar.f130060f && this.f130061g == aVar.f130061g && this.f130062h == aVar.f130062h && this.f130063i == aVar.f130063i && this.f130064j == aVar.f130064j && this.f130065k == aVar.f130065k && this.f130066l == aVar.f130066l && this.f130067m == aVar.f130067m && this.f130068n == aVar.f130068n && this.f130069o == aVar.f130069o && Double.compare(this.f130070p, aVar.f130070p) == 0;
    }

    public final void f(double d11) {
        this.f130070p = d11;
    }

    public final void g(long j11) {
        this.f130060f = j11;
    }

    public final void h(int i11) {
        this.f130055a = i11;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.f130055a) * 31) + Long.hashCode(this.f130056b)) * 31) + Long.hashCode(this.f130057c)) * 31) + Long.hashCode(this.f130058d)) * 31) + Long.hashCode(this.f130059e)) * 31) + Long.hashCode(this.f130060f)) * 31) + Long.hashCode(this.f130061g)) * 31) + Long.hashCode(this.f130062h)) * 31) + Long.hashCode(this.f130063i)) * 31) + Long.hashCode(this.f130064j)) * 31) + Boolean.hashCode(this.f130065k)) * 31) + Long.hashCode(this.f130066l)) * 31) + Long.hashCode(this.f130067m)) * 31) + Long.hashCode(this.f130068n)) * 31) + Long.hashCode(this.f130069o)) * 31) + Double.hashCode(this.f130070p);
    }

    public final void i(boolean z11) {
        this.f130065k = z11;
    }

    public final void j(long j11) {
        this.f130068n = j11;
    }

    public final void k(long j11) {
        this.f130057c = j11;
    }

    public final void l(long j11) {
        this.f130066l = j11;
    }

    public final void m(long j11) {
        this.f130059e = j11;
    }

    public final void n(long j11) {
        this.f130063i = j11;
    }

    public final void o(long j11) {
        this.f130061g = j11;
    }

    public final void p(long j11) {
        this.f130064j = j11;
    }

    public final void q(long j11) {
        this.f130056b = j11;
    }

    public final void r(long j11) {
        this.f130067m = j11;
    }

    public String toString() {
        return "FrameMetricsData(droppedFrames=" + this.f130055a + ", unknownDelayDuration=" + this.f130056b + ", inputHandlingDuration=" + this.f130057c + ", animationDuration=" + this.f130058d + ", layoutMeasureDuration=" + this.f130059e + ", drawDuration=" + this.f130060f + ", syncDuration=" + this.f130061g + ", commandIssueDuration=" + this.f130062h + ", swapBuffersDuration=" + this.f130063i + ", totalDuration=" + this.f130064j + ", firstDrawFrame=" + this.f130065k + ", intendedVsyncTimestamp=" + this.f130066l + ", vsyncTimestamp=" + this.f130067m + ", gpuDuration=" + this.f130068n + ", deadline=" + this.f130069o + ", displayRefreshRate=" + this.f130070p + ")";
    }

    public /* synthetic */ a(int i11, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, boolean z11, long j21, long j22, long j23, long j24, double d11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? 0L : j12, (i12 & 8) != 0 ? 0L : j13, (i12 & 16) != 0 ? 0L : j14, (i12 & 32) != 0 ? 0L : j15, (i12 & 64) != 0 ? 0L : j16, (i12 & 128) != 0 ? 0L : j17, (i12 & 256) != 0 ? 0L : j18, (i12 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0 ? 0L : j19, (i12 & 1024) == 0 ? z11 : false, (i12 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? 0L : j21, (i12 & 4096) != 0 ? 0L : j22, (i12 & Marshallable.PROTO_PACKET_SIZE) != 0 ? 0L : j23, (i12 & 16384) == 0 ? j24 : 0L, (i12 & Constants.EAR_MONITORING_FILTER_REUSE_POST_PROCESSING_FILTER) != 0 ? 60.0d : d11);
    }
}
