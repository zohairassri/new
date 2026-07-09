package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f21268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f21269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21270c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f21271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f21272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21274d;

        private c() {
        }

        public void a(float f11, float f12, boolean z11) {
            this.f21271a = f11;
            this.f21272b = f12;
            this.f21273c = z11;
            if (this.f21274d) {
                return;
            }
            this.f21274d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21274d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f21270c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11;
        float f12;
        super.onMeasure(i11, i12);
        if (this.f21269b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        float f15 = f13 / f14;
        float f16 = (this.f21269b / f15) - 1.0f;
        if (Math.abs(f16) <= 0.01f) {
            this.f21268a.a(this.f21269b, f15, false);
            return;
        }
        int i13 = this.f21270c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    f11 = this.f21269b;
                } else if (i13 == 4) {
                    if (f16 > 0.0f) {
                        f11 = this.f21269b;
                    } else {
                        f12 = this.f21269b;
                    }
                }
                measuredWidth = (int) (f14 * f11);
            } else {
                f12 = this.f21269b;
            }
            measuredHeight = (int) (f13 / f12);
        } else if (f16 > 0.0f) {
            f12 = this.f21269b;
            measuredHeight = (int) (f13 / f12);
        } else {
            f11 = this.f21269b;
            measuredWidth = (int) (f14 * f11);
        }
        this.f21268a.a(this.f21269b, f15, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f11) {
        if (this.f21269b != f11) {
            this.f21269b = f11;
            requestLayout();
        }
    }

    public void setResizeMode(int i11) {
        if (this.f21270c != i11) {
            this.f21270c = i11;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21270c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t.AspectRatioFrameLayout, 0, 0);
            try {
                this.f21270c = typedArrayObtainStyledAttributes.getInt(t.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f21268a = new c();
    }

    public void setAspectRatioListener(b bVar) {
    }
}
