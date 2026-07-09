package com.theathletic.brackets.component.bffbrackets.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext;", "", "Score", "Record", "SeriesResult", "Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext$Record;", "Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext$Score;", "Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext$SeriesResult;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TeamContext {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext$Record;", "Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext;", "record", "", "<init>", "(Ljava/lang/String;)V", "getRecord", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Record implements TeamContext {

        @NotNull
        private final String record;

        public Record(@NotNull String record) {
            Intrinsics.checkNotNullParameter(record, "record");
            this.record = record;
        }

        public static /* synthetic */ Record copy$default(Record record, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = record.record;
            }
            return record.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRecord() {
            return this.record;
        }

        @NotNull
        public final Record copy(@NotNull String record) {
            Intrinsics.checkNotNullParameter(record, "record");
            return new Record(record);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Record) && Intrinsics.areEqual(this.record, ((Record) other).record);
        }

        @NotNull
        public final String getRecord() {
            return this.record;
        }

        public int hashCode() {
            return this.record.hashCode();
        }

        @NotNull
        public String toString() {
            return "Record(record=" + this.record + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext$Score;", "Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext;", "score", "", "penaltyScore", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getScore", "()Ljava/lang/String;", "getPenaltyScore", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Score implements TeamContext {
        private final String penaltyScore;

        @NotNull
        private final String score;

        public Score(@NotNull String score, String str) {
            Intrinsics.checkNotNullParameter(score, "score");
            this.score = score;
            this.penaltyScore = str;
        }

        public static /* synthetic */ Score copy$default(Score score, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = score.score;
            }
            if ((i11 & 2) != 0) {
                str2 = score.penaltyScore;
            }
            return score.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getScore() {
            return this.score;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPenaltyScore() {
            return this.penaltyScore;
        }

        @NotNull
        public final Score copy(@NotNull String score, String penaltyScore) {
            Intrinsics.checkNotNullParameter(score, "score");
            return new Score(score, penaltyScore);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Score)) {
                return false;
            }
            Score score = (Score) other;
            return Intrinsics.areEqual(this.score, score.score) && Intrinsics.areEqual(this.penaltyScore, score.penaltyScore);
        }

        public final String getPenaltyScore() {
            return this.penaltyScore;
        }

        @NotNull
        public final String getScore() {
            return this.score;
        }

        public int hashCode() {
            int iHashCode = this.score.hashCode() * 31;
            String str = this.penaltyScore;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Score(score=" + this.score + ", penaltyScore=" + this.penaltyScore + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext$SeriesResult;", "Lcom/theathletic/brackets/component/bffbrackets/data/model/TeamContext;", "gameResults", "", "", "<init>", "(Ljava/util/List;)V", "getGameResults", "()Ljava/util/List;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeriesResult implements TeamContext {

        @NotNull
        private final List<Boolean> gameResults;

        public SeriesResult(@NotNull List<Boolean> gameResults) {
            Intrinsics.checkNotNullParameter(gameResults, "gameResults");
            this.gameResults = gameResults;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SeriesResult copy$default(SeriesResult seriesResult, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = seriesResult.gameResults;
            }
            return seriesResult.copy(list);
        }

        @NotNull
        public final List<Boolean> component1() {
            return this.gameResults;
        }

        @NotNull
        public final SeriesResult copy(@NotNull List<Boolean> gameResults) {
            Intrinsics.checkNotNullParameter(gameResults, "gameResults");
            return new SeriesResult(gameResults);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SeriesResult) && Intrinsics.areEqual(this.gameResults, ((SeriesResult) other).gameResults);
        }

        @NotNull
        public final List<Boolean> getGameResults() {
            return this.gameResults;
        }

        public int hashCode() {
            return this.gameResults.hashCode();
        }

        @NotNull
        public String toString() {
            return "SeriesResult(gameResults=" + this.gameResults + ")";
        }
    }
}
