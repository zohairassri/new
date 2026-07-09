package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum in4 implements bz4 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28495a;

    in4(int i11) {
        this.f28495a = i11;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f28495a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f28495a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
