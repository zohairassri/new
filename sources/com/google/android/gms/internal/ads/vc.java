package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class vc {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36727f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36729h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f36735n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36722a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36723b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f36724c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36725d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36726e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36728g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36730i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36731j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36732k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36733l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36734m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36736o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36737p = false;

    private static int a(int i11, String str, String str2, int i12) {
        if (str.isEmpty() || i11 == -1) {
            return i11;
        }
        if (str.equals(str2)) {
            return i11 + i12;
        }
        return -1;
    }

    public final boolean A() {
        return this.f36737p;
    }

    public final void b(String str) {
        this.f36722a = str;
    }

    public final void c(String str) {
        this.f36723b = str;
    }

    public final void d(String[] strArr) {
        this.f36724c = new HashSet(Arrays.asList(strArr));
    }

    public final void e(String str) {
        this.f36725d = str;
    }

    public final int f(String str, String str2, Set set, String str3) {
        if (this.f36722a.isEmpty() && this.f36723b.isEmpty() && this.f36724c.isEmpty() && this.f36725d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f36722a, str, 1073741824), this.f36723b, str2, 2), this.f36725d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f36724c)) {
            return 0;
        }
        return iA + (this.f36724c.size() * 4);
    }

    public final int g() {
        int i11 = this.f36732k;
        if (i11 == -1 && this.f36733l == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f36733l == 1 ? 2 : 0);
    }

    public final boolean h() {
        return this.f36731j == 1;
    }

    public final vc i(boolean z11) {
        this.f36731j = 1;
        return this;
    }

    public final vc j(boolean z11) {
        this.f36732k = 1;
        return this;
    }

    public final vc k(boolean z11) {
        this.f36733l = 1;
        return this;
    }

    public final String l() {
        return this.f36726e;
    }

    public final vc m(String str) {
        this.f36726e = sw3.a(str);
        return this;
    }

    public final int n() {
        if (this.f36728g) {
            return this.f36727f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final vc o(int i11) {
        this.f36727f = i11;
        this.f36728g = true;
        return this;
    }

    public final boolean p() {
        return this.f36728g;
    }

    public final int q() {
        if (this.f36730i) {
            return this.f36729h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final vc r(int i11) {
        this.f36729h = i11;
        this.f36730i = true;
        return this;
    }

    public final boolean s() {
        return this.f36730i;
    }

    public final vc t(float f11) {
        this.f36735n = f11;
        return this;
    }

    public final vc u(int i11) {
        this.f36734m = i11;
        return this;
    }

    public final int v() {
        return this.f36734m;
    }

    public final float w() {
        return this.f36735n;
    }

    public final vc x(int i11) {
        this.f36736o = i11;
        return this;
    }

    public final int y() {
        return this.f36736o;
    }

    public final vc z(boolean z11) {
        this.f36737p = z11;
        return this;
    }
}
