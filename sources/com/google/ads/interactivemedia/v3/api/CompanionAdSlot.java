package com.google.ads.interactivemedia.v3.api;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface CompanionAdSlot {
    public static final int FLUID_SIZE = -2;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface ClickListener {
        void onCompanionAdClick();
    }

    void addClickListener(@NonNull ClickListener clickListener);

    @NonNull
    ViewGroup getContainer();

    int getHeight();

    int getWidth();

    boolean isFilled();

    void removeClickListener(@NonNull ClickListener clickListener);

    void setContainer(@NonNull ViewGroup viewGroup);

    void setSize(int i11, int i12);
}
