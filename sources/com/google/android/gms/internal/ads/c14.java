package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c14 {
    public static boolean a(Iterable iterable, kx3 kx3Var) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            kx3Var.getClass();
            return c((List) iterable, kx3Var);
        }
        Iterator it = iterable.iterator();
        kx3Var.getClass();
        boolean z11 = false;
        while (it.hasNext()) {
            if (kx3Var.zza(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static Object b(Iterable iterable, Object obj) {
        d34 it = ((u24) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean c(List list, kx3 kx3Var) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < list.size()) {
            Object obj = list.get(i11);
            if (!kx3Var.zza(obj)) {
                if (i11 > i12) {
                    try {
                        list.set(i12, obj);
                    } catch (IllegalArgumentException unused) {
                        d(list, kx3Var, i12, i11);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        d(list, kx3Var, i12, i11);
                        return true;
                    }
                }
                i12++;
            }
            i11++;
        }
        list.subList(i12, list.size()).clear();
        return i11 != i12;
    }

    private static void d(List list, kx3 kx3Var, int i11, int i12) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i12) {
                break;
            } else if (kx3Var.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i12--;
            if (i12 < i11) {
                return;
            } else {
                list.remove(i12);
            }
        }
    }
}
