package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i83 extends f04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f28241a = new LinkedList();

    @Override // java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        s73 s73Var = (s73) obj;
        if (s73Var.f() != 3) {
            this.f28241a.add(s73Var);
            return true;
        }
        LinkedList linkedList = this.f28241a;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            s73 s73Var2 = (s73) listIterator.next();
            if (s73Var2.f() == 3) {
                double dE = s73Var2.e();
                double dE2 = s73Var.e();
                if (dE < dE2 || (dE == dE2 && s73Var2.c() > s73Var.c())) {
                    listIterator.set(s73Var);
                    s73Var = s73Var2;
                }
            }
        }
        linkedList.add(s73Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.c04
    public final /* synthetic */ Collection l() {
        return this.f28241a;
    }

    @Override // com.google.android.gms.internal.ads.f04
    public final Queue x() {
        return this.f28241a;
    }

    @Override // com.google.android.gms.internal.ads.e04
    public final /* synthetic */ Object zzb() {
        return this.f28241a;
    }
}
