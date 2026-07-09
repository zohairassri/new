package tf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum b {
    CREATION_SAMPLING_RATE("_dd.local.head_sampling_rate_key"),
    REPORTING_SAMPLING_RATE("_dd.local.tail_sampling_rate_key"),
    VIEW_SCOPE_INSTRUMENTATION_TYPE("_dd.local.view_instrumentation_type_key");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f129902a;

    b(String str) {
        this.f129902a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f129902a;
    }
}
