package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TypedValue f2104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f2105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f2106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f2107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f2108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f2109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f2110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f2111h;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2108e == null) {
            this.f2108e = new TypedValue();
        }
        return this.f2108e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2109f == null) {
            this.f2109f = new TypedValue();
        }
        return this.f2109f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2106c == null) {
            this.f2106c = new TypedValue();
        }
        return this.f2106c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2107d == null) {
            this.f2107d = new TypedValue();
        }
        return this.f2107d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2104a == null) {
            this.f2104a = new TypedValue();
        }
        return this.f2104a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2105b == null) {
            this.f2105b = new TypedValue();
        }
        return this.f2105b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f2111h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f2111h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f2111h = aVar;
    }

    public void setDecorPadding(int i11, int i12, int i13, int i14) {
        this.f2110g.set(i11, i12, i13, i14);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2110g = new Rect();
    }
}
