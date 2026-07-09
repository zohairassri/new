package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum sw implements bz4 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final cz4 f35156f = new cz4() { // from class: com.google.android.gms.internal.ads.sw.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35158a;

    sw(int i11) {
        this.f35158a = i11;
    }

    public static sw a(int i11) {
        if (i11 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i11 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i11 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i11 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static dz4 b() {
        return tw.f35763a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f35158a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f35158a;
    }
}
