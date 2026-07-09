package com.google.common.primitives;

import zo.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j {
    public static int a(long j11) {
        o.g((j11 >> 32) == 0, "out of range: %s", j11);
        return (int) j11;
    }
}
