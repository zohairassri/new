package tr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public enum i implements qq.f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130354a;

    i(int i11) {
        this.f130354a = i11;
    }

    @Override // qq.f
    public int getNumber() {
        return this.f130354a;
    }
}
