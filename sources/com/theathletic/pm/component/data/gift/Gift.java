package com.theathletic.pm.component.data.gift;

import com.amazonaws.services.s3.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/theathletic/share/component/data/gift/Gift;", "", Constants.URL_ENCODING, "", "remaining", "", "<init>", "(Ljava/lang/String;I)V", "getUrl", "()Ljava/lang/String;", "getRemaining", "()I", "giftsThisMonth", "getGiftsThisMonth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Gift {
    public static final int MONTHLY_GIFTS = 10;
    private final int giftsThisMonth;
    private final int remaining;

    @NotNull
    private final String url;

    public Gift(@NotNull String url, int i11) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.remaining = i11;
        this.giftsThisMonth = 10 - i11;
    }

    public static /* synthetic */ Gift copy$default(Gift gift, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gift.url;
        }
        if ((i12 & 2) != 0) {
            i11 = gift.remaining;
        }
        return gift.copy(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRemaining() {
        return this.remaining;
    }

    @NotNull
    public final Gift copy(@NotNull String url, int remaining) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new Gift(url, remaining);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Gift)) {
            return false;
        }
        Gift gift = (Gift) other;
        return Intrinsics.areEqual(this.url, gift.url) && this.remaining == gift.remaining;
    }

    public final int getGiftsThisMonth() {
        return this.giftsThisMonth;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + Integer.hashCode(this.remaining);
    }

    @NotNull
    public String toString() {
        return "Gift(url=" + this.url + ", remaining=" + this.remaining + ")";
    }
}
