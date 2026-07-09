package wc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f135115c;

    b(boolean z11) {
        this.f135115c = z11;
    }

    @Override // wc0.c
    public boolean c() {
        return this.f135115c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof c) && this.f135115c == ((c) obj).c();
    }

    public int hashCode() {
        return (this.f135115c ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return "LoggerConfig{enabled=" + this.f135115c + "}";
    }
}
