package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum zf {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40970a;

    zf(int i11) {
        this.f40970a = i11;
    }

    public static zf a(int i11) {
        return i11 != 2 ? i11 != 3 ? i11 != 5 ? i11 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
