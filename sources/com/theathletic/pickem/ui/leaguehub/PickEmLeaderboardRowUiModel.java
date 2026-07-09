package com.theathletic.pickem.ui.leaguehub;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.pickem.ui.leaguehub.g0, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/theathletic/pickem/ui/leaguehub/g0;", "", "", "rank", "", "avatarUri", "avatarInitial", "name", "", "statValues", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, QueryKeys.SUBDOMAIN, QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickEmLeaderboardRowUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rank;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String avatarUri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String avatarInitial;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List statValues;

    public PickEmLeaderboardRowUiModel(int i11, String str, String avatarInitial, String name, List statValues) {
        Intrinsics.checkNotNullParameter(avatarInitial, "avatarInitial");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(statValues, "statValues");
        this.rank = i11;
        this.avatarUri = str;
        this.avatarInitial = avatarInitial;
        this.name = name;
        this.statValues = statValues;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvatarInitial() {
        return this.avatarInitial;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvatarUri() {
        return this.avatarUri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getStatValues() {
        return this.statValues;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickEmLeaderboardRowUiModel)) {
            return false;
        }
        PickEmLeaderboardRowUiModel pickEmLeaderboardRowUiModel = (PickEmLeaderboardRowUiModel) other;
        return this.rank == pickEmLeaderboardRowUiModel.rank && Intrinsics.areEqual(this.avatarUri, pickEmLeaderboardRowUiModel.avatarUri) && Intrinsics.areEqual(this.avatarInitial, pickEmLeaderboardRowUiModel.avatarInitial) && Intrinsics.areEqual(this.name, pickEmLeaderboardRowUiModel.name) && Intrinsics.areEqual(this.statValues, pickEmLeaderboardRowUiModel.statValues);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.rank) * 31;
        String str = this.avatarUri;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.avatarInitial.hashCode()) * 31) + this.name.hashCode()) * 31) + this.statValues.hashCode();
    }

    public String toString() {
        return "PickEmLeaderboardRowUiModel(rank=" + this.rank + ", avatarUri=" + this.avatarUri + ", avatarInitial=" + this.avatarInitial + ", name=" + this.name + ", statValues=" + this.statValues + ")";
    }
}
