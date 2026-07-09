package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f10970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10972c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f10973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f10974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10976d;

        private c() {
        }

        public void a(float f11, float f12, boolean z11) {
            this.f10973a = f11;
            this.f10974b = f12;
            this.f10975c = z11;
            if (this.f10976d) {
                return;
            }
            this.f10976d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10976d = false;
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
        return this.f10972c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11;
        float f12;
        super.onMeasure(i11, i12);
        if (this.f10971b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        float f15 = f13 / f14;
        float f16 = (this.f10971b / f15) - 1.0f;
        if (Math.abs(f16) <= 0.01f) {
            this.f10970a.a(this.f10971b, f15, false);
            return;
        }
        int i13 = this.f10972c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    f11 = this.f10971b;
                } else if (i13 == 4) {
                    if (f16 > 0.0f) {
                        f11 = this.f10971b;
                    } else {
                        f12 = this.f10971b;
                    }
                }
                measuredWidth = (int) (f14 * f11);
            } else {
                f12 = this.f10971b;
            }
            measuredHeight = (int) (f13 / f12);
        } else if (f16 > 0.0f) {
            f12 = this.f10971b;
            measuredHeight = (int) (f13 / f12);
        } else {
            f11 = this.f10971b;
            measuredWidth = (int) (f14 * f11);
        }
        this.f10970a.a(this.f10971b, f15, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f11) {
        if (this.f10971b != f11) {
            this.f10971b = f11;
            requestLayout();
        }
    }

    public void setResizeMode(int i11) {
        if (this.f10972c != i11) {
            this.f10972c = i11;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10972c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u0.AspectRatioFrameLayout, 0, 0);
            try {
                this.f10972c = typedArrayObtainStyledAttributes.getInt(u0.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f10970a = new c();
    }

    public void setAspectRatioListener(b bVar) {
    }
}
