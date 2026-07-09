package dq;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum y {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f90393a;

    y(int i11) {
        this.f90393a = i11;
    }

    public static y a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int b() {
        return this.f90393a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f90393a);
    }
}
