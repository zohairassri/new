package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final /* synthetic */ class a83 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ a83 f23131a = new a83();

    private /* synthetic */ a83() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        s73 s73Var = (s73) obj2;
        s73 s73Var2 = (s73) obj;
        int iCompare = Double.compare(s73Var.e(), s73Var2.e());
        return iCompare == 0 ? Long.compare(s73Var2.d(), s73Var.d()) : iCompare;
    }
}
