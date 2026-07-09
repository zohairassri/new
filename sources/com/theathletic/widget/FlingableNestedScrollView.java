package com.theathletic.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import x4.b0;
import x4.c0;
import x4.j0;
import x4.x;
import x4.y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class FlingableNestedScrollView extends ScrollView implements x, b0, j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f86997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f86998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f86999c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface a {
        void a(FlingableNestedScrollView flingableNestedScrollView, int i11, int i12, int i13, int i14);
    }

    public FlingableNestedScrollView(Context context) {
        super(context);
        this.f86997a = new c0(this);
        this.f86998b = new y(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.widget.ScrollView, android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.widget.ScrollView, android.view.View
    public int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f86998b.a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f86998b.b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f86998b.c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f86998b.f(i11, i12, i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f86997a.a();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f86998b.j();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f86998b.l();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    protected void measureChild(View view, int i11, int i12) {
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        dispatchNestedPreScroll(i11, i12, iArr, null);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f86997a.b(view, view2, i11);
        startNestedScroll(2);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        a aVar = this.f86999c;
        if (aVar != null) {
            aVar.a(this, i11, i12, i13, i14);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return (i11 & 2) != 0;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f86997a.d(view);
        stopNestedScroll();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f86998b.m(z11);
    }

    public void setOnScrollChangeListener(a aVar) {
        this.f86999c = aVar;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return this.f86998b.o(i11);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f86998b.q();
    }

    public FlingableNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86997a = new c0(this);
        this.f86998b = new y(this);
        setNestedScrollingEnabled(true);
    }

    public FlingableNestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f86997a = new c0(this);
        this.f86998b = new y(this);
        setNestedScrollingEnabled(true);
    }
}
