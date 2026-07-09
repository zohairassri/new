package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum er implements bz4 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(androidx.room.g0.MAX_BIND_PARAMETER_CNT);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25884a;

    er(int i11) {
        this.f25884a = i11;
    }

    public static er a(int i11) {
        if (i11 == 0) {
            return UNSUPPORTED;
        }
        if (i11 == 2) {
            return ARM7;
        }
        if (i11 == 999) {
            return UNKNOWN;
        }
        if (i11 == 4) {
            return X86;
        }
        if (i11 == 5) {
            return ARM64;
        }
        if (i11 == 6) {
            return X86_64;
        }
        if (i11 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static dz4 b() {
        return dr.f25226a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f25884a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f25884a;
    }
}
