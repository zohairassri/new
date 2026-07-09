package com.theathletic.pushnotification.component.models;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.pushnotification.component.models.a, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/theathletic/pushnotification/component/models/a;", "", "", "isEnabled", "isDismissible", "", "label", "<init>", "(ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Z", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromptToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDismissible;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    public PromptToggle(boolean z11, boolean z12, String str) {
        this.isEnabled = z11;
        this.isDismissible = z12;
        this.label = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsDismissible() {
        return this.isDismissible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptToggle)) {
            return false;
        }
        PromptToggle promptToggle = (PromptToggle) other;
        return this.isEnabled == promptToggle.isEnabled && this.isDismissible == promptToggle.isDismissible && Intrinsics.areEqual(this.label, promptToggle.label);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isEnabled) * 31) + Boolean.hashCode(this.isDismissible)) * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PromptToggle(isEnabled=" + this.isEnabled + ", isDismissible=" + this.isDismissible + ", label=" + this.label + ")";
    }
}
