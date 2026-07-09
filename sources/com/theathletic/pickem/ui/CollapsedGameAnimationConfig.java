package com.theathletic.pickem.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.theathletic.pickem.ui.b, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/theathletic/pickem/ui/b;", "", "", "correctPickCount", "totalCorrectPickCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "getCorrectPickCount", QueryKeys.PAGE_LOAD_TIME, "getTotalCorrectPickCount", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollapsedGameAnimationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int correctPickCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalCorrectPickCount;

    public CollapsedGameAnimationConfig(int i11, int i12) {
        this.correctPickCount = i11;
        this.totalCorrectPickCount = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollapsedGameAnimationConfig)) {
            return false;
        }
        CollapsedGameAnimationConfig collapsedGameAnimationConfig = (CollapsedGameAnimationConfig) other;
        return this.correctPickCount == collapsedGameAnimationConfig.correctPickCount && this.totalCorrectPickCount == collapsedGameAnimationConfig.totalCorrectPickCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.correctPickCount) * 31) + Integer.hashCode(this.totalCorrectPickCount);
    }

    public String toString() {
        return "CollapsedGameAnimationConfig(correctPickCount=" + this.correctPickCount + ", totalCorrectPickCount=" + this.totalCorrectPickCount + ")";
    }
}
