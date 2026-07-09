package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum fo4 implements bz4 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26482a;

    fo4(int i11) {
        this.f26482a = i11;
    }

    public static fo4 a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i11 == 1) {
            return TINK;
        }
        if (i11 == 2) {
            return LEGACY;
        }
        if (i11 == 3) {
            return RAW;
        }
        if (i11 == 4) {
            return CRUNCHY;
        }
        if (i11 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f26482a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f26482a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
