package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class q3 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h3 f40011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f40013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f40014d;

    q3(h3 h3Var, String str, Object[] objArr) {
        this.f40011a = h3Var;
        this.f40012b = str;
        this.f40013c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f40014d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f40014d = i11 | (cCharAt2 << i13);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    final String a() {
        return this.f40012b;
    }

    final Object[] b() {
        return this.f40013c;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.e3
    public final h3 zza() {
        return this.f40011a;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.e3
    public final boolean zzb() {
        return (this.f40014d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.e3
    public final int zzc() {
        return (this.f40014d & 1) == 1 ? 1 : 2;
    }
}
