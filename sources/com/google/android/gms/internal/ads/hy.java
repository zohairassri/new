package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum hy implements bz4 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final cz4 f28077e = new cz4() { // from class: com.google.android.gms.internal.ads.hy.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28079a;

    hy(int i11) {
        this.f28079a = i11;
    }

    public static hy a(int i11) {
        if (i11 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i11 == 1) {
            return IOS;
        }
        if (i11 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static dz4 b() {
        return iy.f28770a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f28079a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f28079a;
    }
}
