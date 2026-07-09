package com.theathletic.boxscore.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/theathletic/boxscore/ui/cd;", "", "<init>", "()V", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class cd {

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.cd$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/theathletic/boxscore/ui/cd$a;", "", "", "Lcom/theathletic/ui/s0;", "strings", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisplayStrings {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List strings;

        public DisplayStrings(List strings) {
            Intrinsics.checkNotNullParameter(strings, "strings");
            this.strings = strings;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getStrings() {
            return this.strings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayStrings) && Intrinsics.areEqual(this.strings, ((DisplayStrings) other).strings);
        }

        public int hashCode() {
            return this.strings.hashCode();
        }

        public String toString() {
            return "DisplayStrings(strings=" + this.strings + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.cd$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/theathletic/boxscore/ui/cd$b;", "", "", "firstTeamValue", "secondTeamValue", "", "showExpectedGoals", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpectedGoals {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstTeamValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secondTeamValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showExpectedGoals;

        public ExpectedGoals() {
            this(null, null, false, 7, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFirstTeamValue() {
            return this.firstTeamValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSecondTeamValue() {
            return this.secondTeamValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShowExpectedGoals() {
            return this.showExpectedGoals;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpectedGoals)) {
                return false;
            }
            ExpectedGoals expectedGoals = (ExpectedGoals) other;
            return Intrinsics.areEqual(this.firstTeamValue, expectedGoals.firstTeamValue) && Intrinsics.areEqual(this.secondTeamValue, expectedGoals.secondTeamValue) && this.showExpectedGoals == expectedGoals.showExpectedGoals;
        }

        public int hashCode() {
            return (((this.firstTeamValue.hashCode() * 31) + this.secondTeamValue.hashCode()) * 31) + Boolean.hashCode(this.showExpectedGoals);
        }

        public String toString() {
            return "ExpectedGoals(firstTeamValue=" + this.firstTeamValue + ", secondTeamValue=" + this.secondTeamValue + ", showExpectedGoals=" + this.showExpectedGoals + ")";
        }

        public ExpectedGoals(String firstTeamValue, String secondTeamValue, boolean z11) {
            Intrinsics.checkNotNullParameter(firstTeamValue, "firstTeamValue");
            Intrinsics.checkNotNullParameter(secondTeamValue, "secondTeamValue");
            this.firstTeamValue = firstTeamValue;
            this.secondTeamValue = secondTeamValue;
            this.showExpectedGoals = z11;
        }

        public /* synthetic */ ExpectedGoals(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11);
        }
    }

    /* JADX INFO: renamed from: com.theathletic.boxscore.ui.cd$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/theathletic/boxscore/ui/cd$c;", "", "", "icon", "", "Lcom/theathletic/boxscore/ui/cd$a;", "firstTeam", "secondTeam", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, QueryKeys.PAGE_LOAD_TIME, "Ljava/util/List;", "()Ljava/util/List;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SummaryItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int icon;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List firstTeam;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List secondTeam;

        public SummaryItem(int i11, List firstTeam, List secondTeam) {
            Intrinsics.checkNotNullParameter(firstTeam, "firstTeam");
            Intrinsics.checkNotNullParameter(secondTeam, "secondTeam");
            this.icon = i11;
            this.firstTeam = firstTeam;
            this.secondTeam = secondTeam;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getFirstTeam() {
            return this.firstTeam;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getSecondTeam() {
            return this.secondTeam;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryItem)) {
                return false;
            }
            SummaryItem summaryItem = (SummaryItem) other;
            return this.icon == summaryItem.icon && Intrinsics.areEqual(this.firstTeam, summaryItem.firstTeam) && Intrinsics.areEqual(this.secondTeam, summaryItem.secondTeam);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.icon) * 31) + this.firstTeam.hashCode()) * 31) + this.secondTeam.hashCode();
        }

        public String toString() {
            return "SummaryItem(icon=" + this.icon + ", firstTeam=" + this.firstTeam + ", secondTeam=" + this.secondTeam + ")";
        }
    }

    private cd() {
    }
}
