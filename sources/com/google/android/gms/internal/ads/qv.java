package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum qv implements bz4 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final cz4 f33809e = new cz4() { // from class: com.google.android.gms.internal.ads.qv.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33811a;

    qv(int i11) {
        this.f33811a = i11;
    }

    public static qv a(int i11) {
        if (i11 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i11 == 1) {
            return CELL;
        }
        if (i11 != 2) {
            return null;
        }
        return WIFI;
    }

    public static dz4 b() {
        return rv.f34346a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f33811a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f33811a;
    }
}
