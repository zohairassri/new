package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum sq implements c2 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d2 f41777h = new d2() { // from class: com.google.android.gms.internal.pal.rq
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41779a;

    sq(int i11) {
        this.f41779a = i11;
    }

    public static sq a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i11 == 1) {
            return SYMMETRIC;
        }
        if (i11 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i11 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i11 != 4) {
            return null;
        }
        return REMOTE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f41779a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
