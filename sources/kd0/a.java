package kd0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f110609c;

    a(boolean z11) {
        this.f110609c = z11;
    }

    @Override // kd0.b
    public boolean c() {
        return this.f110609c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b) && this.f110609c == ((b) obj).c();
    }

    public int hashCode() {
        return (this.f110609c ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return "TracerConfig{enabled=" + this.f110609c + "}";
    }
}
