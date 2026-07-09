package com.theathletic.onboarding.ui.following;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/theathletic/onboarding/ui/following/PushPromptTitle;", "", "", "titleResId", "", "highlightedName", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.IDLING, QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushPromptTitle {
    public static final int $stable = 0;

    @NotNull
    private final String highlightedName;
    private final int titleResId;

    public PushPromptTitle(int i11, String highlightedName) {
        Intrinsics.checkNotNullParameter(highlightedName, "highlightedName");
        this.titleResId = i11;
        this.highlightedName = highlightedName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHighlightedName() {
        return this.highlightedName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushPromptTitle)) {
            return false;
        }
        PushPromptTitle pushPromptTitle = (PushPromptTitle) other;
        return this.titleResId == pushPromptTitle.titleResId && Intrinsics.areEqual(this.highlightedName, pushPromptTitle.highlightedName);
    }

    public int hashCode() {
        return (Integer.hashCode(this.titleResId) * 31) + this.highlightedName.hashCode();
    }

    public String toString() {
        return "PushPromptTitle(titleResId=" + this.titleResId + ", highlightedName=" + this.highlightedName + ")";
    }
}
