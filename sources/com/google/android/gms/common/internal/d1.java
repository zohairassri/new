package com.google.android.gms.common.internal;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f22723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f22725e;

    public d1(String str, String str2, int i11, boolean z11) {
        n.f(str);
        this.f22721a = str;
        n.f(str2);
        this.f22722b = str2;
        this.f22723c = null;
        this.f22724d = 4225;
        this.f22725e = z11;
    }

    public final String a() {
        return this.f22721a;
    }

    public final String b() {
        return this.f22722b;
    }

    public final ComponentName c() {
        return this.f22723c;
    }

    public final boolean d() {
        return this.f22725e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return m.a(this.f22721a, d1Var.f22721a) && m.a(this.f22722b, d1Var.f22722b) && m.a(this.f22723c, d1Var.f22723c) && this.f22725e == d1Var.f22725e;
    }

    public final int hashCode() {
        return m.b(this.f22721a, this.f22722b, this.f22723c, 4225, Boolean.valueOf(this.f22725e));
    }

    public final String toString() {
        String str = this.f22721a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f22723c;
        n.l(componentName);
        return componentName.flattenToString();
    }
}
