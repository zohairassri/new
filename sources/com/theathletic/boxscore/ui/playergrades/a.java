package com.theathletic.boxscore.ui.playergrades;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/theathletic/boxscore/ui/playergrades/a;", "", "<init>", "()V", "a", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.playergrades.a$a, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/theathletic/boxscore/ui/playergrades/a$a;", "", "Lcom/theathletic/boxscore/ui/playergrades/a$b;", "teams", "", "isLocked", "", "Lcom/theathletic/feed/ui/x;", "firstTeamPlayerGrades", "secondTeamPlayerGrades", "<init>", "(Lcom/theathletic/boxscore/ui/playergrades/a$b;ZLjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/theathletic/boxscore/ui/playergrades/a$b;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()Lcom/theathletic/boxscore/ui/playergrades/a$b;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, QueryKeys.SUBDOMAIN, "()Z", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlayerGrades {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Teams teams;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLocked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List firstTeamPlayerGrades;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List secondTeamPlayerGrades;

        public PlayerGrades(Teams teams, boolean z11, List firstTeamPlayerGrades, List secondTeamPlayerGrades) {
            Intrinsics.checkNotNullParameter(teams, "teams");
            Intrinsics.checkNotNullParameter(firstTeamPlayerGrades, "firstTeamPlayerGrades");
            Intrinsics.checkNotNullParameter(secondTeamPlayerGrades, "secondTeamPlayerGrades");
            this.teams = teams;
            this.isLocked = z11;
            this.firstTeamPlayerGrades = firstTeamPlayerGrades;
            this.secondTeamPlayerGrades = secondTeamPlayerGrades;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getFirstTeamPlayerGrades() {
            return this.firstTeamPlayerGrades;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getSecondTeamPlayerGrades() {
            return this.secondTeamPlayerGrades;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Teams getTeams() {
            return this.teams;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsLocked() {
            return this.isLocked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlayerGrades)) {
                return false;
            }
            PlayerGrades playerGrades = (PlayerGrades) other;
            return Intrinsics.areEqual(this.teams, playerGrades.teams) && this.isLocked == playerGrades.isLocked && Intrinsics.areEqual(this.firstTeamPlayerGrades, playerGrades.firstTeamPlayerGrades) && Intrinsics.areEqual(this.secondTeamPlayerGrades, playerGrades.secondTeamPlayerGrades);
        }

        public int hashCode() {
            return (((((this.teams.hashCode() * 31) + Boolean.hashCode(this.isLocked)) * 31) + this.firstTeamPlayerGrades.hashCode()) * 31) + this.secondTeamPlayerGrades.hashCode();
        }

        public String toString() {
            return "PlayerGrades(teams=" + this.teams + ", isLocked=" + this.isLocked + ", firstTeamPlayerGrades=" + this.firstTeamPlayerGrades + ", secondTeamPlayerGrades=" + this.secondTeamPlayerGrades + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.playergrades.a$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/theathletic/boxscore/ui/playergrades/a$b;", "", "", "firstTeamName", "secondTeamName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Teams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstTeamName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secondTeamName;

        public Teams(String firstTeamName, String secondTeamName) {
            Intrinsics.checkNotNullParameter(firstTeamName, "firstTeamName");
            Intrinsics.checkNotNullParameter(secondTeamName, "secondTeamName");
            this.firstTeamName = firstTeamName;
            this.secondTeamName = secondTeamName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFirstTeamName() {
            return this.firstTeamName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSecondTeamName() {
            return this.secondTeamName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Teams)) {
                return false;
            }
            Teams teams = (Teams) other;
            return Intrinsics.areEqual(this.firstTeamName, teams.firstTeamName) && Intrinsics.areEqual(this.secondTeamName, teams.secondTeamName);
        }

        public int hashCode() {
            return (this.firstTeamName.hashCode() * 31) + this.secondTeamName.hashCode();
        }

        public String toString() {
            return "Teams(firstTeamName=" + this.firstTeamName + ", secondTeamName=" + this.secondTeamName + ")";
        }
    }

    private a() {
    }
}
