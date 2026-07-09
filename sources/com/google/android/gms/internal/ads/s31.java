package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class s31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f34481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f34482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Layout.Alignment f34483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Layout.Alignment f34484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f34486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f34488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f34489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f34490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f34491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f34492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f34493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f34495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34496p;

    public s31() {
        this.f34481a = null;
        this.f34482b = null;
        this.f34483c = null;
        this.f34484d = null;
        this.f34485e = -3.4028235E38f;
        this.f34486f = IntCompanionObject.MIN_VALUE;
        this.f34487g = IntCompanionObject.MIN_VALUE;
        this.f34488h = -3.4028235E38f;
        this.f34489i = IntCompanionObject.MIN_VALUE;
        this.f34490j = IntCompanionObject.MIN_VALUE;
        this.f34491k = -3.4028235E38f;
        this.f34492l = -3.4028235E38f;
        this.f34493m = -3.4028235E38f;
        this.f34494n = IntCompanionObject.MIN_VALUE;
    }

    public final s31 a(CharSequence charSequence) {
        this.f34481a = charSequence;
        this.f34482b = null;
        return this;
    }

    public final CharSequence b() {
        return this.f34481a;
    }

    public final s31 c(Bitmap bitmap) {
        this.f34482b = bitmap;
        this.f34481a = null;
        return this;
    }

    public final s31 d(Layout.Alignment alignment) {
        this.f34483c = alignment;
        return this;
    }

    public final s31 e(Layout.Alignment alignment) {
        this.f34484d = alignment;
        return this;
    }

    public final s31 f(float f11, int i11) {
        this.f34485e = f11;
        this.f34486f = i11;
        return this;
    }

    public final s31 g(int i11) {
        this.f34487g = i11;
        return this;
    }

    public final int h() {
        return this.f34487g;
    }

    public final s31 i(float f11) {
        this.f34488h = f11;
        return this;
    }

    public final s31 j(int i11) {
        this.f34489i = i11;
        return this;
    }

    public final int k() {
        return this.f34489i;
    }

    public final s31 l(float f11, int i11) {
        this.f34491k = f11;
        this.f34490j = i11;
        return this;
    }

    public final s31 m(float f11) {
        this.f34492l = f11;
        return this;
    }

    public final s31 n(float f11) {
        this.f34493m = f11;
        return this;
    }

    public final s31 o(int i11) {
        this.f34494n = i11;
        return this;
    }

    public final s31 p(float f11) {
        this.f34495o = f11;
        return this;
    }

    public final s31 q(int i11) {
        this.f34496p = i11;
        return this;
    }

    public final t41 r() {
        return new t41(this.f34481a, this.f34483c, this.f34484d, this.f34482b, this.f34485e, this.f34486f, this.f34487g, this.f34488h, this.f34489i, this.f34490j, this.f34491k, this.f34492l, this.f34493m, false, -16777216, this.f34494n, this.f34495o, this.f34496p, null);
    }

    /* synthetic */ s31(t41 t41Var, byte[] bArr) {
        this.f34481a = t41Var.f35265a;
        this.f34482b = t41Var.f35268d;
        this.f34483c = t41Var.f35266b;
        this.f34484d = t41Var.f35267c;
        this.f34485e = t41Var.f35269e;
        this.f34486f = t41Var.f35270f;
        this.f34487g = t41Var.f35271g;
        this.f34488h = t41Var.f35272h;
        this.f34489i = t41Var.f35273i;
        this.f34490j = t41Var.f35276l;
        this.f34491k = t41Var.f35277m;
        this.f34492l = t41Var.f35274j;
        this.f34493m = t41Var.f35275k;
        this.f34494n = t41Var.f35278n;
        this.f34495o = t41Var.f35279o;
        this.f34496p = t41Var.f35280p;
    }
}
