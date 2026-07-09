package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f22145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f22146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f22147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f22148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f22149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f22150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    float f22151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f22152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f22153m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f22155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f22156p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f22141a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f22142b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f22143c = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f22144d = IntCompanionObject.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    List f22154n = new ArrayList();

    b() {
    }

    public int a() {
        return this.f22147g;
    }

    public int b() {
        return this.f22148h;
    }

    public int c() {
        return this.f22148h - this.f22149i;
    }

    void d(View view, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f22141a = Math.min(this.f22141a, (view.getLeft() - flexItem.z1()) - i11);
        this.f22142b = Math.min(this.f22142b, (view.getTop() - flexItem.v0()) - i12);
        this.f22143c = Math.max(this.f22143c, view.getRight() + flexItem.a2() + i13);
        this.f22144d = Math.max(this.f22144d, view.getBottom() + flexItem.v1() + i14);
    }
}
