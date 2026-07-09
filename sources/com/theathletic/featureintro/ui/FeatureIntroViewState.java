package com.theathletic.featureintro.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.featureintro.ui.i0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/theathletic/featureintro/ui/i0;", "", "Lcom/theathletic/featureintro/ui/b0;", "uiModel", "", "currentPage", "<init>", "(Lcom/theathletic/featureintro/ui/b0;I)V", "a", "(Lcom/theathletic/featureintro/ui/b0;I)Lcom/theathletic/featureintro/ui/i0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/theathletic/featureintro/ui/b0;", QueryKeys.SUBDOMAIN, "()Lcom/theathletic/featureintro/ui/b0;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureIntroViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FeatureIntroUiModel uiModel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int currentPage;

    public FeatureIntroViewState(FeatureIntroUiModel uiModel, int i11) {
        Intrinsics.checkNotNullParameter(uiModel, "uiModel");
        this.uiModel = uiModel;
        this.currentPage = i11;
    }

    public static /* synthetic */ FeatureIntroViewState b(FeatureIntroViewState featureIntroViewState, FeatureIntroUiModel featureIntroUiModel, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            featureIntroUiModel = featureIntroViewState.uiModel;
        }
        if ((i12 & 2) != 0) {
            i11 = featureIntroViewState.currentPage;
        }
        return featureIntroViewState.a(featureIntroUiModel, i11);
    }

    public final FeatureIntroViewState a(FeatureIntroUiModel uiModel, int currentPage) {
        Intrinsics.checkNotNullParameter(uiModel, "uiModel");
        return new FeatureIntroViewState(uiModel, currentPage);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FeatureIntroUiModel getUiModel() {
        return this.uiModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureIntroViewState)) {
            return false;
        }
        FeatureIntroViewState featureIntroViewState = (FeatureIntroViewState) other;
        return Intrinsics.areEqual(this.uiModel, featureIntroViewState.uiModel) && this.currentPage == featureIntroViewState.currentPage;
    }

    public int hashCode() {
        return (this.uiModel.hashCode() * 31) + Integer.hashCode(this.currentPage);
    }

    public String toString() {
        return "FeatureIntroViewState(uiModel=" + this.uiModel + ", currentPage=" + this.currentPage + ")";
    }
}
