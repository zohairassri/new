package com.theathletic.comments.component.data.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/theathletic/comments/component/data/remote/QandaComment;", "", "commentId", "", "authorId", "authorName", "authorUserLevel", "", "authorAvatarUrl", "parentCommentId", "parentUserId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommentId", "()Ljava/lang/String;", "getAuthorId", "getAuthorName", "getAuthorUserLevel", "()I", "getAuthorAvatarUrl", "getParentCommentId", "getParentUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QandaComment {

    @NotNull
    private final String authorAvatarUrl;

    @NotNull
    private final String authorId;

    @NotNull
    private final String authorName;
    private final int authorUserLevel;

    @NotNull
    private final String commentId;
    private final String parentCommentId;
    private final String parentUserId;

    public QandaComment(@NotNull String commentId, @NotNull String authorId, @NotNull String authorName, int i11, @NotNull String authorAvatarUrl, String str, String str2) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(authorAvatarUrl, "authorAvatarUrl");
        this.commentId = commentId;
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorUserLevel = i11;
        this.authorAvatarUrl = authorAvatarUrl;
        this.parentCommentId = str;
        this.parentUserId = str2;
    }

    public static /* synthetic */ QandaComment copy$default(QandaComment qandaComment, String str, String str2, String str3, int i11, String str4, String str5, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = qandaComment.commentId;
        }
        if ((i12 & 2) != 0) {
            str2 = qandaComment.authorId;
        }
        if ((i12 & 4) != 0) {
            str3 = qandaComment.authorName;
        }
        if ((i12 & 8) != 0) {
            i11 = qandaComment.authorUserLevel;
        }
        if ((i12 & 16) != 0) {
            str4 = qandaComment.authorAvatarUrl;
        }
        if ((i12 & 32) != 0) {
            str5 = qandaComment.parentCommentId;
        }
        if ((i12 & 64) != 0) {
            str6 = qandaComment.parentUserId;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return qandaComment.copy(str, str2, str10, i11, str9, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCommentId() {
        return this.commentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAuthorUserLevel() {
        return this.authorUserLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAuthorAvatarUrl() {
        return this.authorAvatarUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getParentCommentId() {
        return this.parentCommentId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getParentUserId() {
        return this.parentUserId;
    }

    @NotNull
    public final QandaComment copy(@NotNull String commentId, @NotNull String authorId, @NotNull String authorName, int authorUserLevel, @NotNull String authorAvatarUrl, String parentCommentId, String parentUserId) {
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(authorAvatarUrl, "authorAvatarUrl");
        return new QandaComment(commentId, authorId, authorName, authorUserLevel, authorAvatarUrl, parentCommentId, parentUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QandaComment)) {
            return false;
        }
        QandaComment qandaComment = (QandaComment) other;
        return Intrinsics.areEqual(this.commentId, qandaComment.commentId) && Intrinsics.areEqual(this.authorId, qandaComment.authorId) && Intrinsics.areEqual(this.authorName, qandaComment.authorName) && this.authorUserLevel == qandaComment.authorUserLevel && Intrinsics.areEqual(this.authorAvatarUrl, qandaComment.authorAvatarUrl) && Intrinsics.areEqual(this.parentCommentId, qandaComment.parentCommentId) && Intrinsics.areEqual(this.parentUserId, qandaComment.parentUserId);
    }

    @NotNull
    public final String getAuthorAvatarUrl() {
        return this.authorAvatarUrl;
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }

    @NotNull
    public final String getAuthorName() {
        return this.authorName;
    }

    public final int getAuthorUserLevel() {
        return this.authorUserLevel;
    }

    @NotNull
    public final String getCommentId() {
        return this.commentId;
    }

    public final String getParentCommentId() {
        return this.parentCommentId;
    }

    public final String getParentUserId() {
        return this.parentUserId;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.commentId.hashCode() * 31) + this.authorId.hashCode()) * 31) + this.authorName.hashCode()) * 31) + Integer.hashCode(this.authorUserLevel)) * 31) + this.authorAvatarUrl.hashCode()) * 31;
        String str = this.parentCommentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.parentUserId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QandaComment(commentId=" + this.commentId + ", authorId=" + this.authorId + ", authorName=" + this.authorName + ", authorUserLevel=" + this.authorUserLevel + ", authorAvatarUrl=" + this.authorAvatarUrl + ", parentCommentId=" + this.parentCommentId + ", parentUserId=" + this.parentUserId + ")";
    }
}
