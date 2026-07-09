package com.theathletic.repository.user;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.repository.user.r, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/theathletic/repository/user/r;", "", "", "Lcom/theathletic/repository/user/y;", "teams", "Lcom/theathletic/repository/user/v;", "leagues", "Lcom/theathletic/repository/user/a;", "authors", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Ljava/util/List;", QueryKeys.PAGE_LOAD_TIME, "db_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FollowableItems {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List teams;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List leagues;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List authors;

    public FollowableItems(List teams, List leagues, List authors) {
        Intrinsics.checkNotNullParameter(teams, "teams");
        Intrinsics.checkNotNullParameter(leagues, "leagues");
        Intrinsics.checkNotNullParameter(authors, "authors");
        this.teams = teams;
        this.leagues = leagues;
        this.authors = authors;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAuthors() {
        return this.authors;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getLeagues() {
        return this.leagues;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTeams() {
        return this.teams;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowableItems)) {
            return false;
        }
        FollowableItems followableItems = (FollowableItems) other;
        return Intrinsics.areEqual(this.teams, followableItems.teams) && Intrinsics.areEqual(this.leagues, followableItems.leagues) && Intrinsics.areEqual(this.authors, followableItems.authors);
    }

    public int hashCode() {
        return (((this.teams.hashCode() * 31) + this.leagues.hashCode()) * 31) + this.authors.hashCode();
    }

    public String toString() {
        return "FollowableItems(teams=" + this.teams + ", leagues=" + this.leagues + ", authors=" + this.authors + ")";
    }
}
