package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class k5 extends h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41516c;

    k5(String str, String str2, boolean z11) {
        if (str == null) {
            throw new NullPointerException("Null advertisingId");
        }
        this.f41514a = str;
        this.f41515b = str2;
        this.f41516c = z11;
    }

    @Override // com.google.android.gms.internal.pal.h5
    public final String a() {
        return this.f41514a;
    }

    @Override // com.google.android.gms.internal.pal.h5
    public final String b() {
        return this.f41515b;
    }

    @Override // com.google.android.gms.internal.pal.h5
    public final boolean c() {
        return this.f41516c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h5) {
            h5 h5Var = (h5) obj;
            if (this.f41514a.equals(h5Var.a()) && this.f41515b.equals(h5Var.b()) && this.f41516c == h5Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f41516c ? 1237 : 1231) ^ ((((this.f41514a.hashCode() ^ 1000003) * 1000003) ^ this.f41515b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "AdvertisingIdInfo{advertisingId=" + this.f41514a + ", advertisingIdType=" + this.f41515b + ", isLimitAdTracking=" + this.f41516c + "}";
    }
}
