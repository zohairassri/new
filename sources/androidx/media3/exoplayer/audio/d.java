package androidx.media3.exoplayer.audio;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f9283d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9286c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f9288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9289c;

        public d d() {
            if (this.f9287a || !(this.f9288b || this.f9289c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z11) {
            this.f9287a = z11;
            return this;
        }

        public b f(boolean z11) {
            this.f9288b = z11;
            return this;
        }

        public b g(boolean z11) {
            this.f9289c = z11;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f9284a == dVar.f9284a && this.f9285b == dVar.f9285b && this.f9286c == dVar.f9286c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9284a ? 1 : 0) << 2) + ((this.f9285b ? 1 : 0) << 1) + (this.f9286c ? 1 : 0);
    }

    private d(b bVar) {
        this.f9284a = bVar.f9287a;
        this.f9285b = bVar.f9288b;
        this.f9286c = bVar.f9289c;
    }
}
