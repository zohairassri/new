package mr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum c {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f116907a;

    c(String str) {
        this.f116907a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f116907a;
    }
}
