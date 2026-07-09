package tg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f130093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f130094b;

    public f(long j11, long j12) {
        this.f130093a = j11;
        this.f130094b = j12;
    }

    public final long a() {
        return this.f130094b;
    }

    public final long b() {
        return this.f130093a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f130093a == fVar.f130093a && this.f130094b == fVar.f130094b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f130093a) * 31) + Long.hashCode(this.f130094b);
    }

    public String toString() {
        return "Time(timestamp=" + this.f130093a + ", nanoTime=" + this.f130094b + ")";
    }

    public /* synthetic */ f(long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? System.currentTimeMillis() : j11, (i11 & 2) != 0 ? System.nanoTime() : j12);
    }
}
