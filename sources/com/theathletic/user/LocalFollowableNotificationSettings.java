package com.theathletic.user;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.user.i, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/theathletic/user/i;", "", "", "id", "", "notifyStories", "notifyGames", "notifyGamesStart", "<init>", "(Ljava/lang/String;ZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, QueryKeys.SUBDOMAIN, "()Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "db_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalFollowableNotificationSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean notifyStories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean notifyGames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean notifyGamesStart;

    public LocalFollowableNotificationSettings(String id2, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.notifyStories = z11;
        this.notifyGames = z12;
        this.notifyGamesStart = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNotifyGames() {
        return this.notifyGames;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getNotifyGamesStart() {
        return this.notifyGamesStart;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNotifyStories() {
        return this.notifyStories;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalFollowableNotificationSettings)) {
            return false;
        }
        LocalFollowableNotificationSettings localFollowableNotificationSettings = (LocalFollowableNotificationSettings) other;
        return Intrinsics.areEqual(this.id, localFollowableNotificationSettings.id) && this.notifyStories == localFollowableNotificationSettings.notifyStories && this.notifyGames == localFollowableNotificationSettings.notifyGames && this.notifyGamesStart == localFollowableNotificationSettings.notifyGamesStart;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + Boolean.hashCode(this.notifyStories)) * 31) + Boolean.hashCode(this.notifyGames)) * 31) + Boolean.hashCode(this.notifyGamesStart);
    }

    public String toString() {
        return "LocalFollowableNotificationSettings(id=" + this.id + ", notifyStories=" + this.notifyStories + ", notifyGames=" + this.notifyGames + ", notifyGamesStart=" + this.notifyGamesStart + ")";
    }
}
