package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p14 {
    public static ArrayList a(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList b(int i11) {
        jz3.b(i11, "initialArraySize");
        return new ArrayList(i11);
    }

    public static List c(List list, ax3 ax3Var) {
        return list instanceof RandomAccess ? new m14(list, ax3Var) : new o14(list, ax3Var);
    }
}
