package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class kc0 implements em.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f29518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f29520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Location f29522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f29523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f29524g;

    public kc0(Date date, int i11, Set set, Location location, boolean z11, int i12, boolean z12, int i13, String str) {
        this.f29518a = date;
        this.f29519b = i11;
        this.f29520c = set;
        this.f29522e = location;
        this.f29521d = z11;
        this.f29523f = i12;
        this.f29524g = z12;
    }

    @Override // em.e
    public final Set a() {
        return this.f29520c;
    }

    @Override // em.e
    public final int c() {
        return this.f29523f;
    }

    @Override // em.e
    public final boolean d() {
        return this.f29524g;
    }

    @Override // em.e
    public final boolean e() {
        return this.f29521d;
    }
}
