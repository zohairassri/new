package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum ax implements bz4 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final cz4 f23593d = new cz4() { // from class: com.google.android.gms.internal.ads.ax.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23595a;

    ax(int i11) {
        this.f23595a = i11;
    }

    public static ax a(int i11) {
        if (i11 == 0) {
            return UNSPECIFIED;
        }
        if (i11 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static dz4 b() {
        return bx.f24257a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f23595a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f23595a;
    }
}
