package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum an4 implements bz4 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23385a;

    an4(int i11) {
        this.f23385a = i11;
    }

    public static an4 a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_HASH;
        }
        if (i11 == 1) {
            return SHA1;
        }
        if (i11 == 2) {
            return SHA384;
        }
        if (i11 == 3) {
            return SHA256;
        }
        if (i11 == 4) {
            return SHA512;
        }
        if (i11 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23385a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f23385a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
