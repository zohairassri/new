package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import x4.b1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class u extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f2484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f2490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2492i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b1 f2494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.core.widget.h f2495n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    f f2496r;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static void a(View view, float f11, float f12) {
            view.drawableHotspotChanged(f11, f12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f2497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f2498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f2499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f2500d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f2497a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f2498b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f2499c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f2500d = true;
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            }
        }

        static boolean a() {
            return f2500d;
        }

        static void b(u uVar, int i11, View view) {
            try {
                f2497a.invoke(uVar, Integer.valueOf(i11), view, Boolean.FALSE, -1, -1);
                f2498b.invoke(uVar, Integer.valueOf(i11));
                f2499c.invoke(uVar, Integer.valueOf(i11));
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z11) {
            absListView.setSelectedChildViewEnabled(z11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d extends j.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2501b;

        d(Drawable drawable) {
            super(drawable);
            this.f2501b = true;
        }

        void b(boolean z11) {
            this.f2501b = z11;
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f2501b) {
                super.draw(canvas);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public void setHotspot(float f11, float f12) {
            if (this.f2501b) {
                super.setHotspot(f11, f12);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i11, int i12, int i13, int i14) {
            if (this.f2501b) {
                super.setHotspotBounds(i11, i12, i13, i14);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f2501b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z11, boolean z12) {
            if (this.f2501b) {
                return super.setVisible(z11, z12);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f2502a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
            }
            f2502a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f2502a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z11) {
            Field field = f2502a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z11));
                } catch (IllegalAccessException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class f implements Runnable {
        f() {
        }

        public void a() {
            u uVar = u.this;
            uVar.f2496r = null;
            uVar.removeCallbacks(this);
        }

        public void b() {
            u.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            u uVar = u.this;
            uVar.f2496r = null;
            uVar.drawableStateChanged();
        }
    }

    u(Context context, boolean z11) {
        super(context, null, h.a.dropDownListViewStyle);
        this.f2484a = new Rect();
        this.f2485b = 0;
        this.f2486c = 0;
        this.f2487d = 0;
        this.f2488e = 0;
        this.f2492i = z11;
        setCacheColorHint(0);
    }

    private void a() {
        this.f2493l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2489f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        b1 b1Var = this.f2494m;
        if (b1Var != null) {
            b1Var.c();
            this.f2494m = null;
        }
    }

    private void b(View view, int i11) {
        performItemClick(view, i11, getItemIdAtPosition(i11));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f2484a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f2484a);
        selector.draw(canvas);
    }

    private void f(int i11, View view) {
        Rect rect = this.f2484a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2485b;
        rect.top -= this.f2486c;
        rect.right += this.f2487d;
        rect.bottom += this.f2488e;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i11 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i11, View view) {
        Drawable selector = getSelector();
        boolean z11 = (selector == null || i11 == -1) ? false : true;
        if (z11) {
            selector.setVisible(false, false);
        }
        f(i11, view);
        if (z11) {
            Rect rect = this.f2484a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            p4.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i11, View view, float f11, float f12) {
        g(i11, view);
        Drawable selector = getSelector();
        if (selector == null || i11 == -1) {
            return;
        }
        p4.a.k(selector, f11, f12);
    }

    private void i(View view, int i11, float f11, float f12) {
        View childAt;
        this.f2493l = true;
        a.a(this, f11, f12);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f2489f;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f2489f = i11;
        a.a(view, f11 - view.getLeft(), f12 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i11, view, f11, f12);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z11) {
        d dVar = this.f2490g;
        if (dVar != null) {
            dVar.b(z11);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void l(boolean z11) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z11);
        } else {
            e.b(this, z11);
        }
    }

    private boolean m() {
        return this.f2493l;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i11, int i12, int i13, int i14, int i15) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i11, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i14) {
                return (i15 < 0 || i16 <= i15 || i18 <= 0 || measuredHeight == i14) ? i14 : i18;
            }
            if (i15 >= 0 && i16 >= i15) {
                i18 = measuredHeight;
            }
            i16++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f2496r != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.h r9 = r7.f2495n
            if (r9 != 0) goto L5a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f2495n = r9
        L5a:
            androidx.core.widget.h r9 = r7.f2495n
            r9.m(r1)
            androidx.core.widget.h r9 = r7.f2495n
            r9.onTouch(r7, r8)
            return r3
        L65:
            androidx.core.widget.h r7 = r7.f2495n
            if (r7 == 0) goto L6c
            r7.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f2492i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f2492i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f2492i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f2492i && this.f2491h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f2496r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i11 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2496r == null) {
            f fVar = new f();
            this.f2496r = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i11 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2489f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f2496r;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z11) {
        this.f2491h = z11;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f2490g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2485b = rect.left;
        this.f2486c = rect.top;
        this.f2487d = rect.right;
        this.f2488e = rect.bottom;
    }
}
