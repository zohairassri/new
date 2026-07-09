package com.theathletic.notificationcenter.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006."}, d2 = {"Lcom/theathletic/notificationcenter/data/NotificationHistoryItem;", "", "id", "", "notificationId", "", "title", "", "body", "imageUrl", "deepLinkUrl", "source", "messageId", "isRead", "", "receivedAtMillis", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getId", "()J", "getNotificationId", "()I", "getTitle", "()Ljava/lang/String;", "getBody", "getImageUrl", "getDeepLinkUrl", "getSource", "getMessageId", "()Z", "getReceivedAtMillis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationHistoryItem {

    @NotNull
    private final String body;
    private final String deepLinkUrl;
    private final long id;
    private final String imageUrl;
    private final boolean isRead;
    private final String messageId;
    private final int notificationId;
    private final long receivedAtMillis;

    @NotNull
    private final String source;

    @NotNull
    private final String title;

    public NotificationHistoryItem(long j11, int i11, @NotNull String title, @NotNull String body, String str, String str2, @NotNull String source, String str3, boolean z11, long j12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = j11;
        this.notificationId = i11;
        this.title = title;
        this.body = body;
        this.imageUrl = str;
        this.deepLinkUrl = str2;
        this.source = source;
        this.messageId = str3;
        this.isRead = z11;
        this.receivedAtMillis = j12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getReceivedAtMillis() {
        return this.receivedAtMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNotificationId() {
        return this.notificationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    @NotNull
    public final NotificationHistoryItem copy(long id2, int notificationId, @NotNull String title, @NotNull String body, String imageUrl, String deepLinkUrl, @NotNull String source, String messageId, boolean isRead, long receivedAtMillis) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(source, "source");
        return new NotificationHistoryItem(id2, notificationId, title, body, imageUrl, deepLinkUrl, source, messageId, isRead, receivedAtMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationHistoryItem)) {
            return false;
        }
        NotificationHistoryItem notificationHistoryItem = (NotificationHistoryItem) other;
        return this.id == notificationHistoryItem.id && this.notificationId == notificationHistoryItem.notificationId && Intrinsics.areEqual(this.title, notificationHistoryItem.title) && Intrinsics.areEqual(this.body, notificationHistoryItem.body) && Intrinsics.areEqual(this.imageUrl, notificationHistoryItem.imageUrl) && Intrinsics.areEqual(this.deepLinkUrl, notificationHistoryItem.deepLinkUrl) && Intrinsics.areEqual(this.source, notificationHistoryItem.source) && Intrinsics.areEqual(this.messageId, notificationHistoryItem.messageId) && this.isRead == notificationHistoryItem.isRead && this.receivedAtMillis == notificationHistoryItem.receivedAtMillis;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final long getReceivedAtMillis() {
        return this.receivedAtMillis;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.notificationId)) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deepLinkUrl;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.source.hashCode()) * 31;
        String str3 = this.messageId;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRead)) * 31) + Long.hashCode(this.receivedAtMillis);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public String toString() {
        return "NotificationHistoryItem(id=" + this.id + ", notificationId=" + this.notificationId + ", title=" + this.title + ", body=" + this.body + ", imageUrl=" + this.imageUrl + ", deepLinkUrl=" + this.deepLinkUrl + ", source=" + this.source + ", messageId=" + this.messageId + ", isRead=" + this.isRead + ", receivedAtMillis=" + this.receivedAtMillis + ")";
    }

    public /* synthetic */ NotificationHistoryItem(long j11, int i11, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, long j12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j11, i11, str, str2, str3, str4, str5, str6, z11, j12);
    }
}
