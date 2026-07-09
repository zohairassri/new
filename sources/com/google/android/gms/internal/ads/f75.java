package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f75 {
    public static List a(int i11) {
        return i11 == 0 ? Collections.EMPTY_LIST : new ArrayList(i11);
    }

    static HashSet b(int i11) {
        return new HashSet(d(i11));
    }

    public static LinkedHashMap c(int i11) {
        return new LinkedHashMap(d(i11));
    }

    private static int d(int i11) {
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
