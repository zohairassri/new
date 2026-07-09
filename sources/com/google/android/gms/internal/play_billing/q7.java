package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class q7 implements d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f42535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f42537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f42538d;

    q7(g7 g7Var, String str, Object[] objArr) {
        this.f42535a = g7Var;
        this.f42536b = str;
        this.f42537c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f42538d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f42538d = i11 | (cCharAt2 << i13);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    final String a() {
        return this.f42536b;
    }

    final Object[] b() {
        return this.f42537c;
    }

    @Override // com.google.android.gms.internal.play_billing.d7
    public final g7 zza() {
        return this.f42535a;
    }

    @Override // com.google.android.gms.internal.play_billing.d7
    public final boolean zzb() {
        return (this.f42538d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.d7
    public final int zzc() {
        int i11 = this.f42538d;
        if ((i11 & 1) != 0) {
            return 1;
        }
        return (i11 & 4) == 4 ? 3 : 2;
    }
}
