package com.google.firebase;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends StartupTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f46398c;

    a(long j11, long j12, long j13) {
        this.f46396a = j11;
        this.f46397b = j12;
        this.f46398c = j13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupTime) {
            StartupTime startupTime = (StartupTime) obj;
            if (this.f46396a == startupTime.getEpochMillis() && this.f46397b == startupTime.getElapsedRealtime() && this.f46398c == startupTime.getUptimeMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.f46397b;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.f46396a;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.f46398c;
    }

    public int hashCode() {
        long j11 = this.f46396a;
        long j12 = this.f46397b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f46398c;
        return ((int) ((j13 >>> 32) ^ j13)) ^ i11;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f46396a + ", elapsedRealtime=" + this.f46397b + ", uptimeMillis=" + this.f46398c + "}";
    }
}
