package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/nytimes/android/subauth/core/purr/model/CurrentTCFNoticeData;", "", "acceptAllTCFString", "", "rejectAllTCFString", "currentNoticeVersionHash", "vendorCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAcceptAllTCFString", "()Ljava/lang/String;", "getRejectAllTCFString", "getCurrentNoticeVersionHash", "getVendorCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "subauth-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrentTCFNoticeData {

    @NotNull
    private final String acceptAllTCFString;

    @NotNull
    private final String currentNoticeVersionHash;

    @NotNull
    private final String rejectAllTCFString;
    private final int vendorCount;

    public CurrentTCFNoticeData(@NotNull String acceptAllTCFString, @NotNull String rejectAllTCFString, @NotNull String currentNoticeVersionHash, int i11) {
        Intrinsics.checkNotNullParameter(acceptAllTCFString, "acceptAllTCFString");
        Intrinsics.checkNotNullParameter(rejectAllTCFString, "rejectAllTCFString");
        Intrinsics.checkNotNullParameter(currentNoticeVersionHash, "currentNoticeVersionHash");
        this.acceptAllTCFString = acceptAllTCFString;
        this.rejectAllTCFString = rejectAllTCFString;
        this.currentNoticeVersionHash = currentNoticeVersionHash;
        this.vendorCount = i11;
    }

    public static /* synthetic */ CurrentTCFNoticeData copy$default(CurrentTCFNoticeData currentTCFNoticeData, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = currentTCFNoticeData.acceptAllTCFString;
        }
        if ((i12 & 2) != 0) {
            str2 = currentTCFNoticeData.rejectAllTCFString;
        }
        if ((i12 & 4) != 0) {
            str3 = currentTCFNoticeData.currentNoticeVersionHash;
        }
        if ((i12 & 8) != 0) {
            i11 = currentTCFNoticeData.vendorCount;
        }
        return currentTCFNoticeData.copy(str, str2, str3, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAcceptAllTCFString() {
        return this.acceptAllTCFString;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRejectAllTCFString() {
        return this.rejectAllTCFString;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentNoticeVersionHash() {
        return this.currentNoticeVersionHash;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVendorCount() {
        return this.vendorCount;
    }

    @NotNull
    public final CurrentTCFNoticeData copy(@NotNull String acceptAllTCFString, @NotNull String rejectAllTCFString, @NotNull String currentNoticeVersionHash, int vendorCount) {
        Intrinsics.checkNotNullParameter(acceptAllTCFString, "acceptAllTCFString");
        Intrinsics.checkNotNullParameter(rejectAllTCFString, "rejectAllTCFString");
        Intrinsics.checkNotNullParameter(currentNoticeVersionHash, "currentNoticeVersionHash");
        return new CurrentTCFNoticeData(acceptAllTCFString, rejectAllTCFString, currentNoticeVersionHash, vendorCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentTCFNoticeData)) {
            return false;
        }
        CurrentTCFNoticeData currentTCFNoticeData = (CurrentTCFNoticeData) other;
        return Intrinsics.areEqual(this.acceptAllTCFString, currentTCFNoticeData.acceptAllTCFString) && Intrinsics.areEqual(this.rejectAllTCFString, currentTCFNoticeData.rejectAllTCFString) && Intrinsics.areEqual(this.currentNoticeVersionHash, currentTCFNoticeData.currentNoticeVersionHash) && this.vendorCount == currentTCFNoticeData.vendorCount;
    }

    @NotNull
    public final String getAcceptAllTCFString() {
        return this.acceptAllTCFString;
    }

    @NotNull
    public final String getCurrentNoticeVersionHash() {
        return this.currentNoticeVersionHash;
    }

    @NotNull
    public final String getRejectAllTCFString() {
        return this.rejectAllTCFString;
    }

    public final int getVendorCount() {
        return this.vendorCount;
    }

    public int hashCode() {
        return (((((this.acceptAllTCFString.hashCode() * 31) + this.rejectAllTCFString.hashCode()) * 31) + this.currentNoticeVersionHash.hashCode()) * 31) + Integer.hashCode(this.vendorCount);
    }

    @NotNull
    public String toString() {
        return "CurrentTCFNoticeData(acceptAllTCFString=" + this.acceptAllTCFString + ", rejectAllTCFString=" + this.rejectAllTCFString + ", currentNoticeVersionHash=" + this.currentNoticeVersionHash + ", vendorCount=" + this.vendorCount + ")";
    }
}
