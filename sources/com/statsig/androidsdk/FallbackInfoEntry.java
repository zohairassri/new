package com.statsig.androidsdk;

import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/statsig/androidsdk/FallbackInfoEntry;", "", Constants.URL_ENCODING, "", "previous", "", "expiryTime", "", "(Ljava/lang/String;Ljava/util/List;J)V", "getExpiryTime", "()J", "setExpiryTime", "(J)V", "getPrevious", "()Ljava/util/List;", "setPrevious", "(Ljava/util/List;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "private-android-sdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FallbackInfoEntry {
    private long expiryTime;

    @NotNull
    private List<String> previous;
    private String url;

    public FallbackInfoEntry(String str, @NotNull List<String> previous, long j11) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        this.url = str;
        this.previous = previous;
        this.expiryTime = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FallbackInfoEntry copy$default(FallbackInfoEntry fallbackInfoEntry, String str, List list, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fallbackInfoEntry.url;
        }
        if ((i11 & 2) != 0) {
            list = fallbackInfoEntry.previous;
        }
        if ((i11 & 4) != 0) {
            j11 = fallbackInfoEntry.expiryTime;
        }
        return fallbackInfoEntry.copy(str, list, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final List<String> component2() {
        return this.previous;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getExpiryTime() {
        return this.expiryTime;
    }

    @NotNull
    public final FallbackInfoEntry copy(String url, @NotNull List<String> previous, long expiryTime) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        return new FallbackInfoEntry(url, previous, expiryTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallbackInfoEntry)) {
            return false;
        }
        FallbackInfoEntry fallbackInfoEntry = (FallbackInfoEntry) other;
        return Intrinsics.areEqual(this.url, fallbackInfoEntry.url) && Intrinsics.areEqual(this.previous, fallbackInfoEntry.previous) && this.expiryTime == fallbackInfoEntry.expiryTime;
    }

    public final long getExpiryTime() {
        return this.expiryTime;
    }

    @NotNull
    public final List<String> getPrevious() {
        return this.previous;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.previous.hashCode()) * 31) + Long.hashCode(this.expiryTime);
    }

    public final void setExpiryTime(long j11) {
        this.expiryTime = j11;
    }

    public final void setPrevious(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.previous = list;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "FallbackInfoEntry(url=" + ((Object) this.url) + ", previous=" + this.previous + ", expiryTime=" + this.expiryTime + ')';
    }

    public /* synthetic */ FallbackInfoEntry(String str, List list, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? new ArrayList() : list, j11);
    }
}
