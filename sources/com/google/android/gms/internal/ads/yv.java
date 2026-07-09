package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum yv implements bz4 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final cz4 f38871h = new cz4() { // from class: com.google.android.gms.internal.ads.yv.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38873a;

    yv(int i11) {
        this.f38873a = i11;
    }

    public static yv a(int i11) {
        if (i11 == 0) {
            return UNSPECIFIED;
        }
        if (i11 == 1) {
            return CONNECTING;
        }
        if (i11 == 2) {
            return CONNECTED;
        }
        if (i11 == 3) {
            return DISCONNECTING;
        }
        if (i11 == 4) {
            return DISCONNECTED;
        }
        if (i11 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static dz4 b() {
        return zv.f39436a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f38873a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f38873a;
    }
}
