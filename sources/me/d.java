package me;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum d {
    SMALL(3000),
    MEDIUM(10000),
    LARGE(35000);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f116127a;

    d(long j11) {
        this.f116127a = j11;
    }

    public final long b() {
        return this.f116127a;
    }
}
