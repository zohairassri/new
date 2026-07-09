package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class m3 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c3 f41548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f41550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41551d;

    m3(c3 c3Var, String str, Object[] objArr) {
        this.f41548a = c3Var;
        this.f41549b = str;
        this.f41550c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f41551d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f41551d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    final String a() {
        return this.f41549b;
    }

    final Object[] b() {
        return this.f41550c;
    }

    @Override // com.google.android.gms.internal.pal.z2
    public final c3 zza() {
        return this.f41548a;
    }

    @Override // com.google.android.gms.internal.pal.z2
    public final boolean zzb() {
        return (this.f41551d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.pal.z2
    public final int zzc() {
        return (this.f41551d & 1) == 1 ? 1 : 2;
    }
}
