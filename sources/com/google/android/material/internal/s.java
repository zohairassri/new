package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class s implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f44903a;

    public s(Rect rect) {
        this.f44903a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f11, Rect rect, Rect rect2) {
        this.f44903a.set(rect.left + ((int) ((rect2.left - r0) * f11)), rect.top + ((int) ((rect2.top - r1) * f11)), rect.right + ((int) ((rect2.right - r2) * f11)), rect.bottom + ((int) ((rect2.bottom - r6) * f11)));
        return this.f44903a;
    }
}
