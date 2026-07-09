package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pl2 implements i75 {
    public static pl2 a() {
        return ol2.f31973a;
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        fz fzVar = oz.f32313jd;
        if (!((String) yl.e.c().d(fzVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) yl.e.c().d(fzVar)).split(","));
        }
        q75.b(arrayList);
        return arrayList;
    }
}
