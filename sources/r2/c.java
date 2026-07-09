package r2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f123464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f123465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f123466c;

    public /* synthetic */ c(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13);
    }

    public final long a() {
        return this.f123466c;
    }

    public final long b() {
        return this.f123465b;
    }

    public final long c() {
        return this.f123464a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f123464a + ", position=" + ((Object) e2.f.s(this.f123465b)) + ')';
    }

    public /* synthetic */ c(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    private c(long j11, long j12) {
        this.f123464a = j11;
        this.f123465b = j12;
        this.f123466c = e2.f.f90920b.c();
    }

    private c(long j11, long j12, long j13) {
        this(j11, j12, (DefaultConstructorMarker) null);
        this.f123466c = j13;
    }
}
