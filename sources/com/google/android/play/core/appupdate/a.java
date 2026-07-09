package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f45727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f45728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f45729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f45730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f45731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f45732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PendingIntent f45733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PendingIntent f45734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final PendingIntent f45735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f45736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f45737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f45738p = false;

    private a(String str, int i11, int i12, int i13, Integer num, int i14, long j11, long j12, long j13, long j14, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f45723a = str;
        this.f45724b = i11;
        this.f45725c = i12;
        this.f45726d = i13;
        this.f45727e = num;
        this.f45728f = i14;
        this.f45729g = j11;
        this.f45730h = j12;
        this.f45731i = j13;
        this.f45732j = j14;
        this.f45733k = pendingIntent;
        this.f45734l = pendingIntent2;
        this.f45735m = pendingIntent3;
        this.f45736n = pendingIntent4;
        this.f45737o = map;
    }

    public static a i(String str, int i11, int i12, int i13, Integer num, int i14, long j11, long j12, long j13, long j14, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new a(str, i11, i12, i13, num, i14, j11, j12, j13, j14, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Set l(Set set) {
        return set == null ? new HashSet() : set;
    }

    private final boolean m(d dVar) {
        return dVar.a() && this.f45731i <= this.f45732j;
    }

    public int a() {
        return this.f45724b;
    }

    public Integer b() {
        return this.f45727e;
    }

    public Set c(d dVar) {
        return dVar.a() ? dVar.b() == 0 ? l((Set) this.f45737o.get("nonblocking.destructive.intent")) : l((Set) this.f45737o.get("blocking.destructive.intent")) : dVar.b() == 0 ? l((Set) this.f45737o.get("nonblocking.intent")) : l((Set) this.f45737o.get("blocking.intent"));
    }

    public int d() {
        return this.f45726d;
    }

    public boolean e(d dVar) {
        return h(dVar) != null;
    }

    public int f() {
        return this.f45725c;
    }

    public int g() {
        return this.f45728f;
    }

    final PendingIntent h(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f45734l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m(dVar)) {
                return this.f45736n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f45733k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m(dVar)) {
                return this.f45735m;
            }
        }
        return null;
    }

    final void j() {
        this.f45738p = true;
    }

    final boolean k() {
        return this.f45738p;
    }
}
