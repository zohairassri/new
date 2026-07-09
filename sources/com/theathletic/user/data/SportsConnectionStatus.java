package com.theathletic.user.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/theathletic/user/data/SportsConnectionStatus;", "", "lastCompletedDatetimeSportsConnections", "", "<init>", "(J)V", "getLastCompletedDatetimeSportsConnections", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SportsConnectionStatus {
    private final long lastCompletedDatetimeSportsConnections;

    public SportsConnectionStatus(long j11) {
        this.lastCompletedDatetimeSportsConnections = j11;
    }

    public static /* synthetic */ SportsConnectionStatus copy$default(SportsConnectionStatus sportsConnectionStatus, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = sportsConnectionStatus.lastCompletedDatetimeSportsConnections;
        }
        return sportsConnectionStatus.copy(j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastCompletedDatetimeSportsConnections() {
        return this.lastCompletedDatetimeSportsConnections;
    }

    @NotNull
    public final SportsConnectionStatus copy(long lastCompletedDatetimeSportsConnections) {
        return new SportsConnectionStatus(lastCompletedDatetimeSportsConnections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SportsConnectionStatus) && this.lastCompletedDatetimeSportsConnections == ((SportsConnectionStatus) other).lastCompletedDatetimeSportsConnections;
    }

    public final long getLastCompletedDatetimeSportsConnections() {
        return this.lastCompletedDatetimeSportsConnections;
    }

    public int hashCode() {
        return Long.hashCode(this.lastCompletedDatetimeSportsConnections);
    }

    @NotNull
    public String toString() {
        return "SportsConnectionStatus(lastCompletedDatetimeSportsConnections=" + this.lastCompletedDatetimeSportsConnections + ")";
    }
}
