package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class dt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f25267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vt3 f25268b;

    dt3(vt3 vt3Var, Set set) {
        this.f25267a = set;
        this.f25268b = vt3Var;
    }

    public final void a(List list) {
        this.f25268b.d(list);
    }

    public final Map b() {
        HashMap map = new HashMap();
        Iterator it = this.f25267a.iterator();
        while (it.hasNext()) {
            ((gt3) it.next()).b(map);
        }
        return map;
    }

    public final Map c(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f25267a.iterator();
        while (it.hasNext()) {
            ((gt3) it.next()).c(map, context, view);
        }
        return map;
    }

    public final Map d() {
        HashMap map = new HashMap();
        Iterator it = this.f25267a.iterator();
        while (it.hasNext()) {
            ((gt3) it.next()).a(map);
        }
        return map;
    }
}
