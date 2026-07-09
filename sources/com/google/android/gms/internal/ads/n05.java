package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n05 implements yz4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c05 f31135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f31137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31138d;

    n05(c05 c05Var, String str, Object[] objArr) {
        this.f31135a = c05Var;
        this.f31136b = str;
        this.f31137c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f31138d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f31138d = i11 | (cCharAt2 << i13);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    final String a() {
        return this.f31136b;
    }

    final Object[] b() {
        return this.f31137c;
    }

    @Override // com.google.android.gms.internal.ads.yz4
    public final boolean zza() {
        return (this.f31138d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.yz4
    public final c05 zzb() {
        return this.f31135a;
    }

    @Override // com.google.android.gms.internal.ads.yz4
    public final int zzc() {
        int i11 = this.f31138d;
        if ((i11 & 1) != 0) {
            return 1;
        }
        return (i11 & 4) == 4 ? 3 : 2;
    }
}
