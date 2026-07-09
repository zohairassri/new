package com.theathletic.scores.component.data.local;

import cf0.a;
import cf0.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/theathletic/scores/component/data/local/ScoresFeedTextType;", "", "<init>", "(Ljava/lang/String;I)V", "DateTime", "Default", "Live", "Situation", "Status", "Unknown", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScoresFeedTextType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ScoresFeedTextType[] $VALUES;
    public static final ScoresFeedTextType DateTime = new ScoresFeedTextType("DateTime", 0);
    public static final ScoresFeedTextType Default = new ScoresFeedTextType("Default", 1);
    public static final ScoresFeedTextType Live = new ScoresFeedTextType("Live", 2);
    public static final ScoresFeedTextType Situation = new ScoresFeedTextType("Situation", 3);
    public static final ScoresFeedTextType Status = new ScoresFeedTextType("Status", 4);
    public static final ScoresFeedTextType Unknown = new ScoresFeedTextType("Unknown", 5);

    private static final /* synthetic */ ScoresFeedTextType[] $values() {
        return new ScoresFeedTextType[]{DateTime, Default, Live, Situation, Status, Unknown};
    }

    static {
        ScoresFeedTextType[] scoresFeedTextTypeArr$values = $values();
        $VALUES = scoresFeedTextTypeArr$values;
        $ENTRIES = b.a(scoresFeedTextTypeArr$values);
    }

    private ScoresFeedTextType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ScoresFeedTextType valueOf(String str) {
        return (ScoresFeedTextType) Enum.valueOf(ScoresFeedTextType.class, str);
    }

    public static ScoresFeedTextType[] values() {
        return (ScoresFeedTextType[]) $VALUES.clone();
    }
}
