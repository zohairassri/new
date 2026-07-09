package com.theathletic.search.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.theathletic.search.ui.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class SearchStatefulLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f80947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f80948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f80949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f80950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f80951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f80952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f80953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f80954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f80955i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f80956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f80957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f80958n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f80959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f80960s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f80961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f80962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a f80963x;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void a(View view, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public SearchStatefulLayout(@NonNull Context context) {
        this(context, null);
    }

    private int a(boolean z11) {
        if (z11) {
            return 0;
        }
        return this.f80954h ? 4 : 8;
    }

    private void b() {
        if (this.f80955i != null || isInEditMode()) {
            return;
        }
        this.f80955i = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            this.f80955i.add(getChildAt(i11));
        }
        this.f80956l = LayoutInflater.from(getContext()).inflate(this.f80948b, (ViewGroup) this, false);
        this.f80957m = LayoutInflater.from(getContext()).inflate(this.f80949c, (ViewGroup) this, false);
        this.f80958n = LayoutInflater.from(getContext()).inflate(this.f80950d, (ViewGroup) this, false);
        this.f80959r = LayoutInflater.from(getContext()).inflate(this.f80951e, (ViewGroup) this, false);
        this.f80960s = LayoutInflater.from(getContext()).inflate(this.f80952f, (ViewGroup) this, false);
        this.f80961v = LayoutInflater.from(getContext()).inflate(this.f80953g, (ViewGroup) this, false);
        addView(this.f80956l);
        addView(this.f80957m);
        addView(this.f80958n);
        addView(this.f80959r);
        addView(this.f80960s);
        addView(this.f80961v);
        setState(this.f80947a);
    }

    public int getState() {
        return this.f80962w;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b();
    }

    public void setOnStateChangeListener(a aVar) {
        this.f80963x = aVar;
    }

    public void setState(int i11) {
        this.f80962w = i11;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= this.f80955i.size()) {
                break;
            }
            View view = (View) this.f80955i.get(i12);
            if (i11 != 0) {
                z11 = false;
            }
            view.setVisibility(a(z11));
            i12++;
        }
        this.f80956l.setVisibility(a(i11 == 1));
        this.f80957m.setVisibility(a(i11 == 2));
        this.f80958n.setVisibility(a(i11 == 3));
        this.f80959r.setVisibility(a(i11 == 4));
        this.f80960s.setVisibility(a(i11 == 5));
        this.f80961v.setVisibility(a(i11 == 6));
        a aVar = this.f80963x;
        if (aVar != null) {
            aVar.a(this, i11);
        }
    }

    public SearchStatefulLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchStatefulLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.r.SearchStatefulLayout);
        int i12 = c.r.SearchStatefulLayout_searchState;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f80947a = typedArrayObtainStyledAttributes.getInt(i12, 0);
        }
        int i13 = c.r.SearchStatefulLayout_searchProgressLayout;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            int i14 = c.r.SearchStatefulLayout_searchOfflineLayout;
            if (typedArrayObtainStyledAttributes.hasValue(i14)) {
                int i15 = c.r.SearchStatefulLayout_searchAuthorEmptyLayout;
                if (typedArrayObtainStyledAttributes.hasValue(i15)) {
                    int i16 = c.r.SearchStatefulLayout_searchTeamEmptyLayout;
                    if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                        int i17 = c.r.SearchStatefulLayout_searchLeagueEmptyLayout;
                        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
                            int i18 = c.r.SearchStatefulLayout_searchNotFoundLayout;
                            if (typedArrayObtainStyledAttributes.hasValue(i18)) {
                                this.f80948b = typedArrayObtainStyledAttributes.getResourceId(i13, 0);
                                this.f80949c = typedArrayObtainStyledAttributes.getResourceId(i14, 0);
                                this.f80950d = typedArrayObtainStyledAttributes.getResourceId(i15, 0);
                                this.f80951e = typedArrayObtainStyledAttributes.getResourceId(i16, 0);
                                this.f80952f = typedArrayObtainStyledAttributes.getResourceId(i17, 0);
                                this.f80953g = typedArrayObtainStyledAttributes.getResourceId(i18, 0);
                                this.f80954h = typedArrayObtainStyledAttributes.getBoolean(c.r.SearchStatefulLayout_searchInvisibleWhenHidden, false);
                                typedArrayObtainStyledAttributes.recycle();
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new IllegalArgumentException("Attributes progressLayout, offlineLayout and emptyLayout are mandatory");
    }
}
