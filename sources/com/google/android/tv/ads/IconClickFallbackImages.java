package com.google.android.tv.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.atv_ads_framework.f0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class IconClickFallbackImages implements Parcelable {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class a {
        public abstract IconClickFallbackImages a();
    }

    public static a a(List list) {
        list.getClass();
        h hVar = new h();
        hVar.b(f0.p(list));
        return hVar;
    }

    public abstract List b();
}
