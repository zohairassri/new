package oa;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f120196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f120197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f120198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f120199d;

    public e(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f120196a = z11;
        this.f120197b = z12;
        this.f120198c = z13;
        this.f120199d = z14;
    }

    public final boolean a() {
        return this.f120196a;
    }

    public final boolean b() {
        return this.f120198c;
    }

    public final boolean c() {
        return this.f120199d;
    }

    public final boolean d() {
        return this.f120197b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f120196a == eVar.f120196a && this.f120197b == eVar.f120197b && this.f120198c == eVar.f120198c && this.f120199d == eVar.f120199d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f120196a) * 31) + Boolean.hashCode(this.f120197b)) * 31) + Boolean.hashCode(this.f120198c)) * 31) + Boolean.hashCode(this.f120199d);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f120196a + ", isValidated=" + this.f120197b + ", isMetered=" + this.f120198c + ", isNotRoaming=" + this.f120199d + ')';
    }
}
