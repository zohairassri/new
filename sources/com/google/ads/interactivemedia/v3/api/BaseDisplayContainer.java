package com.google.ads.interactivemedia.v3.api;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface BaseDisplayContainer {
    void claim();

    @Deprecated
    void destroy();

    @NonNull
    ViewGroup getAdContainer();

    @NonNull
    Collection<CompanionAdSlot> getCompanionSlots();

    void registerFriendlyObstruction(@NonNull FriendlyObstruction friendlyObstruction);

    @Deprecated
    void registerVideoControlsOverlay(@NonNull View view);

    @Deprecated
    void setAdContainer(@NonNull ViewGroup viewGroup);

    void setCompanionSlots(Collection<CompanionAdSlot> collection);

    void unregisterAllFriendlyObstructions();

    @Deprecated
    void unregisterAllVideoControlsOverlays();
}
