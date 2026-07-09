package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vt3 implements gt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37012a = new ArrayList();

    vt3() {
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final synchronized void c(Map map, Context context, View view) {
        List list = this.f37012a;
        map.put("vst", new ArrayList(list));
        list.clear();
    }

    public final synchronized void d(List list) {
        List list2 = this.f37012a;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final void a(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final void b(Map map) {
    }
}
