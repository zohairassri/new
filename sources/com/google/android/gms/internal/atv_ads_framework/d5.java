package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum d5 {
    SIGNAL_COLLECTION_ERROR_UNKNOWN(0),
    SIGNAL_COLLECTION_ERROR_RUNTIME_EXCEPTION(1),
    SIGNAL_COLLECTION_ERROR_NAME_NOT_FOUND(2),
    SIGNAL_COLLECTION_ERROR_BUILD_FINGERPRINT_PREFIX(3),
    SIGNAL_COLLECTION_ERROR_NULL_CONTENT_PROVIDER_DATA(4);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i2 f39897g = new i2() { // from class: com.google.android.gms.internal.atv_ads_framework.b5
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39899a;

    d5(int i11) {
        this.f39899a = i11;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f39899a);
    }

    public final int zza() {
        return this.f39899a;
    }
}
