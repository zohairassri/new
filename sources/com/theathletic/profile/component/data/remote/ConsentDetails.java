package com.theathletic.profile.component.data.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/theathletic/profile/component/data/remote/ConsentDetails;", "", "isConfirmed", "", "timeStamp", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getTimeStamp", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentDetails {
    public static final int $stable = 0;
    private final boolean isConfirmed;

    @NotNull
    private final String timeStamp;

    public ConsentDetails(boolean z11, @NotNull String timeStamp) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        this.isConfirmed = z11;
        this.timeStamp = timeStamp;
    }

    public static /* synthetic */ ConsentDetails copy$default(ConsentDetails consentDetails, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = consentDetails.isConfirmed;
        }
        if ((i11 & 2) != 0) {
            str = consentDetails.timeStamp;
        }
        return consentDetails.copy(z11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final ConsentDetails copy(boolean isConfirmed, @NotNull String timeStamp) {
        Intrinsics.checkNotNullParameter(timeStamp, "timeStamp");
        return new ConsentDetails(isConfirmed, timeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentDetails)) {
            return false;
        }
        ConsentDetails consentDetails = (ConsentDetails) other;
        return this.isConfirmed == consentDetails.isConfirmed && Intrinsics.areEqual(this.timeStamp, consentDetails.timeStamp);
    }

    @NotNull
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isConfirmed) * 31) + this.timeStamp.hashCode();
    }

    public final boolean isConfirmed() {
        return this.isConfirmed;
    }

    @NotNull
    public String toString() {
        return "ConsentDetails(isConfirmed=" + this.isConfirmed + ", timeStamp=" + this.timeStamp + ")";
    }
}
