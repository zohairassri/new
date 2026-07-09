package com.theathletic.author.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/theathletic/author/component/data/SocialHandle;", "", "threads", "", "bluesky", "twitter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getThreads", "()Ljava/lang/String;", "getBluesky", "getTwitter", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SocialHandle {
    private final String bluesky;
    private final String threads;
    private final String twitter;

    public SocialHandle(String str, String str2, String str3) {
        this.threads = str;
        this.bluesky = str2;
        this.twitter = str3;
    }

    public static /* synthetic */ SocialHandle copy$default(SocialHandle socialHandle, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = socialHandle.threads;
        }
        if ((i11 & 2) != 0) {
            str2 = socialHandle.bluesky;
        }
        if ((i11 & 4) != 0) {
            str3 = socialHandle.twitter;
        }
        return socialHandle.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getThreads() {
        return this.threads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBluesky() {
        return this.bluesky;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTwitter() {
        return this.twitter;
    }

    @NotNull
    public final SocialHandle copy(String threads, String bluesky, String twitter) {
        return new SocialHandle(threads, bluesky, twitter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialHandle)) {
            return false;
        }
        SocialHandle socialHandle = (SocialHandle) other;
        return Intrinsics.areEqual(this.threads, socialHandle.threads) && Intrinsics.areEqual(this.bluesky, socialHandle.bluesky) && Intrinsics.areEqual(this.twitter, socialHandle.twitter);
    }

    public final String getBluesky() {
        return this.bluesky;
    }

    public final String getThreads() {
        return this.threads;
    }

    public final String getTwitter() {
        return this.twitter;
    }

    public int hashCode() {
        String str = this.threads;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bluesky;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.twitter;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SocialHandle(threads=" + this.threads + ", bluesky=" + this.bluesky + ", twitter=" + this.twitter + ")";
    }
}
