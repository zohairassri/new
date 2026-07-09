package com.theathletic.pickem.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmShareableRoute;", "", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "DailyPicks", "Leaderboard", "Scorecard", "Lcom/theathletic/pickem/component/data/PickEmShareableRoute$DailyPicks;", "Lcom/theathletic/pickem/component/data/PickEmShareableRoute$Leaderboard;", "Lcom/theathletic/pickem/component/data/PickEmShareableRoute$Scorecard;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PickEmShareableRoute {

    @NotNull
    private final String path;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmShareableRoute$DailyPicks;", "Lcom/theathletic/pickem/component/data/PickEmShareableRoute;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DailyPicks extends PickEmShareableRoute {

        @NotNull
        public static final DailyPicks INSTANCE = new DailyPicks();

        private DailyPicks() {
            super("wc-pickem-picks", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DailyPicks);
        }

        public int hashCode() {
            return 1003101430;
        }

        @NotNull
        public String toString() {
            return "DailyPicks";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmShareableRoute$Leaderboard;", "Lcom/theathletic/pickem/component/data/PickEmShareableRoute;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Leaderboard extends PickEmShareableRoute {

        @NotNull
        public static final Leaderboard INSTANCE = new Leaderboard();

        private Leaderboard() {
            super("wc-pickem-leaderboard", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Leaderboard);
        }

        public int hashCode() {
            return -331166720;
        }

        @NotNull
        public String toString() {
            return "Leaderboard";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmShareableRoute$Scorecard;", "Lcom/theathletic/pickem/component/data/PickEmShareableRoute;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Scorecard extends PickEmShareableRoute {

        @NotNull
        public static final Scorecard INSTANCE = new Scorecard();

        private Scorecard() {
            super("wc-pickem-poster", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Scorecard);
        }

        public int hashCode() {
            return 1281673701;
        }

        @NotNull
        public String toString() {
            return "Scorecard";
        }
    }

    public /* synthetic */ PickEmShareableRoute(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    private PickEmShareableRoute(String str) {
        this.path = str;
    }
}
