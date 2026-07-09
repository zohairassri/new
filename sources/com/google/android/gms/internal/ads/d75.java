package com.google.android.gms.internal.ads;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LinkedHashMap f24918a;

    d75(int i11) {
        this.f24918a = f75.c(i11);
    }

    final d75 a(Object obj, r75 r75Var) {
        q75.a(obj, TransferTable.COLUMN_KEY);
        q75.a(r75Var, "provider");
        this.f24918a.put(obj, r75Var);
        return this;
    }
}
