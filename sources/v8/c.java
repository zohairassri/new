package v8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f132566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f132567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f132568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f132569d;

    public c(long j11, long j12, boolean z11, List states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f132566a = states;
        this.f132567b = j11;
        this.f132568c = j12;
        this.f132569d = z11;
    }

    public final long a() {
        return this.f132568c;
    }

    public final long b() {
        return this.f132567b;
    }

    public final List c() {
        return this.f132566a;
    }

    public final boolean d() {
        return this.f132569d;
    }

    public final void e(long j11, long j12, boolean z11) {
        this.f132567b = j11;
        this.f132568c = j12;
        this.f132569d = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        c cVar = (c) obj;
        return this.f132567b == cVar.f132567b && this.f132568c == cVar.f132568c && this.f132569d == cVar.f132569d && Intrinsics.areEqual(this.f132566a, cVar.f132566a);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f132567b) * 31) + Long.hashCode(this.f132568c)) * 31) + Boolean.hashCode(this.f132569d)) * 31) + this.f132566a.hashCode();
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f132567b + ", frameDurationUiNanos=" + this.f132568c + ", isJank=" + this.f132569d + ", states=" + this.f132566a + ')';
    }
}
