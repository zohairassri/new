package com.google.android.play.core.install;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends InstallState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f45790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f45791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f45793e;

    a(int i11, long j11, long j12, int i12, String str) {
        this.f45789a = i11;
        this.f45790b = j11;
        this.f45791c = j12;
        this.f45792d = i12;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f45793e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.f45790b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.f45792d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.f45789a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.f45793e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.f45791c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f45789a == installState.c() && this.f45790b == installState.a() && this.f45791c == installState.e() && this.f45792d == installState.b() && this.f45793e.equals(installState.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f45789a ^ 1000003;
        long j11 = this.f45790b;
        long j12 = this.f45791c;
        return this.f45793e.hashCode() ^ (((((((i11 * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f45792d) * 1000003);
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f45789a + ", bytesDownloaded=" + this.f45790b + ", totalBytesToDownload=" + this.f45791c + ", installErrorCode=" + this.f45792d + ", packageName=" + this.f45793e + "}";
    }
}
