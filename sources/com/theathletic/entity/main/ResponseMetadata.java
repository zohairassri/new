package com.theathletic.entity.main;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/theathletic/entity/main/ResponseMetadata;", "", "lastRefreshed", "", "<init>", "(Ljava/lang/Long;)V", "getLastRefreshed", "()Ljava/lang/Long;", "setLastRefreshed", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/theathletic/entity/main/ResponseMetadata;", "equals", "", "other", "hashCode", "", "toString", "", "db_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResponseMetadata {
    private Long lastRefreshed;

    public ResponseMetadata(Long l11) {
        this.lastRefreshed = l11;
    }

    public static /* synthetic */ ResponseMetadata copy$default(ResponseMetadata responseMetadata, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = responseMetadata.lastRefreshed;
        }
        return responseMetadata.copy(l11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getLastRefreshed() {
        return this.lastRefreshed;
    }

    @NotNull
    public final ResponseMetadata copy(Long lastRefreshed) {
        return new ResponseMetadata(lastRefreshed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResponseMetadata) && Intrinsics.areEqual(this.lastRefreshed, ((ResponseMetadata) other).lastRefreshed);
    }

    public final Long getLastRefreshed() {
        return this.lastRefreshed;
    }

    public int hashCode() {
        Long l11 = this.lastRefreshed;
        if (l11 == null) {
            return 0;
        }
        return l11.hashCode();
    }

    public final void setLastRefreshed(Long l11) {
        this.lastRefreshed = l11;
    }

    @NotNull
    public String toString() {
        return "ResponseMetadata(lastRefreshed=" + this.lastRefreshed + ")";
    }
}
