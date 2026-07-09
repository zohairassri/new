package com.theathletic.onboarding.component.models;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lcom/theathletic/onboarding/component/models/OnboardingAutoFollow;", "", "", "", "leagueIds", "teamIds", "region", "Ljava/util/Date;", "startDate", "endDate", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "now", "", QueryKeys.SUBDOMAIN, "(Ljava/util/Date;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "a", "()Ljava/util/List;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "Ljava/util/Date;", "getStartDate", "()Ljava/util/Date;", "getEndDate", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingAutoFollow {
    private final Date endDate;

    @NotNull
    private final List<String> leagueIds;
    private final String region;

    @NotNull
    private final Date startDate;

    @NotNull
    private final List<String> teamIds;

    public OnboardingAutoFollow(List leagueIds, List teamIds, String str, Date startDate, Date date) {
        Intrinsics.checkNotNullParameter(leagueIds, "leagueIds");
        Intrinsics.checkNotNullParameter(teamIds, "teamIds");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.leagueIds = leagueIds;
        this.teamIds = teamIds;
        this.region = str;
        this.startDate = startDate;
        this.endDate = date;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getLeagueIds() {
        return this.leagueIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTeamIds() {
        return this.teamIds;
    }

    public final boolean d(Date now) {
        Intrinsics.checkNotNullParameter(now, "now");
        if (now.compareTo(this.startDate) < 0) {
            return false;
        }
        Date date = this.endDate;
        return date == null || now.compareTo(date) < 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingAutoFollow)) {
            return false;
        }
        OnboardingAutoFollow onboardingAutoFollow = (OnboardingAutoFollow) other;
        return Intrinsics.areEqual(this.leagueIds, onboardingAutoFollow.leagueIds) && Intrinsics.areEqual(this.teamIds, onboardingAutoFollow.teamIds) && Intrinsics.areEqual(this.region, onboardingAutoFollow.region) && Intrinsics.areEqual(this.startDate, onboardingAutoFollow.startDate) && Intrinsics.areEqual(this.endDate, onboardingAutoFollow.endDate);
    }

    public int hashCode() {
        int iHashCode = ((this.leagueIds.hashCode() * 31) + this.teamIds.hashCode()) * 31;
        String str = this.region;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.startDate.hashCode()) * 31;
        Date date = this.endDate;
        return iHashCode2 + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "OnboardingAutoFollow(leagueIds=" + this.leagueIds + ", teamIds=" + this.teamIds + ", region=" + this.region + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ")";
    }
}
