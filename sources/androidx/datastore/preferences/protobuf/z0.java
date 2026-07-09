package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class z0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f7816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f7818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7819d;

    z0(m0 m0Var, String str, Object[] objArr) {
        this.f7816a = m0Var;
        this.f7817b = str;
        this.f7818c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f7819d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f7819d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public boolean a() {
        return (this.f7819d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public m0 b() {
        return this.f7816a;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public w0 c() {
        return (this.f7819d & 1) == 1 ? w0.PROTO2 : w0.PROTO3;
    }

    Object[] d() {
        return this.f7818c;
    }

    String e() {
        return this.f7817b;
    }
}
