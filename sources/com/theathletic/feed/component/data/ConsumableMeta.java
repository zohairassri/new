package com.theathletic.feed.component.data;

import com.theathletic.video.component.data.VideoRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, d2 = {"Lcom/theathletic/feed/component/data/ConsumableMeta;", "", "isLatest", "", "importance", "", "score", "metaScore", "", "Lcom/theathletic/feed/component/data/ConsumableMeta$MetaScore;", "tag", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImportance", "()Ljava/lang/String;", "getScore", "getMetaScore", "()Ljava/util/List;", "getTag", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/theathletic/feed/component/data/ConsumableMeta;", "equals", "other", "hashCode", "", "toString", "MetaScore", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsumableMeta {
    public static final int $stable = 8;

    @NotNull
    private final String importance;
    private final Boolean isLatest;

    @NotNull
    private final List<MetaScore> metaScore;

    @NotNull
    private final String score;

    @NotNull
    private final String tag;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/theathletic/feed/component/data/ConsumableMeta$MetaScore;", "", "label", "", VideoRepository.XML_ATTR_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MetaScore {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        @NotNull
        private final String value;

        public MetaScore(@NotNull String label, @NotNull String value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.label = label;
            this.value = value;
        }

        public static /* synthetic */ MetaScore copy$default(MetaScore metaScore, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = metaScore.label;
            }
            if ((i11 & 2) != 0) {
                str2 = metaScore.value;
            }
            return metaScore.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final MetaScore copy(@NotNull String label, @NotNull String value) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            return new MetaScore(label, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetaScore)) {
                return false;
            }
            MetaScore metaScore = (MetaScore) other;
            return Intrinsics.areEqual(this.label, metaScore.label) && Intrinsics.areEqual(this.value, metaScore.value);
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "MetaScore(label=" + this.label + ", value=" + this.value + ")";
        }
    }

    public ConsumableMeta(Boolean bool, @NotNull String importance, @NotNull String score, @NotNull List<MetaScore> metaScore, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(importance, "importance");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(metaScore, "metaScore");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.isLatest = bool;
        this.importance = importance;
        this.score = score;
        this.metaScore = metaScore;
        this.tag = tag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsumableMeta copy$default(ConsumableMeta consumableMeta, Boolean bool, String str, String str2, List list, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = consumableMeta.isLatest;
        }
        if ((i11 & 2) != 0) {
            str = consumableMeta.importance;
        }
        if ((i11 & 4) != 0) {
            str2 = consumableMeta.score;
        }
        if ((i11 & 8) != 0) {
            list = consumableMeta.metaScore;
        }
        if ((i11 & 16) != 0) {
            str3 = consumableMeta.tag;
        }
        String str4 = str3;
        String str5 = str2;
        return consumableMeta.copy(bool, str, str5, list, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsLatest() {
        return this.isLatest;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImportance() {
        return this.importance;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScore() {
        return this.score;
    }

    @NotNull
    public final List<MetaScore> component4() {
        return this.metaScore;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final ConsumableMeta copy(Boolean isLatest, @NotNull String importance, @NotNull String score, @NotNull List<MetaScore> metaScore, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(importance, "importance");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(metaScore, "metaScore");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new ConsumableMeta(isLatest, importance, score, metaScore, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumableMeta)) {
            return false;
        }
        ConsumableMeta consumableMeta = (ConsumableMeta) other;
        return Intrinsics.areEqual(this.isLatest, consumableMeta.isLatest) && Intrinsics.areEqual(this.importance, consumableMeta.importance) && Intrinsics.areEqual(this.score, consumableMeta.score) && Intrinsics.areEqual(this.metaScore, consumableMeta.metaScore) && Intrinsics.areEqual(this.tag, consumableMeta.tag);
    }

    @NotNull
    public final String getImportance() {
        return this.importance;
    }

    @NotNull
    public final List<MetaScore> getMetaScore() {
        return this.metaScore;
    }

    @NotNull
    public final String getScore() {
        return this.score;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        Boolean bool = this.isLatest;
        return ((((((((bool == null ? 0 : bool.hashCode()) * 31) + this.importance.hashCode()) * 31) + this.score.hashCode()) * 31) + this.metaScore.hashCode()) * 31) + this.tag.hashCode();
    }

    public final Boolean isLatest() {
        return this.isLatest;
    }

    @NotNull
    public String toString() {
        return "ConsumableMeta(isLatest=" + this.isLatest + ", importance=" + this.importance + ", score=" + this.score + ", metaScore=" + this.metaScore + ", tag=" + this.tag + ")";
    }
}
