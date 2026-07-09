package com.theathletic.scores.standings.data.local;

import cf0.a;
import cf0.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/theathletic/scores/standings/data/local/StandingsSegmentType;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYOFF_QUALIFICATION", "PLAY_IN_QUALIFICATION", "PLAYOFF_WILDCARD", "UNKNOWN", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StandingsSegmentType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StandingsSegmentType[] $VALUES;
    public static final StandingsSegmentType PLAYOFF_QUALIFICATION = new StandingsSegmentType("PLAYOFF_QUALIFICATION", 0);
    public static final StandingsSegmentType PLAY_IN_QUALIFICATION = new StandingsSegmentType("PLAY_IN_QUALIFICATION", 1);
    public static final StandingsSegmentType PLAYOFF_WILDCARD = new StandingsSegmentType("PLAYOFF_WILDCARD", 2);
    public static final StandingsSegmentType UNKNOWN = new StandingsSegmentType("UNKNOWN", 3);

    private static final /* synthetic */ StandingsSegmentType[] $values() {
        return new StandingsSegmentType[]{PLAYOFF_QUALIFICATION, PLAY_IN_QUALIFICATION, PLAYOFF_WILDCARD, UNKNOWN};
    }

    static {
        StandingsSegmentType[] standingsSegmentTypeArr$values = $values();
        $VALUES = standingsSegmentTypeArr$values;
        $ENTRIES = b.a(standingsSegmentTypeArr$values);
    }

    private StandingsSegmentType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static StandingsSegmentType valueOf(String str) {
        return (StandingsSegmentType) Enum.valueOf(StandingsSegmentType.class, str);
    }

    public static StandingsSegmentType[] values() {
        return (StandingsSegmentType[]) $VALUES.clone();
    }
}
