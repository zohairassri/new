package org.alfonz.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class StatefulLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f120677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f120678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f120679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f120680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f120681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f120682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f120683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f120684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f120685i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f120686l;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
    }

    public StatefulLayout(@NonNull Context context) {
        this(context, null);
    }

    private int a(boolean z11) {
        if (z11) {
            return 0;
        }
        return this.f120681e ? 4 : 8;
    }

    private void b() {
        if (this.f120682f != null || isInEditMode()) {
            return;
        }
        this.f120682f = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            this.f120682f.add(getChildAt(i11));
        }
        this.f120683g = LayoutInflater.from(getContext()).inflate(this.f120678b, (ViewGroup) this, false);
        this.f120684h = LayoutInflater.from(getContext()).inflate(this.f120679c, (ViewGroup) this, false);
        this.f120685i = LayoutInflater.from(getContext()).inflate(this.f120680d, (ViewGroup) this, false);
        addView(this.f120683g);
        addView(this.f120684h);
        addView(this.f120685i);
        setState(this.f120677a);
    }

    public int getState() {
        return this.f120686l;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b();
    }

    public void setState(int i11) {
        this.f120686l = i11;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= this.f120682f.size()) {
                break;
            }
            View view = (View) this.f120682f.get(i12);
            if (i11 != 0) {
                z11 = false;
            }
            view.setVisibility(a(z11));
            i12++;
        }
        this.f120683g.setVisibility(a(i11 == 1));
        this.f120684h.setVisibility(a(i11 == 2));
        this.f120685i.setVisibility(a(i11 == 3));
    }

    public StatefulLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatefulLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ug0.a.StatefulLayout);
        int i12 = ug0.a.StatefulLayout_state;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f120677a = typedArrayObtainStyledAttributes.getInt(i12, 0);
        }
        int i13 = ug0.a.StatefulLayout_progressLayout;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            int i14 = ug0.a.StatefulLayout_offlineLayout;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                int i15 = ug0.a.StatefulLayout_emptyLayout;
                if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                    this.f120678b = typedArrayObtainStyledAttributes.getResourceId(i13, 0);
                    this.f120679c = typedArrayObtainStyledAttributes.getResourceId(i14, 0);
                    this.f120680d = typedArrayObtainStyledAttributes.getResourceId(i15, 0);
                    this.f120681e = typedArrayObtainStyledAttributes.getBoolean(ug0.a.StatefulLayout_invisibleWhenHidden, false);
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Attributes progressLayout, offlineLayout and emptyLayout are mandatory");
    }

    public void setOnStateChangeListener(a aVar) {
    }
}
