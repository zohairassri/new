package com.theathletic.pickem.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmSelection;", "", "gameId", "", "teamOnePercentage", "", "teamTwoPercentage", "drawPercentage", "totalPicks", "", "<init>", "(Ljava/lang/String;FFLjava/lang/Float;I)V", "getGameId", "()Ljava/lang/String;", "getTeamOnePercentage", "()F", "getTeamTwoPercentage", "getDrawPercentage", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTotalPicks", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;FFLjava/lang/Float;I)Lcom/theathletic/pickem/component/data/PickEmSelection;", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickEmSelection {
    private final Float drawPercentage;

    @NotNull
    private final String gameId;
    private final float teamOnePercentage;
    private final float teamTwoPercentage;
    private final int totalPicks;

    public PickEmSelection(@NotNull String gameId, float f11, float f12, Float f13, int i11) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        this.gameId = gameId;
        this.teamOnePercentage = f11;
        this.teamTwoPercentage = f12;
        this.drawPercentage = f13;
        this.totalPicks = i11;
    }

    public static /* synthetic */ PickEmSelection copy$default(PickEmSelection pickEmSelection, String str, float f11, float f12, Float f13, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = pickEmSelection.gameId;
        }
        if ((i12 & 2) != 0) {
            f11 = pickEmSelection.teamOnePercentage;
        }
        if ((i12 & 4) != 0) {
            f12 = pickEmSelection.teamTwoPercentage;
        }
        if ((i12 & 8) != 0) {
            f13 = pickEmSelection.drawPercentage;
        }
        if ((i12 & 16) != 0) {
            i11 = pickEmSelection.totalPicks;
        }
        int i13 = i11;
        float f14 = f12;
        return pickEmSelection.copy(str, f11, f14, f13, i13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTeamOnePercentage() {
        return this.teamOnePercentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTeamTwoPercentage() {
        return this.teamTwoPercentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getDrawPercentage() {
        return this.drawPercentage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalPicks() {
        return this.totalPicks;
    }

    @NotNull
    public final PickEmSelection copy(@NotNull String gameId, float teamOnePercentage, float teamTwoPercentage, Float drawPercentage, int totalPicks) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        return new PickEmSelection(gameId, teamOnePercentage, teamTwoPercentage, drawPercentage, totalPicks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickEmSelection)) {
            return false;
        }
        PickEmSelection pickEmSelection = (PickEmSelection) other;
        return Intrinsics.areEqual(this.gameId, pickEmSelection.gameId) && Float.compare(this.teamOnePercentage, pickEmSelection.teamOnePercentage) == 0 && Float.compare(this.teamTwoPercentage, pickEmSelection.teamTwoPercentage) == 0 && Intrinsics.areEqual((Object) this.drawPercentage, (Object) pickEmSelection.drawPercentage) && this.totalPicks == pickEmSelection.totalPicks;
    }

    public final Float getDrawPercentage() {
        return this.drawPercentage;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    public final float getTeamOnePercentage() {
        return this.teamOnePercentage;
    }

    public final float getTeamTwoPercentage() {
        return this.teamTwoPercentage;
    }

    public final int getTotalPicks() {
        return this.totalPicks;
    }

    public int hashCode() {
        int iHashCode = ((((this.gameId.hashCode() * 31) + Float.hashCode(this.teamOnePercentage)) * 31) + Float.hashCode(this.teamTwoPercentage)) * 31;
        Float f11 = this.drawPercentage;
        return ((iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31) + Integer.hashCode(this.totalPicks);
    }

    @NotNull
    public String toString() {
        return "PickEmSelection(gameId=" + this.gameId + ", teamOnePercentage=" + this.teamOnePercentage + ", teamTwoPercentage=" + this.teamTwoPercentage + ", drawPercentage=" + this.drawPercentage + ", totalPicks=" + this.totalPicks + ")";
    }
}
