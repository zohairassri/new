package com.theathletic.boxscore.ui.playergrades;

import com.amazonaws.event.ProgressEvent;
import com.chartbeat.androidsdk.QueryKeys;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.boxscore.ui.playergrades.v, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u009e\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0012\b\u0002\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0019R!\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R!\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b*\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b+\u0010\u001b¨\u00062"}, d2 = {"Lcom/theathletic/boxscore/ui/playergrades/v;", "", "", "id", "playerName", "playerStats", "", "Lcom/theathletic/data/n;", "Lcom/theathletic/data/SizedImages;", "playerHeadshot", "teamLogos", "teamColor", "", "awardedGrade", "averageGrade", "totalGrades", "", "isLocked", "isGraded", "playerIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;IZZI)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;IZZI)Lcom/theathletic/boxscore/ui/playergrades/v;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.PAGE_LOAD_TIME, QueryKeys.HOST, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.VIEW_TITLE, QueryKeys.SUBDOMAIN, "Ljava/util/List;", QueryKeys.VISIT_FREQUENCY, "()Ljava/util/List;", "k", QueryKeys.DECAY, QueryKeys.ACCOUNT_ID, QueryKeys.IDLING, "l", QueryKeys.MEMFLY_API_VERSION, QueryKeys.IS_NEW_USER, "()Z", QueryKeys.MAX_SCROLL_DEPTH, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlayerGradeMiniCardModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String playerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String playerStats;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List playerHeadshot;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List teamLogos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String teamColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int awardedGrade;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String averageGrade;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalGrades;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLocked;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGraded;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final int playerIndex;

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.playergrades.v$a */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/theathletic/boxscore/ui/playergrades/v$a;", "", "a", QueryKeys.PAGE_LOAD_TIME, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.theathletic.boxscore.ui.playergrades.v$a$a, reason: collision with other inner class name and from toString */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/theathletic/boxscore/ui/playergrades/v$a$a;", "Lcom/theathletic/feed/ui/s;", "", "playerId", "", "grade", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OnGradePlayer implements com.theathletic.feed.ui.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String playerId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int grade;

            public OnGradePlayer(String playerId, int i11) {
                Intrinsics.checkNotNullParameter(playerId, "playerId");
                this.playerId = playerId;
                this.grade = i11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getGrade() {
                return this.grade;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlayerId() {
                return this.playerId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnGradePlayer)) {
                    return false;
                }
                OnGradePlayer onGradePlayer = (OnGradePlayer) other;
                return Intrinsics.areEqual(this.playerId, onGradePlayer.playerId) && this.grade == onGradePlayer.grade;
            }

            public int hashCode() {
                return (this.playerId.hashCode() * 31) + Integer.hashCode(this.grade);
            }

            public String toString() {
                return "OnGradePlayer(playerId=" + this.playerId + ", grade=" + this.grade + ")";
            }
        }

        /* JADX INFO: renamed from: com.theathletic.boxscore.ui.playergrades.v$a$b, reason: from toString */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/theathletic/boxscore/ui/playergrades/v$a$b;", "Lcom/theathletic/feed/ui/s;", "", "playerId", "", "isLocked", "", "playerIndex", "pageOrder", "<init>", "(Ljava/lang/String;ZII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, QueryKeys.SUBDOMAIN, "()Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OnNavigateToPlayerGradeDetailScreen implements com.theathletic.feed.ui.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String playerId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isLocked;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int playerIndex;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int pageOrder;

            public OnNavigateToPlayerGradeDetailScreen(String playerId, boolean z11, int i11, int i12) {
                Intrinsics.checkNotNullParameter(playerId, "playerId");
                this.playerId = playerId;
                this.isLocked = z11;
                this.playerIndex = i11;
                this.pageOrder = i12;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getPageOrder() {
                return this.pageOrder;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlayerId() {
                return this.playerId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getPlayerIndex() {
                return this.playerIndex;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getIsLocked() {
                return this.isLocked;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnNavigateToPlayerGradeDetailScreen)) {
                    return false;
                }
                OnNavigateToPlayerGradeDetailScreen onNavigateToPlayerGradeDetailScreen = (OnNavigateToPlayerGradeDetailScreen) other;
                return Intrinsics.areEqual(this.playerId, onNavigateToPlayerGradeDetailScreen.playerId) && this.isLocked == onNavigateToPlayerGradeDetailScreen.isLocked && this.playerIndex == onNavigateToPlayerGradeDetailScreen.playerIndex && this.pageOrder == onNavigateToPlayerGradeDetailScreen.pageOrder;
            }

            public int hashCode() {
                return (((((this.playerId.hashCode() * 31) + Boolean.hashCode(this.isLocked)) * 31) + Integer.hashCode(this.playerIndex)) * 31) + Integer.hashCode(this.pageOrder);
            }

            public String toString() {
                return "OnNavigateToPlayerGradeDetailScreen(playerId=" + this.playerId + ", isLocked=" + this.isLocked + ", playerIndex=" + this.playerIndex + ", pageOrder=" + this.pageOrder + ")";
            }
        }
    }

    public PlayerGradeMiniCardModel(String id2, String playerName, String playerStats, List playerHeadshot, List teamLogos, String str, int i11, String averageGrade, int i12, boolean z11, boolean z12, int i13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerStats, "playerStats");
        Intrinsics.checkNotNullParameter(playerHeadshot, "playerHeadshot");
        Intrinsics.checkNotNullParameter(teamLogos, "teamLogos");
        Intrinsics.checkNotNullParameter(averageGrade, "averageGrade");
        this.id = id2;
        this.playerName = playerName;
        this.playerStats = playerStats;
        this.playerHeadshot = playerHeadshot;
        this.teamLogos = teamLogos;
        this.teamColor = str;
        this.awardedGrade = i11;
        this.averageGrade = averageGrade;
        this.totalGrades = i12;
        this.isLocked = z11;
        this.isGraded = z12;
        this.playerIndex = i13;
    }

    public static /* synthetic */ PlayerGradeMiniCardModel b(PlayerGradeMiniCardModel playerGradeMiniCardModel, String str, String str2, String str3, List list, List list2, String str4, int i11, String str5, int i12, boolean z11, boolean z12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = playerGradeMiniCardModel.id;
        }
        if ((i14 & 2) != 0) {
            str2 = playerGradeMiniCardModel.playerName;
        }
        if ((i14 & 4) != 0) {
            str3 = playerGradeMiniCardModel.playerStats;
        }
        if ((i14 & 8) != 0) {
            list = playerGradeMiniCardModel.playerHeadshot;
        }
        if ((i14 & 16) != 0) {
            list2 = playerGradeMiniCardModel.teamLogos;
        }
        if ((i14 & 32) != 0) {
            str4 = playerGradeMiniCardModel.teamColor;
        }
        if ((i14 & 64) != 0) {
            i11 = playerGradeMiniCardModel.awardedGrade;
        }
        if ((i14 & 128) != 0) {
            str5 = playerGradeMiniCardModel.averageGrade;
        }
        if ((i14 & 256) != 0) {
            i12 = playerGradeMiniCardModel.totalGrades;
        }
        if ((i14 & AudioRoutingController.DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER) != 0) {
            z11 = playerGradeMiniCardModel.isLocked;
        }
        if ((i14 & 1024) != 0) {
            z12 = playerGradeMiniCardModel.isGraded;
        }
        if ((i14 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0) {
            i13 = playerGradeMiniCardModel.playerIndex;
        }
        boolean z13 = z12;
        int i15 = i13;
        int i16 = i12;
        boolean z14 = z11;
        int i17 = i11;
        String str6 = str5;
        List list3 = list2;
        String str7 = str4;
        return playerGradeMiniCardModel.a(str, str2, str3, list, list3, str7, i17, str6, i16, z14, z13, i15);
    }

    public final PlayerGradeMiniCardModel a(String id2, String playerName, String playerStats, List playerHeadshot, List teamLogos, String teamColor, int awardedGrade, String averageGrade, int totalGrades, boolean isLocked, boolean isGraded, int playerIndex) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerStats, "playerStats");
        Intrinsics.checkNotNullParameter(playerHeadshot, "playerHeadshot");
        Intrinsics.checkNotNullParameter(teamLogos, "teamLogos");
        Intrinsics.checkNotNullParameter(averageGrade, "averageGrade");
        return new PlayerGradeMiniCardModel(id2, playerName, playerStats, playerHeadshot, teamLogos, teamColor, awardedGrade, averageGrade, totalGrades, isLocked, isGraded, playerIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAverageGrade() {
        return this.averageGrade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAwardedGrade() {
        return this.awardedGrade;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerGradeMiniCardModel)) {
            return false;
        }
        PlayerGradeMiniCardModel playerGradeMiniCardModel = (PlayerGradeMiniCardModel) other;
        return Intrinsics.areEqual(this.id, playerGradeMiniCardModel.id) && Intrinsics.areEqual(this.playerName, playerGradeMiniCardModel.playerName) && Intrinsics.areEqual(this.playerStats, playerGradeMiniCardModel.playerStats) && Intrinsics.areEqual(this.playerHeadshot, playerGradeMiniCardModel.playerHeadshot) && Intrinsics.areEqual(this.teamLogos, playerGradeMiniCardModel.teamLogos) && Intrinsics.areEqual(this.teamColor, playerGradeMiniCardModel.teamColor) && this.awardedGrade == playerGradeMiniCardModel.awardedGrade && Intrinsics.areEqual(this.averageGrade, playerGradeMiniCardModel.averageGrade) && this.totalGrades == playerGradeMiniCardModel.totalGrades && this.isLocked == playerGradeMiniCardModel.isLocked && this.isGraded == playerGradeMiniCardModel.isGraded && this.playerIndex == playerGradeMiniCardModel.playerIndex;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getPlayerHeadshot() {
        return this.playerHeadshot;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPlayerName() {
        return this.playerName;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.playerName.hashCode()) * 31) + this.playerStats.hashCode()) * 31) + this.playerHeadshot.hashCode()) * 31) + this.teamLogos.hashCode()) * 31;
        String str = this.teamColor;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.awardedGrade)) * 31) + this.averageGrade.hashCode()) * 31) + Integer.hashCode(this.totalGrades)) * 31) + Boolean.hashCode(this.isLocked)) * 31) + Boolean.hashCode(this.isGraded)) * 31) + Integer.hashCode(this.playerIndex);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPlayerStats() {
        return this.playerStats;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTeamColor() {
        return this.teamColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getTeamLogos() {
        return this.teamLogos;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getTotalGrades() {
        return this.totalGrades;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsGraded() {
        return this.isGraded;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    public String toString() {
        return "PlayerGradeMiniCardModel(id=" + this.id + ", playerName=" + this.playerName + ", playerStats=" + this.playerStats + ", playerHeadshot=" + this.playerHeadshot + ", teamLogos=" + this.teamLogos + ", teamColor=" + this.teamColor + ", awardedGrade=" + this.awardedGrade + ", averageGrade=" + this.averageGrade + ", totalGrades=" + this.totalGrades + ", isLocked=" + this.isLocked + ", isGraded=" + this.isGraded + ", playerIndex=" + this.playerIndex + ")";
    }

    public /* synthetic */ PlayerGradeMiniCardModel(String str, String str2, String str3, List list, List list2, String str4, int i11, String str5, int i12, boolean z11, boolean z12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, list2, str4, i11, str5, i12, z11, z12, (i14 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? -1 : i13);
    }
}
