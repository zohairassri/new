package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class v0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f47556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f47558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47559d;

    v0(i0 i0Var, String str, Object[] objArr) {
        this.f47556a = i0Var;
        this.f47557b = str;
        this.f47558c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f47559d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f47559d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    @Override // com.google.protobuf.g0
    public boolean a() {
        return (this.f47559d & 2) == 2;
    }

    @Override // com.google.protobuf.g0
    public i0 b() {
        return this.f47556a;
    }

    @Override // com.google.protobuf.g0
    public s0 c() {
        return (this.f47559d & 1) == 1 ? s0.PROTO2 : s0.PROTO3;
    }

    Object[] d() {
        return this.f47558c;
    }

    String e() {
        return this.f47557b;
    }
}
