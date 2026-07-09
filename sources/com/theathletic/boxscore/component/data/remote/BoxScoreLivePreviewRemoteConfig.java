package com.theathletic.boxscore.component.data.remote;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/theathletic/boxscore/component/data/remote/BoxScoreLivePreviewRemoteConfig;", "", "isStreamingLivePreviewOnBoxScoreEnabled", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BoxScoreLivePreviewRemoteConfig {
    private final boolean isStreamingLivePreviewOnBoxScoreEnabled;

    public BoxScoreLivePreviewRemoteConfig(boolean z11) {
        this.isStreamingLivePreviewOnBoxScoreEnabled = z11;
    }

    public static /* synthetic */ BoxScoreLivePreviewRemoteConfig copy$default(BoxScoreLivePreviewRemoteConfig boxScoreLivePreviewRemoteConfig, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = boxScoreLivePreviewRemoteConfig.isStreamingLivePreviewOnBoxScoreEnabled;
        }
        return boxScoreLivePreviewRemoteConfig.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsStreamingLivePreviewOnBoxScoreEnabled() {
        return this.isStreamingLivePreviewOnBoxScoreEnabled;
    }

    @NotNull
    public final BoxScoreLivePreviewRemoteConfig copy(boolean isStreamingLivePreviewOnBoxScoreEnabled) {
        return new BoxScoreLivePreviewRemoteConfig(isStreamingLivePreviewOnBoxScoreEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BoxScoreLivePreviewRemoteConfig) && this.isStreamingLivePreviewOnBoxScoreEnabled == ((BoxScoreLivePreviewRemoteConfig) other).isStreamingLivePreviewOnBoxScoreEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isStreamingLivePreviewOnBoxScoreEnabled);
    }

    public final boolean isStreamingLivePreviewOnBoxScoreEnabled() {
        return this.isStreamingLivePreviewOnBoxScoreEnabled;
    }

    @NotNull
    public String toString() {
        return "BoxScoreLivePreviewRemoteConfig(isStreamingLivePreviewOnBoxScoreEnabled=" + this.isStreamingLivePreviewOnBoxScoreEnabled + ")";
    }
}
