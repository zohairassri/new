package com.theathletic.pickem.component.data;

import com.amazonaws.services.s3.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmChallengeStepLink;", "", "displayString", "", Constants.URL_ENCODING, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayString", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickEmChallengeStepLink {

    @NotNull
    private final String displayString;

    @NotNull
    private final String url;

    public PickEmChallengeStepLink(@NotNull String displayString, @NotNull String url) {
        Intrinsics.checkNotNullParameter(displayString, "displayString");
        Intrinsics.checkNotNullParameter(url, "url");
        this.displayString = displayString;
        this.url = url;
    }

    public static /* synthetic */ PickEmChallengeStepLink copy$default(PickEmChallengeStepLink pickEmChallengeStepLink, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pickEmChallengeStepLink.displayString;
        }
        if ((i11 & 2) != 0) {
            str2 = pickEmChallengeStepLink.url;
        }
        return pickEmChallengeStepLink.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayString() {
        return this.displayString;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final PickEmChallengeStepLink copy(@NotNull String displayString, @NotNull String url) {
        Intrinsics.checkNotNullParameter(displayString, "displayString");
        Intrinsics.checkNotNullParameter(url, "url");
        return new PickEmChallengeStepLink(displayString, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickEmChallengeStepLink)) {
            return false;
        }
        PickEmChallengeStepLink pickEmChallengeStepLink = (PickEmChallengeStepLink) other;
        return Intrinsics.areEqual(this.displayString, pickEmChallengeStepLink.displayString) && Intrinsics.areEqual(this.url, pickEmChallengeStepLink.url);
    }

    @NotNull
    public final String getDisplayString() {
        return this.displayString;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.displayString.hashCode() * 31) + this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return "PickEmChallengeStepLink(displayString=" + this.displayString + ", url=" + this.url + ")";
    }
}
