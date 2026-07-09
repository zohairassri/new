package com.theathletic.article.component.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\u008d\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001J\u0013\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\bHÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010&\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!¨\u00069"}, d2 = {"Lcom/theathletic/article/component/data/ArticleComment;", "", "id", "", "parentId", "authorId", "authorName", "authorUserLevel", "", "avatarUrl", "comment", "commentLink", "commentedAt", "", "isLocked", "", "isAuthor", "likesCount", "totalReplies", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZII)V", "getId", "()Ljava/lang/String;", "getParentId", "getAuthorId", "getAuthorName", "getAuthorUserLevel", "()I", "getAvatarUrl", "getComment", "getCommentLink", "getCommentedAt", "()J", "()Z", "getLikesCount", "setLikesCount", "(I)V", "getTotalReplies", "isStaff", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ArticleComment {

    @NotNull
    private final String authorId;

    @NotNull
    private final String authorName;
    private final int authorUserLevel;
    private final String avatarUrl;

    @NotNull
    private final String comment;

    @NotNull
    private final String commentLink;
    private final long commentedAt;

    @NotNull
    private final String id;
    private final boolean isAuthor;
    private final boolean isLocked;
    private final boolean isStaff;
    private int likesCount;

    @NotNull
    private final String parentId;
    private final int totalReplies;

    public ArticleComment(@NotNull String id2, @NotNull String parentId, @NotNull String authorId, @NotNull String authorName, int i11, String str, @NotNull String comment, @NotNull String commentLink, long j11, boolean z11, boolean z12, int i12, int i13) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(commentLink, "commentLink");
        this.id = id2;
        this.parentId = parentId;
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorUserLevel = i11;
        this.avatarUrl = str;
        this.comment = comment;
        this.commentLink = commentLink;
        this.commentedAt = j11;
        this.isLocked = z11;
        this.isAuthor = z12;
        this.likesCount = i12;
        this.totalReplies = i13;
        this.isStaff = i11 > 0;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsAuthor() {
        return this.isAuthor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getLikesCount() {
        return this.likesCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getTotalReplies() {
        return this.totalReplies;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAuthorUserLevel() {
        return this.authorUserLevel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCommentLink() {
        return this.commentLink;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCommentedAt() {
        return this.commentedAt;
    }

    @NotNull
    public final ArticleComment copy(@NotNull String id2, @NotNull String parentId, @NotNull String authorId, @NotNull String authorName, int authorUserLevel, String avatarUrl, @NotNull String comment, @NotNull String commentLink, long commentedAt, boolean isLocked, boolean isAuthor, int likesCount, int totalReplies) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        Intrinsics.checkNotNullParameter(authorName, "authorName");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(commentLink, "commentLink");
        return new ArticleComment(id2, parentId, authorId, authorName, authorUserLevel, avatarUrl, comment, commentLink, commentedAt, isLocked, isAuthor, likesCount, totalReplies);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleComment)) {
            return false;
        }
        ArticleComment articleComment = (ArticleComment) other;
        return Intrinsics.areEqual(this.id, articleComment.id) && Intrinsics.areEqual(this.parentId, articleComment.parentId) && Intrinsics.areEqual(this.authorId, articleComment.authorId) && Intrinsics.areEqual(this.authorName, articleComment.authorName) && this.authorUserLevel == articleComment.authorUserLevel && Intrinsics.areEqual(this.avatarUrl, articleComment.avatarUrl) && Intrinsics.areEqual(this.comment, articleComment.comment) && Intrinsics.areEqual(this.commentLink, articleComment.commentLink) && this.commentedAt == articleComment.commentedAt && this.isLocked == articleComment.isLocked && this.isAuthor == articleComment.isAuthor && this.likesCount == articleComment.likesCount && this.totalReplies == articleComment.totalReplies;
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

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final String getCommentLink() {
        return this.commentLink;
    }

    public final long getCommentedAt() {
        return this.commentedAt;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getLikesCount() {
        return this.likesCount;
    }

    @NotNull
    public final String getParentId() {
        return this.parentId;
    }

    public final int getTotalReplies() {
        return this.totalReplies;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.parentId.hashCode()) * 31) + this.authorId.hashCode()) * 31) + this.authorName.hashCode()) * 31) + Integer.hashCode(this.authorUserLevel)) * 31;
        String str = this.avatarUrl;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.comment.hashCode()) * 31) + this.commentLink.hashCode()) * 31) + Long.hashCode(this.commentedAt)) * 31) + Boolean.hashCode(this.isLocked)) * 31) + Boolean.hashCode(this.isAuthor)) * 31) + Integer.hashCode(this.likesCount)) * 31) + Integer.hashCode(this.totalReplies);
    }

    public final boolean isAuthor() {
        return this.isAuthor;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    /* JADX INFO: renamed from: isStaff, reason: from getter */
    public final boolean getIsStaff() {
        return this.isStaff;
    }

    public final void setLikesCount(int i11) {
        this.likesCount = i11;
    }

    @NotNull
    public String toString() {
        return "ArticleComment(id=" + this.id + ", parentId=" + this.parentId + ", authorId=" + this.authorId + ", authorName=" + this.authorName + ", authorUserLevel=" + this.authorUserLevel + ", avatarUrl=" + this.avatarUrl + ", comment=" + this.comment + ", commentLink=" + this.commentLink + ", commentedAt=" + this.commentedAt + ", isLocked=" + this.isLocked + ", isAuthor=" + this.isAuthor + ", likesCount=" + this.likesCount + ", totalReplies=" + this.totalReplies + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ArticleComment(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, boolean r28, boolean r29, int r30, int r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 0
            r8 = r1
            goto Lb
        L9:
            r8 = r23
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L13
            java.lang.String r1 = ""
            r10 = r1
            goto L15
        L13:
            r10 = r25
        L15:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L1c
            r13 = r2
            goto L1e
        L1c:
            r13 = r28
        L1e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L24
            r14 = r2
            goto L26
        L24:
            r14 = r29
        L26:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2c
            r15 = r2
            goto L2e
        L2c:
            r15 = r30
        L2e:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L45
            r16 = r2
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r24
            r11 = r26
            r2 = r17
            goto L57
        L45:
            r16 = r31
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r24
            r11 = r26
        L57:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theathletic.article.component.data.ArticleComment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, boolean, boolean, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
