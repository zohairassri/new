package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44783a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final void b(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f44783a = i11;
        }
    }

    public final int getUserSetVisibility() {
        return this.f44783a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        b(i11, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44783a = getVisibility();
    }
}
