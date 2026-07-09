package com.theathletic.gamedetail.data.local;

import cf0.a;
import cf0.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/theathletic/gamedetail/data/local/GameStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CANCELED", "FINAL", "IN_PROGRESS", "IF_NECESSARY", "POSTPONED", "SCHEDULED", "SUSPENDED", "DELAYED", "UNKNOWN", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GameStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GameStatus[] $VALUES;
    public static final GameStatus CANCELED = new GameStatus("CANCELED", 0);
    public static final GameStatus FINAL = new GameStatus("FINAL", 1);
    public static final GameStatus IN_PROGRESS = new GameStatus("IN_PROGRESS", 2);
    public static final GameStatus IF_NECESSARY = new GameStatus("IF_NECESSARY", 3);
    public static final GameStatus POSTPONED = new GameStatus("POSTPONED", 4);
    public static final GameStatus SCHEDULED = new GameStatus("SCHEDULED", 5);
    public static final GameStatus SUSPENDED = new GameStatus("SUSPENDED", 6);
    public static final GameStatus DELAYED = new GameStatus("DELAYED", 7);
    public static final GameStatus UNKNOWN = new GameStatus("UNKNOWN", 8);

    private static final /* synthetic */ GameStatus[] $values() {
        return new GameStatus[]{CANCELED, FINAL, IN_PROGRESS, IF_NECESSARY, POSTPONED, SCHEDULED, SUSPENDED, DELAYED, UNKNOWN};
    }

    static {
        GameStatus[] gameStatusArr$values = $values();
        $VALUES = gameStatusArr$values;
        $ENTRIES = b.a(gameStatusArr$values);
    }

    private GameStatus(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static GameStatus valueOf(String str) {
        return (GameStatus) Enum.valueOf(GameStatus.class, str);
    }

    public static GameStatus[] values() {
        return (GameStatus[]) $VALUES.clone();
    }
}
