package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f1893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f1896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f1897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f1898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f1899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f1900i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1901l;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1896e;
        if (drawable != null && drawable.isStateful()) {
            this.f1896e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1897f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1897f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1898g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1898g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1893b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1896e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1897f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1898g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1894c = findViewById(h.f.action_bar);
        this.f1895d = findViewById(h.f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1892a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f1893b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f1899h
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f1898g
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f1896e
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f1894c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f1896e
            android.view.View r7 = r4.f1894c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1894c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1894c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1894c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f1895d
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f1896e
            android.view.View r7 = r4.f1895d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1895d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1895d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1895d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f1896e
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f1900i = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f1897f
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        if (this.f1894c == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i13 = this.f1901l) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i12)), IntCompanionObject.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f1894c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        View view = this.f1893b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f1894c) ? a(this.f1894c) : !b(this.f1895d) ? a(this.f1895d) : 0) + a(this.f1893b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i12) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1896e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1896e);
        }
        this.f1896e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1894c;
            if (view != null) {
                this.f1896e.setBounds(view.getLeft(), this.f1894c.getTop(), this.f1894c.getRight(), this.f1894c.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f1899h ? !(this.f1896e != null || this.f1897f != null) : this.f1898g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1898g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1898g);
        }
        this.f1898g = drawable;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1899h && (drawable2 = this.f1898g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1899h ? !(this.f1896e != null || this.f1897f != null) : this.f1898g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1897f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1897f);
        }
        this.f1897f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1900i && (drawable2 = this.f1897f) != null) {
                drawable2.setBounds(this.f1893b.getLeft(), this.f1893b.getTop(), this.f1893b.getRight(), this.f1893b.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f1899h ? !(this.f1896e != null || this.f1897f != null) : this.f1898g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f1893b;
        if (view != null) {
            removeView(view);
        }
        this.f1893b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z11) {
        this.f1892a = z11;
        setDescendantFocusability(z11 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f1896e;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f1897f;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f1898g;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f1896e && !this.f1899h) {
            return true;
        }
        if (drawable == this.f1897f && this.f1900i) {
            return true;
        }
        return (drawable == this.f1898g && this.f1899h) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.ActionBar);
        this.f1896e = typedArrayObtainStyledAttributes.getDrawable(h.j.ActionBar_background);
        this.f1897f = typedArrayObtainStyledAttributes.getDrawable(h.j.ActionBar_backgroundStacked);
        this.f1901l = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.ActionBar_height, -1);
        boolean z11 = true;
        if (getId() == h.f.split_action_bar) {
            this.f1899h = true;
            this.f1898g = typedArrayObtainStyledAttributes.getDrawable(h.j.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1899h ? this.f1896e != null || this.f1897f != null : this.f1898g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }
}
