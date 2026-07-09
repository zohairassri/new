package com.theathletic.scores.data;

import com.theathletic.gamedetail.data.local.GameStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/scores/data/Plays;", "", "id", "", "getId", "()Ljava/lang/String;", "status", "Lcom/theathletic/gamedetail/data/local/GameStatus;", "getStatus", "()Lcom/theathletic/gamedetail/data/local/GameStatus;", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Plays {
    @NotNull
    String getId();

    @NotNull
    GameStatus getStatus();
}
