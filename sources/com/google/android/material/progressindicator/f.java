package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.google.android.material.progressindicator.a f45058a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    protected static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f45059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f45060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45062d;

        protected a() {
        }
    }

    public f(com.google.android.material.progressindicator.a aVar) {
        this.f45058a = aVar;
    }

    abstract void a(Canvas canvas, Rect rect, float f11, boolean z11, boolean z12);

    abstract void b(Canvas canvas, Paint paint, int i11, int i12);

    abstract void c(Canvas canvas, Paint paint, a aVar, int i11);

    abstract void d(Canvas canvas, Paint paint, float f11, float f12, int i11, int i12, int i13);

    abstract int e();

    abstract int f();

    void g(Canvas canvas, Rect rect, float f11, boolean z11, boolean z12) {
        this.f45058a.e();
        a(canvas, rect, f11, z11, z12);
    }
}
