package bc;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14247a;

    c(String str) {
        this.f14247a = str;
    }

    public String b() {
        return ".temp" + this.f14247a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14247a;
    }
}
