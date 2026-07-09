package mf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum a {
    ALL(100.0f),
    HIGH(10.0f),
    MEDIUM(1.0f),
    LOW(0.1f),
    REDUCED(0.01f),
    RARE(0.001f);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f116181a;

    a(float f11) {
        this.f116181a = f11;
    }

    public final float b() {
        return this.f116181a;
    }
}
