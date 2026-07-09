package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class w05 extends b15 {
    w05() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.b15
    public final void a() {
        if (!c()) {
            if (d() > 0) {
                android.support.v4.media.a.a(((x05) f(0)).a());
                throw null;
            }
            Iterator it = g().iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
