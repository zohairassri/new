package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzsr {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzsb.zza;
            }
        } else {
            if (!(iterable instanceof zzsq)) {
                return false;
            }
            comparator2 = ((zzsq) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
