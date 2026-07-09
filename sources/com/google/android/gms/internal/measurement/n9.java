package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class n9 implements o9 {
    n9() {
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final Map a(Object obj) {
        return (l9) obj;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final Object b(Object obj) {
        ((l9) obj).h();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final Object c(Object obj, Object obj2) {
        l9 l9VarG = (l9) obj;
        l9 l9Var = (l9) obj2;
        if (!l9Var.isEmpty()) {
            if (!l9VarG.i()) {
                l9VarG = l9VarG.g();
            }
            l9VarG.f(l9Var);
        }
        return l9VarG;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final Map d(Object obj) {
        return (l9) obj;
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final int e(int i11, Object obj, Object obj2) {
        l9 l9Var = (l9) obj;
        android.support.v4.media.a.a(obj2);
        if (l9Var.isEmpty()) {
            return 0;
        }
        Iterator it = l9Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final m9 zza(Object obj) {
        android.support.v4.media.a.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final Object zzb(Object obj) {
        return l9.d().g();
    }

    @Override // com.google.android.gms.internal.measurement.o9
    public final boolean zzf(Object obj) {
        return !((l9) obj).i();
    }
}
