package ql;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f122811a;

    b(int i11) {
        this.f122811a = i11;
    }

    public static b a(int i11) {
        for (b bVar : values()) {
            if (bVar.b() == i11) {
                return bVar;
            }
        }
        return null;
    }

    public int b() {
        return this.f122811a;
    }
}
