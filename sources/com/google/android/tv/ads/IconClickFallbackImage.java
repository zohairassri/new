package com.google.android.tv.ads;

import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class IconClickFallbackImage implements Parcelable {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {
        public abstract IconClickFallbackImage a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(int i11);

        public abstract a e(String str);

        public abstract a f(int i11);
    }

    public static a a() {
        g gVar = new g();
        gVar.f(0);
        gVar.d(0);
        gVar.b("");
        gVar.c("");
        gVar.e("");
        return gVar;
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract int getHeight();

    public abstract int getWidth();
}
