package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
enum i {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f43063a;

    i(char c11) {
        this.f43063a = c11;
    }

    public static i b(char c11) {
        for (i iVar : values()) {
            if (iVar.f43063a == c11) {
                return iVar;
            }
        }
        return UNSET;
    }
}
