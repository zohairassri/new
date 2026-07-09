package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.a0;
import tn.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f45013c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45017g;

    protected a(Context context, AttributeSet attributeSet, int i11, int i12) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(tn.e.mtrl_progress_track_thickness);
        TypedArray typedArrayI = a0.i(context, attributeSet, m.BaseProgressIndicator, i11, i12, new int[0]);
        this.f45011a = ho.c.d(context, typedArrayI, m.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f45012b = Math.min(ho.c.d(context, typedArrayI, m.BaseProgressIndicator_trackCornerRadius, 0), this.f45011a / 2);
        this.f45015e = typedArrayI.getInt(m.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f45016f = typedArrayI.getInt(m.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.f45017g = typedArrayI.getDimensionPixelSize(m.BaseProgressIndicator_indicatorTrackGapSize, 0);
        c(context, typedArrayI);
        d(context, typedArrayI);
        typedArrayI.recycle();
    }

    private void c(Context context, TypedArray typedArray) {
        int i11 = m.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i11)) {
            this.f45013c = new int[]{zn.a.b(context, tn.c.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(i11).type != 1) {
            this.f45013c = new int[]{typedArray.getColor(i11, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i11, -1));
        this.f45013c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(Context context, TypedArray typedArray) {
        int i11 = m.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i11)) {
            this.f45014d = typedArray.getColor(i11, -1);
            return;
        }
        this.f45014d = this.f45013c[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f11 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f45014d = zn.a.a(this.f45014d, (int) (f11 * 255.0f));
    }

    public boolean a() {
        return this.f45016f != 0;
    }

    public boolean b() {
        return this.f45015e != 0;
    }

    void e() {
        if (this.f45017g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
