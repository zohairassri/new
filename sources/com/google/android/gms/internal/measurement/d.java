package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f40214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f40215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f40216c;

    public d() {
        this.f40214a = new e("", 0L, null);
        this.f40215b = new e("", 0L, null);
        this.f40216c = new ArrayList();
    }

    public final e a() {
        return this.f40214a;
    }

    public final void b(e eVar) {
        this.f40214a = eVar;
        this.f40215b = (e) eVar.clone();
        this.f40216c.clear();
    }

    public final void c(String str, long j11, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, e.c(str2, this.f40214a.b(str2), map.get(str2)));
        }
        this.f40216c.add(new e(str, j11, map2));
    }

    public final /* synthetic */ Object clone() {
        d dVar = new d((e) this.f40214a.clone());
        Iterator it = this.f40216c.iterator();
        while (it.hasNext()) {
            dVar.f40216c.add((e) ((e) it.next()).clone());
        }
        return dVar;
    }

    public final e d() {
        return this.f40215b;
    }

    public final void e(e eVar) {
        this.f40215b = eVar;
    }

    public final List f() {
        return this.f40216c;
    }

    private d(e eVar) {
        this.f40214a = eVar;
        this.f40215b = (e) eVar.clone();
        this.f40216c = new ArrayList();
    }
}
