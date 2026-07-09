package com.google.common.primitives;

import zo.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static char a(long j11) {
        char c11 = (char) j11;
        o.g(((long) c11) == j11, "Out of range: %s", j11);
        return c11;
    }

    public static boolean b(char[] cArr, char c11) {
        for (char c12 : cArr) {
            if (c12 == c11) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b11, byte b12) {
        return (char) ((b11 << 8) | (b12 & 255));
    }
}
