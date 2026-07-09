package v8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f132570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j11, long j12, long j13, boolean z11, List states) {
        super(j11, j12, z11, states);
        Intrinsics.checkNotNullParameter(states, "states");
        this.f132570e = j13;
    }

    @Override // v8.c
    public boolean equals(Object obj) {
        return (obj instanceof d) && super.equals(obj) && this.f132570e == ((d) obj).f132570e;
    }

    public final long f() {
        return this.f132570e;
    }

    public final void g(long j11, long j12, long j13, boolean z11) {
        super.e(j11, j12, z11);
        this.f132570e = j13;
    }

    @Override // v8.c
    public int hashCode() {
        return (super.hashCode() * 31) + Long.hashCode(this.f132570e);
    }

    @Override // v8.c
    public String toString() {
        return "FrameData(frameStartNanos=" + b() + ", frameDurationUiNanos=" + a() + ", frameDurationCpuNanos=" + this.f132570e + ", isJank=" + d() + ", states=" + c() + ')';
    }
}
