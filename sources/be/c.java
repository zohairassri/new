package be;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum c {
    US1("us1", "browser-intake-datadoghq.com"),
    US3("us3"),
    US5("us5"),
    EU1("eu1", "browser-intake-datadoghq.eu"),
    AP1("ap1"),
    AP2("ap2"),
    US1_FED("us1_fed", "browser-intake-ddog-gov.com"),
    STAGING("staging", "browser-intake-datad0g.com");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14314c;

    c(String str, String str2) {
        this.f14312a = str;
        this.f14313b = str2;
        this.f14314c = "https://" + str2;
    }

    public final String b() {
        return this.f14314c;
    }

    public final String c() {
        return this.f14312a;
    }

    c(String str) {
        this(str, "browser-intake-" + str + "-datadoghq.com");
    }
}
