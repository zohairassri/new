package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import n4.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f2398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f2399c;

    private g0(Context context, TypedArray typedArray) {
        this.f2397a = context;
        this.f2398b = typedArray;
    }

    public static g0 t(Context context, int i11, int[] iArr) {
        return new g0(context, context.obtainStyledAttributes(i11, iArr));
    }

    public static g0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g0 v(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12) {
        return new g0(context, context.obtainStyledAttributes(attributeSet, iArr, i11, i12));
    }

    public boolean a(int i11, boolean z11) {
        return this.f2398b.getBoolean(i11, z11);
    }

    public int b(int i11, int i12) {
        return this.f2398b.getColor(i11, i12);
    }

    public ColorStateList c(int i11) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f2398b.hasValue(i11) || (resourceId = this.f2398b.getResourceId(i11, 0)) == 0 || (colorStateListA = i.a.a(this.f2397a, resourceId)) == null) ? this.f2398b.getColorStateList(i11) : colorStateListA;
    }

    public float d(int i11, float f11) {
        return this.f2398b.getDimension(i11, f11);
    }

    public int e(int i11, int i12) {
        return this.f2398b.getDimensionPixelOffset(i11, i12);
    }

    public int f(int i11, int i12) {
        return this.f2398b.getDimensionPixelSize(i11, i12);
    }

    public Drawable g(int i11) {
        int resourceId;
        return (!this.f2398b.hasValue(i11) || (resourceId = this.f2398b.getResourceId(i11, 0)) == 0) ? this.f2398b.getDrawable(i11) : i.a.b(this.f2397a, resourceId);
    }

    public Drawable h(int i11) {
        int resourceId;
        if (!this.f2398b.hasValue(i11) || (resourceId = this.f2398b.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return g.b().d(this.f2397a, resourceId, true);
    }

    public float i(int i11, float f11) {
        return this.f2398b.getFloat(i11, f11);
    }

    public Typeface j(int i11, int i12, k.e eVar) {
        int resourceId = this.f2398b.getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2399c == null) {
            this.f2399c = new TypedValue();
        }
        return n4.k.h(this.f2397a, resourceId, this.f2399c, i12, eVar);
    }

    public int k(int i11, int i12) {
        return this.f2398b.getInt(i11, i12);
    }

    public int l(int i11, int i12) {
        return this.f2398b.getInteger(i11, i12);
    }

    public int m(int i11, int i12) {
        return this.f2398b.getLayoutDimension(i11, i12);
    }

    public int n(int i11, int i12) {
        return this.f2398b.getResourceId(i11, i12);
    }

    public String o(int i11) {
        return this.f2398b.getString(i11);
    }

    public CharSequence p(int i11) {
        return this.f2398b.getText(i11);
    }

    public CharSequence[] q(int i11) {
        return this.f2398b.getTextArray(i11);
    }

    public TypedArray r() {
        return this.f2398b;
    }

    public boolean s(int i11) {
        return this.f2398b.hasValue(i11);
    }

    public TypedValue w(int i11) {
        return this.f2398b.peekValue(i11);
    }

    public void x() {
        this.f2398b.recycle();
    }
}
