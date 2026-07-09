package com.theathletic.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.t5;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 <2\u00020\u0001:\u0003\u000f!\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b\u001e\u0010\fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00103\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R0\u00104\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001d\u0012\u0004\b8\u0010\f\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u0014R\u0018\u0010;\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/theathletic/widget/StatefulLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", QueryKeys.PAGE_LOAD_TIME, "()V", "", "visible", "a", "(Z)I", "onFinishInflate", "progressLayoutId", "setProgressLayout", "(I)V", "offlineLayoutId", "setOfflineLayout", "emptyLayoutId", "setEmptyLayout", "Lcom/theathletic/widget/StatefulLayout$b;", "l", "setOnStateChangeListener", "(Lcom/theathletic/widget/StatefulLayout$b;)V", QueryKeys.IDLING, "getMInitialState$annotations", "mInitialState", "mProgressLayoutId", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "mOfflineLayoutId", QueryKeys.SUBDOMAIN, "mEmptyLayoutId", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.MEMFLY_API_VERSION, "mInvisibleWhenHidden", "", "Landroid/view/View;", QueryKeys.VISIT_FREQUENCY, "Ljava/util/List;", "mContentLayoutList", QueryKeys.ACCOUNT_ID, "Landroid/view/View;", "mProgressLayout", QueryKeys.HOST, "mOfflineLayout", QueryKeys.VIEW_TITLE, "mEmptyLayout", TransferTable.COLUMN_STATE, "getState", "()I", "setState", "getState$annotations", QueryKeys.MAX_SCROLL_DEPTH, "Lcom/theathletic/widget/StatefulLayout$b;", "mOnStateChangeListener", QueryKeys.IS_NEW_USER, "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatefulLayout extends FrameLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f87010r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int mInitialState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int mProgressLayoutId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int mOfflineLayoutId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int mEmptyLayoutId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean mInvisibleWhenHidden;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List mContentLayoutList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private View mProgressLayout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private View mOfflineLayout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private View mEmptyLayout;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private b mOnStateChangeListener;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/widget/StatefulLayout$b;", "", "Landroid/view/View;", "view", "", TransferTable.COLUMN_STATE, "", "a", "(Landroid/view/View;I)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a(View view, int state);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/widget/StatefulLayout$c;", "", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public @interface c {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatefulLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int a(boolean visible) {
        if (visible) {
            return 0;
        }
        return this.mInvisibleWhenHidden ? 4 : 8;
    }

    private final void b() {
        if (this.mContentLayoutList != null || isInEditMode()) {
            return;
        }
        this.mContentLayoutList = new ArrayList();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            List list = this.mContentLayoutList;
            Intrinsics.checkNotNull(list);
            View childAt = getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            list.add(childAt);
        }
        if (this.mProgressLayoutId != 0) {
            this.mProgressLayout = LayoutInflater.from(getContext()).inflate(this.mProgressLayoutId, (ViewGroup) this, false);
        }
        if (this.mOfflineLayoutId != 0) {
            this.mOfflineLayout = LayoutInflater.from(getContext()).inflate(this.mOfflineLayoutId, (ViewGroup) this, false);
        }
        if (this.mEmptyLayoutId != 0) {
            this.mEmptyLayout = LayoutInflater.from(getContext()).inflate(this.mEmptyLayoutId, (ViewGroup) this, false);
        }
        View view = this.mProgressLayout;
        if (view != null) {
            addView(view);
        }
        View view2 = this.mOfflineLayout;
        if (view2 != null) {
            addView(view2);
        }
        View view3 = this.mEmptyLayout;
        if (view3 != null) {
            addView(view3);
        }
        setState(this.mInitialState);
    }

    public final int getState() {
        return this.state;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b();
    }

    public final void setEmptyLayout(int emptyLayoutId) {
        this.mEmptyLayoutId = emptyLayoutId;
        removeView(this.mEmptyLayout);
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.mEmptyLayoutId, (ViewGroup) this, false);
        this.mEmptyLayout = viewInflate;
        addView(viewInflate);
        setState(this.state);
    }

    public final void setOfflineLayout(int offlineLayoutId) {
        this.mOfflineLayoutId = offlineLayoutId;
        removeView(this.mOfflineLayout);
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.mOfflineLayoutId, (ViewGroup) this, false);
        this.mOfflineLayout = viewInflate;
        addView(viewInflate);
        setState(this.state);
    }

    public final void setOnStateChangeListener(@NotNull b l11) {
        Intrinsics.checkNotNullParameter(l11, "l");
        this.mOnStateChangeListener = l11;
    }

    public final void setProgressLayout(int progressLayoutId) {
        this.mProgressLayoutId = progressLayoutId;
        removeView(this.mProgressLayout);
        View viewInflate = LayoutInflater.from(getContext()).inflate(this.mProgressLayoutId, (ViewGroup) this, false);
        this.mProgressLayout = viewInflate;
        addView(viewInflate);
        setState(this.state);
    }

    public final void setState(int i11) {
        this.state = i11;
        List list = this.mContentLayoutList;
        Intrinsics.checkNotNull(list);
        int size = list.size();
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= size) {
                break;
            }
            List list2 = this.mContentLayoutList;
            Intrinsics.checkNotNull(list2);
            View view = (View) list2.get(i12);
            if (i11 != 0) {
                z11 = false;
            }
            view.setVisibility(a(z11));
            i12++;
        }
        View view2 = this.mProgressLayout;
        if (view2 != null) {
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(a(i11 == 1));
        }
        View view3 = this.mOfflineLayout;
        if (view3 != null) {
            Intrinsics.checkNotNull(view3);
            view3.setVisibility(a(i11 == 2));
        }
        View view4 = this.mEmptyLayout;
        if (view4 != null) {
            Intrinsics.checkNotNull(view4);
            view4.setVisibility(a(i11 == 3));
        }
        b bVar = this.mOnStateChangeListener;
        if (bVar != null) {
            Intrinsics.checkNotNull(bVar);
            bVar.a(this, i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatefulLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StatefulLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatefulLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t5.t.StatefulLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            this.mInitialState = typedArrayObtainStyledAttributes.getInt(4, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.mProgressLayoutId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.mOfflineLayoutId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.mEmptyLayoutId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        }
        this.mInvisibleWhenHidden = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static /* synthetic */ void getMInitialState$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }
}
