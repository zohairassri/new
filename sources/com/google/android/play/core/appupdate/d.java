package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {
        public abstract d a();

        public abstract a b(boolean z11);
    }

    public static d c(int i11) {
        return d(i11).a();
    }

    public static a d(int i11) {
        a0 a0Var = new a0();
        a0Var.c(i11);
        a0Var.b(false);
        return a0Var;
    }

    public abstract boolean a();

    public abstract int b();
}
