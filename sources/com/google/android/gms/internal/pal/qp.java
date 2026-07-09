package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class qp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d2 f41695a = new pp();

    public static int a(int i11) {
        if (i11 != 1) {
            return i11 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i11) {
        if (i11 == 0) {
            return 2;
        }
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 2) {
            return 4;
        }
        if (i11 == 3) {
            return 5;
        }
        if (i11 != 4) {
            return i11 != 5 ? 0 : 7;
        }
        return 6;
    }
}
