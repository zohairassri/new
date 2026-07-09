package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pz {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, z00.d("gad:dynamite_module:experiment_id", ""));
        c(arrayList, n10.f31140a);
        c(arrayList, n10.f31141b);
        c(arrayList, n10.f31142c);
        c(arrayList, n10.f31143d);
        c(arrayList, n10.f31144e);
        c(arrayList, n10.f31160u);
        c(arrayList, n10.f31145f);
        c(arrayList, n10.f31152m);
        c(arrayList, n10.f31153n);
        c(arrayList, n10.f31154o);
        c(arrayList, n10.f31155p);
        c(arrayList, n10.f31156q);
        c(arrayList, n10.f31157r);
        c(arrayList, n10.f31158s);
        c(arrayList, n10.f31159t);
        c(arrayList, n10.f31146g);
        c(arrayList, n10.f31147h);
        c(arrayList, n10.f31148i);
        c(arrayList, n10.f31149j);
        c(arrayList, n10.f31150k);
        c(arrayList, n10.f31151l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, c20.f24359a);
        return arrayList;
    }

    private static void c(List list, z00 z00Var) {
        String str = (String) z00Var.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
