package tr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f130328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f130329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f130330f;

    public e0(String sessionId, String firstSessionId, int i11, long j11, e dataCollectionStatus, String firebaseInstallationId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        this.f130325a = sessionId;
        this.f130326b = firstSessionId;
        this.f130327c = i11;
        this.f130328d = j11;
        this.f130329e = dataCollectionStatus;
        this.f130330f = firebaseInstallationId;
    }

    public final e a() {
        return this.f130329e;
    }

    public final long b() {
        return this.f130328d;
    }

    public final String c() {
        return this.f130330f;
    }

    public final String d() {
        return this.f130326b;
    }

    public final String e() {
        return this.f130325a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f130325a, e0Var.f130325a) && Intrinsics.areEqual(this.f130326b, e0Var.f130326b) && this.f130327c == e0Var.f130327c && this.f130328d == e0Var.f130328d && Intrinsics.areEqual(this.f130329e, e0Var.f130329e) && Intrinsics.areEqual(this.f130330f, e0Var.f130330f);
    }

    public final int f() {
        return this.f130327c;
    }

    public int hashCode() {
        return (((((((((this.f130325a.hashCode() * 31) + this.f130326b.hashCode()) * 31) + Integer.hashCode(this.f130327c)) * 31) + Long.hashCode(this.f130328d)) * 31) + this.f130329e.hashCode()) * 31) + this.f130330f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f130325a + ", firstSessionId=" + this.f130326b + ", sessionIndex=" + this.f130327c + ", eventTimestampUs=" + this.f130328d + ", dataCollectionStatus=" + this.f130329e + ", firebaseInstallationId=" + this.f130330f + ')';
    }
}
