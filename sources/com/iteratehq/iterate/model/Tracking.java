package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xr.c;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/iteratehq/iterate/model/Tracking;", "", "lastUpdated", "", "<init>", "(J)V", "getLastUpdated", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "iterate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Tracking {

    @c("last_updated")
    private final long lastUpdated;

    public Tracking(long j11) {
        this.lastUpdated = j11;
    }

    public static /* synthetic */ Tracking copy$default(Tracking tracking, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = tracking.lastUpdated;
        }
        return tracking.copy(j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    @NotNull
    public final Tracking copy(long lastUpdated) {
        return new Tracking(lastUpdated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Tracking) && this.lastUpdated == ((Tracking) other).lastUpdated;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUpdated);
    }

    @NotNull
    public String toString() {
        return "Tracking(lastUpdated=" + this.lastUpdated + ")";
    }
}
