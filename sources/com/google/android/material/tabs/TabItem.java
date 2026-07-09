package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.g0;
import tn.m;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f45362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f45363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45364c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g0 g0VarU = g0.u(context, attributeSet, m.TabItem);
        this.f45362a = g0VarU.p(m.TabItem_android_text);
        this.f45363b = g0VarU.g(m.TabItem_android_icon);
        this.f45364c = g0VarU.n(m.TabItem_android_layout, 0);
        g0VarU.x();
    }
}
