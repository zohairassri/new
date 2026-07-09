package com.theathletic.onboarding.component.models;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/theathletic/onboarding/component/models/ContentTags;", "", "", "", "leagueIds", "teamIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "a", "()Ljava/util/List;", QueryKeys.PAGE_LOAD_TIME, "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContentTags {

    @NotNull
    private final List<String> leagueIds;

    @NotNull
    private final List<String> teamIds;

    public ContentTags(List leagueIds, List teamIds) {
        Intrinsics.checkNotNullParameter(leagueIds, "leagueIds");
        Intrinsics.checkNotNullParameter(teamIds, "teamIds");
        this.leagueIds = leagueIds;
        this.teamIds = teamIds;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getLeagueIds() {
        return this.leagueIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getTeamIds() {
        return this.teamIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentTags)) {
            return false;
        }
        ContentTags contentTags = (ContentTags) other;
        return Intrinsics.areEqual(this.leagueIds, contentTags.leagueIds) && Intrinsics.areEqual(this.teamIds, contentTags.teamIds);
    }

    public int hashCode() {
        return (this.leagueIds.hashCode() * 31) + this.teamIds.hashCode();
    }

    public String toString() {
        return "ContentTags(leagueIds=" + this.leagueIds + ", teamIds=" + this.teamIds + ")";
    }
}
