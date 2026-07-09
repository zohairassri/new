package com.theathletic.gamedetail.boxscore.ui;

import com.theathletic.gamedetail.data.local.GameStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/gamedetail/boxscore/ui/a;", "", "Lcom/theathletic/gamedetail/data/local/GameStatus;", "gameStatus", "", "gameId", "streamingPartner", "", "isStreamingStartViaUser", "", "d2", "(Lcom/theathletic/gamedetail/data/local/GameStatus;Ljava/lang/String;Ljava/lang/String;Z)V", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: com.theathletic.gamedetail.boxscore.ui.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0566a {
    }

    static /* synthetic */ void r(a aVar, GameStatus gameStatus, String str, String str2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackLivePreviewClick");
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        aVar.d2(gameStatus, str, str2, z11);
    }

    void d2(GameStatus gameStatus, String gameId, String streamingPartner, boolean isStreamingStartViaUser);
}
