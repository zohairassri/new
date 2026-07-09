package com.theathletic.boxscore.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/theathletic/boxscore/ui/jb;", "", "<init>", "()V", QueryKeys.SUBDOMAIN, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "a", QueryKeys.PAGE_LOAD_TIME, "Lcom/theathletic/boxscore/ui/jb$a;", "Lcom/theathletic/boxscore/ui/jb$c;", "Lcom/theathletic/boxscore/ui/jb$d;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class jb {

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.jb$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R$\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010\u0012¨\u0006#"}, d2 = {"Lcom/theathletic/boxscore/ui/jb$a;", "Lcom/theathletic/boxscore/ui/jb;", "", "clock", "description", "headerLabel", "id", "", "Lcom/theathletic/data/n;", "Lcom/theathletic/data/SizedImages;", "teamLogos", "", "iconRes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "getId", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Ljava/util/List;", "()Ljava/util/List;", QueryKeys.VISIT_FREQUENCY, QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EventSoccerMoment extends jb {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clock;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String headerLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List teamLogos;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventSoccerMoment(String clock, String description, String headerLabel, String id2, List teamLogos, int i11) {
            super(null);
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(teamLogos, "teamLogos");
            this.clock = clock;
            this.description = description;
            this.headerLabel = headerLabel;
            this.id = id2;
            this.teamLogos = teamLogos;
            this.iconRes = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getHeaderLabel() {
            return this.headerLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getIconRes() {
            return this.iconRes;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public List getTeamLogos() {
            return this.teamLogos;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventSoccerMoment)) {
                return false;
            }
            EventSoccerMoment eventSoccerMoment = (EventSoccerMoment) other;
            return Intrinsics.areEqual(this.clock, eventSoccerMoment.clock) && Intrinsics.areEqual(this.description, eventSoccerMoment.description) && Intrinsics.areEqual(this.headerLabel, eventSoccerMoment.headerLabel) && Intrinsics.areEqual(this.id, eventSoccerMoment.id) && Intrinsics.areEqual(this.teamLogos, eventSoccerMoment.teamLogos) && this.iconRes == eventSoccerMoment.iconRes;
        }

        public int hashCode() {
            return (((((((((this.clock.hashCode() * 31) + this.description.hashCode()) * 31) + this.headerLabel.hashCode()) * 31) + this.id.hashCode()) * 31) + this.teamLogos.hashCode()) * 31) + Integer.hashCode(this.iconRes);
        }

        public String toString() {
            return "EventSoccerMoment(clock=" + this.clock + ", description=" + this.description + ", headerLabel=" + this.headerLabel + ", id=" + this.id + ", teamLogos=" + this.teamLogos + ", iconRes=" + this.iconRes + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/theathletic/boxscore/ui/jb$b;", "", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theathletic/boxscore/ui/jb$b$a;", "Lcom/theathletic/feed/ui/s;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements com.theathletic.feed.ui.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f52035a = new a();

            private a() {
            }
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.jb$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\"\u0010\u0013R$\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b'\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b&\u0010\u0013R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b(\u0010\u0013¨\u0006*"}, d2 = {"Lcom/theathletic/boxscore/ui/jb$c;", "Lcom/theathletic/boxscore/ui/jb;", "", "clock", "description", "headerLabel", "id", "", "Lcom/theathletic/data/n;", "Lcom/theathletic/data/SizedImages;", "teamLogos", "awayTeamScore", "homeTeamScore", "awayTeamName", "homeTeamName", "teamColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "getId", "Ljava/util/List;", QueryKeys.VIEW_TITLE, "()Ljava/util/List;", QueryKeys.VISIT_FREQUENCY, QueryKeys.ACCOUNT_ID, QueryKeys.HOST, QueryKeys.DECAY, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScoringSoccerMoment extends jb {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clock;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String headerLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List teamLogos;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String awayTeamScore;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String homeTeamScore;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String awayTeamName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String homeTeamName;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String teamColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScoringSoccerMoment(String clock, String description, String headerLabel, String id2, List teamLogos, String awayTeamScore, String homeTeamScore, String awayTeamName, String homeTeamName, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(teamLogos, "teamLogos");
            Intrinsics.checkNotNullParameter(awayTeamScore, "awayTeamScore");
            Intrinsics.checkNotNullParameter(homeTeamScore, "homeTeamScore");
            Intrinsics.checkNotNullParameter(awayTeamName, "awayTeamName");
            Intrinsics.checkNotNullParameter(homeTeamName, "homeTeamName");
            this.clock = clock;
            this.description = description;
            this.headerLabel = headerLabel;
            this.id = id2;
            this.teamLogos = teamLogos;
            this.awayTeamScore = awayTeamScore;
            this.homeTeamScore = homeTeamScore;
            this.awayTeamName = awayTeamName;
            this.homeTeamName = homeTeamName;
            this.teamColor = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAwayTeamName() {
            return this.awayTeamName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAwayTeamScore() {
            return this.awayTeamScore;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public String getHeaderLabel() {
            return this.headerLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScoringSoccerMoment)) {
                return false;
            }
            ScoringSoccerMoment scoringSoccerMoment = (ScoringSoccerMoment) other;
            return Intrinsics.areEqual(this.clock, scoringSoccerMoment.clock) && Intrinsics.areEqual(this.description, scoringSoccerMoment.description) && Intrinsics.areEqual(this.headerLabel, scoringSoccerMoment.headerLabel) && Intrinsics.areEqual(this.id, scoringSoccerMoment.id) && Intrinsics.areEqual(this.teamLogos, scoringSoccerMoment.teamLogos) && Intrinsics.areEqual(this.awayTeamScore, scoringSoccerMoment.awayTeamScore) && Intrinsics.areEqual(this.homeTeamScore, scoringSoccerMoment.homeTeamScore) && Intrinsics.areEqual(this.awayTeamName, scoringSoccerMoment.awayTeamName) && Intrinsics.areEqual(this.homeTeamName, scoringSoccerMoment.homeTeamName) && Intrinsics.areEqual(this.teamColor, scoringSoccerMoment.teamColor);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getHomeTeamName() {
            return this.homeTeamName;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getHomeTeamScore() {
            return this.homeTeamScore;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTeamColor() {
            return this.teamColor;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.clock.hashCode() * 31) + this.description.hashCode()) * 31) + this.headerLabel.hashCode()) * 31) + this.id.hashCode()) * 31) + this.teamLogos.hashCode()) * 31) + this.awayTeamScore.hashCode()) * 31) + this.homeTeamScore.hashCode()) * 31) + this.awayTeamName.hashCode()) * 31) + this.homeTeamName.hashCode()) * 31;
            String str = this.teamColor;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public List getTeamLogos() {
            return this.teamLogos;
        }

        public String toString() {
            return "ScoringSoccerMoment(clock=" + this.clock + ", description=" + this.description + ", headerLabel=" + this.headerLabel + ", id=" + this.id + ", teamLogos=" + this.teamLogos + ", awayTeamScore=" + this.awayTeamScore + ", homeTeamScore=" + this.homeTeamScore + ", awayTeamName=" + this.awayTeamName + ", homeTeamName=" + this.homeTeamName + ", teamColor=" + this.teamColor + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.jb$d, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000eR$\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lcom/theathletic/boxscore/ui/jb$d;", "Lcom/theathletic/boxscore/ui/jb;", "", "clock", "description", "headerLabel", "id", "", "Lcom/theathletic/data/n;", "Lcom/theathletic/data/SizedImages;", "teamLogos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, "getId", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StandardSoccerMoment extends jb {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clock;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String headerLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List teamLogos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StandardSoccerMoment(String clock, String description, String headerLabel, String id2, List teamLogos) {
            super(null);
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(teamLogos, "teamLogos");
            this.clock = clock;
            this.description = description;
            this.headerLabel = headerLabel;
            this.id = id2;
            this.teamLogos = teamLogos;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getClock() {
            return this.clock;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getHeaderLabel() {
            return this.headerLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public List getTeamLogos() {
            return this.teamLogos;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StandardSoccerMoment)) {
                return false;
            }
            StandardSoccerMoment standardSoccerMoment = (StandardSoccerMoment) other;
            return Intrinsics.areEqual(this.clock, standardSoccerMoment.clock) && Intrinsics.areEqual(this.description, standardSoccerMoment.description) && Intrinsics.areEqual(this.headerLabel, standardSoccerMoment.headerLabel) && Intrinsics.areEqual(this.id, standardSoccerMoment.id) && Intrinsics.areEqual(this.teamLogos, standardSoccerMoment.teamLogos);
        }

        public int hashCode() {
            return (((((((this.clock.hashCode() * 31) + this.description.hashCode()) * 31) + this.headerLabel.hashCode()) * 31) + this.id.hashCode()) * 31) + this.teamLogos.hashCode();
        }

        public String toString() {
            return "StandardSoccerMoment(clock=" + this.clock + ", description=" + this.description + ", headerLabel=" + this.headerLabel + ", id=" + this.id + ", teamLogos=" + this.teamLogos + ")";
        }
    }

    public /* synthetic */ jb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private jb() {
    }
}
