package cm;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class m extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17986c;

    m(int i11, int i12, boolean z11) {
        this.f17984a = i11;
        this.f17985b = i12;
        this.f17986c = z11;
    }

    @Override // cm.v
    public final int a() {
        return this.f17984a;
    }

    @Override // cm.v
    public final int b() {
        return this.f17985b;
    }

    @Override // cm.v
    public final boolean c() {
        return this.f17986c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f17984a == vVar.a() && this.f17985b == vVar.b() && this.f17986c == vVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17985b ^ ((this.f17984a ^ 1000003) * 1000003)) * 1000003) ^ (true != this.f17986c ? 1237 : 1231);
    }

    public final String toString() {
        int i11 = this.f17984a;
        int length = String.valueOf(i11).length();
        int i12 = this.f17985b;
        int length2 = String.valueOf(i12).length();
        boolean z11 = this.f17986c;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z11).length() + 1);
        sb2.append("OfflineAdConfig{impressionPrerequisite=");
        sb2.append(i11);
        sb2.append(", clickPrerequisite=");
        sb2.append(i12);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }
}
