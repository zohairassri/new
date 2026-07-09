package com.nytimes.android.subauth.core.purr.directive;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/nytimes/android/subauth/core/purr/directive/AgentTCFInfo;", "", "agentTcfString", "", "agentTCFNoticesHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAgentTcfString", "()Ljava/lang/String;", "getAgentTCFNoticesHash", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AgentTCFInfo {

    @NotNull
    private final String agentTCFNoticesHash;

    @NotNull
    private final String agentTcfString;

    public AgentTCFInfo(@NotNull String agentTcfString, @NotNull String agentTCFNoticesHash) {
        Intrinsics.checkNotNullParameter(agentTcfString, "agentTcfString");
        Intrinsics.checkNotNullParameter(agentTCFNoticesHash, "agentTCFNoticesHash");
        this.agentTcfString = agentTcfString;
        this.agentTCFNoticesHash = agentTCFNoticesHash;
    }

    public static /* synthetic */ AgentTCFInfo copy$default(AgentTCFInfo agentTCFInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = agentTCFInfo.agentTcfString;
        }
        if ((i11 & 2) != 0) {
            str2 = agentTCFInfo.agentTCFNoticesHash;
        }
        return agentTCFInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentTcfString() {
        return this.agentTcfString;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentTCFNoticesHash() {
        return this.agentTCFNoticesHash;
    }

    @NotNull
    public final AgentTCFInfo copy(@NotNull String agentTcfString, @NotNull String agentTCFNoticesHash) {
        Intrinsics.checkNotNullParameter(agentTcfString, "agentTcfString");
        Intrinsics.checkNotNullParameter(agentTCFNoticesHash, "agentTCFNoticesHash");
        return new AgentTCFInfo(agentTcfString, agentTCFNoticesHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentTCFInfo)) {
            return false;
        }
        AgentTCFInfo agentTCFInfo = (AgentTCFInfo) other;
        return Intrinsics.areEqual(this.agentTcfString, agentTCFInfo.agentTcfString) && Intrinsics.areEqual(this.agentTCFNoticesHash, agentTCFInfo.agentTCFNoticesHash);
    }

    @NotNull
    public final String getAgentTCFNoticesHash() {
        return this.agentTCFNoticesHash;
    }

    @NotNull
    public final String getAgentTcfString() {
        return this.agentTcfString;
    }

    public int hashCode() {
        return (this.agentTcfString.hashCode() * 31) + this.agentTCFNoticesHash.hashCode();
    }

    @NotNull
    public String toString() {
        return "AgentTCFInfo(agentTcfString=" + this.agentTcfString + ", agentTCFNoticesHash=" + this.agentTCFNoticesHash + ")";
    }
}
