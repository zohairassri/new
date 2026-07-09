package com.theathletic.gamedetail.data.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/theathletic/gamedetail/data/local/GameArticlesLocalModel;", "", "gameId", "", "articles", "", "Lcom/theathletic/gamedetail/data/local/GameArticlesLocalModel$GameArticle;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getGameId", "()Ljava/lang/String;", "getArticles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "GameArticle", "GameArticleAuthor", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameArticlesLocalModel {

    @NotNull
    private final List<GameArticle> articles;

    @NotNull
    private final String gameId;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\nHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006$"}, d2 = {"Lcom/theathletic/gamedetail/data/local/GameArticlesLocalModel$GameArticle;", "", "id", "", "title", "imageUrl", "authors", "", "Lcom/theathletic/gamedetail/data/local/GameArticlesLocalModel$GameArticleAuthor;", "commentCount", "", "postTypeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getImageUrl", "getAuthors", "()Ljava/util/List;", "getCommentCount", "()I", "getPostTypeId", "isVideoArticle", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GameArticle {

        @NotNull
        private final List<GameArticleAuthor> authors;
        private final int commentCount;

        @NotNull
        private final String id;
        private final String imageUrl;

        @NotNull
        private final String postTypeId;

        @NotNull
        private final String title;

        public GameArticle(@NotNull String id2, @NotNull String title, String str, @NotNull List<GameArticleAuthor> authors, int i11, @NotNull String postTypeId) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(authors, "authors");
            Intrinsics.checkNotNullParameter(postTypeId, "postTypeId");
            this.id = id2;
            this.title = title;
            this.imageUrl = str;
            this.authors = authors;
            this.commentCount = i11;
            this.postTypeId = postTypeId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GameArticle copy$default(GameArticle gameArticle, String str, String str2, String str3, List list, int i11, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = gameArticle.id;
            }
            if ((i12 & 2) != 0) {
                str2 = gameArticle.title;
            }
            if ((i12 & 4) != 0) {
                str3 = gameArticle.imageUrl;
            }
            if ((i12 & 8) != 0) {
                list = gameArticle.authors;
            }
            if ((i12 & 16) != 0) {
                i11 = gameArticle.commentCount;
            }
            if ((i12 & 32) != 0) {
                str4 = gameArticle.postTypeId;
            }
            int i13 = i11;
            String str5 = str4;
            return gameArticle.copy(str, str2, str3, list, i13, str5);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final List<GameArticleAuthor> component4() {
            return this.authors;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getCommentCount() {
            return this.commentCount;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPostTypeId() {
            return this.postTypeId;
        }

        @NotNull
        public final GameArticle copy(@NotNull String id2, @NotNull String title, String imageUrl, @NotNull List<GameArticleAuthor> authors, int commentCount, @NotNull String postTypeId) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(authors, "authors");
            Intrinsics.checkNotNullParameter(postTypeId, "postTypeId");
            return new GameArticle(id2, title, imageUrl, authors, commentCount, postTypeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GameArticle)) {
                return false;
            }
            GameArticle gameArticle = (GameArticle) other;
            return Intrinsics.areEqual(this.id, gameArticle.id) && Intrinsics.areEqual(this.title, gameArticle.title) && Intrinsics.areEqual(this.imageUrl, gameArticle.imageUrl) && Intrinsics.areEqual(this.authors, gameArticle.authors) && this.commentCount == gameArticle.commentCount && Intrinsics.areEqual(this.postTypeId, gameArticle.postTypeId);
        }

        @NotNull
        public final List<GameArticleAuthor> getAuthors() {
            return this.authors;
        }

        public final int getCommentCount() {
            return this.commentCount;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final String getPostTypeId() {
            return this.postTypeId;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.imageUrl;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.authors.hashCode()) * 31) + Integer.hashCode(this.commentCount)) * 31) + this.postTypeId.hashCode();
        }

        public final boolean isVideoArticle() {
            return Intrinsics.areEqual(this.postTypeId, "40");
        }

        @NotNull
        public String toString() {
            return "GameArticle(id=" + this.id + ", title=" + this.title + ", imageUrl=" + this.imageUrl + ", authors=" + this.authors + ", commentCount=" + this.commentCount + ", postTypeId=" + this.postTypeId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/theathletic/gamedetail/data/local/GameArticlesLocalModel$GameArticleAuthor;", "", "name", "", "displayOrder", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getDisplayOrder", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GameArticleAuthor {
        private final int displayOrder;

        @NotNull
        private final String name;

        public GameArticleAuthor(@NotNull String name, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.displayOrder = i11;
        }

        public static /* synthetic */ GameArticleAuthor copy$default(GameArticleAuthor gameArticleAuthor, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = gameArticleAuthor.name;
            }
            if ((i12 & 2) != 0) {
                i11 = gameArticleAuthor.displayOrder;
            }
            return gameArticleAuthor.copy(str, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDisplayOrder() {
            return this.displayOrder;
        }

        @NotNull
        public final GameArticleAuthor copy(@NotNull String name, int displayOrder) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new GameArticleAuthor(name, displayOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GameArticleAuthor)) {
                return false;
            }
            GameArticleAuthor gameArticleAuthor = (GameArticleAuthor) other;
            return Intrinsics.areEqual(this.name, gameArticleAuthor.name) && this.displayOrder == gameArticleAuthor.displayOrder;
        }

        public final int getDisplayOrder() {
            return this.displayOrder;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.displayOrder);
        }

        @NotNull
        public String toString() {
            return "GameArticleAuthor(name=" + this.name + ", displayOrder=" + this.displayOrder + ")";
        }
    }

    public GameArticlesLocalModel(@NotNull String gameId, @NotNull List<GameArticle> articles) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(articles, "articles");
        this.gameId = gameId;
        this.articles = articles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameArticlesLocalModel copy$default(GameArticlesLocalModel gameArticlesLocalModel, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gameArticlesLocalModel.gameId;
        }
        if ((i11 & 2) != 0) {
            list = gameArticlesLocalModel.articles;
        }
        return gameArticlesLocalModel.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    @NotNull
    public final List<GameArticle> component2() {
        return this.articles;
    }

    @NotNull
    public final GameArticlesLocalModel copy(@NotNull String gameId, @NotNull List<GameArticle> articles) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Intrinsics.checkNotNullParameter(articles, "articles");
        return new GameArticlesLocalModel(gameId, articles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameArticlesLocalModel)) {
            return false;
        }
        GameArticlesLocalModel gameArticlesLocalModel = (GameArticlesLocalModel) other;
        return Intrinsics.areEqual(this.gameId, gameArticlesLocalModel.gameId) && Intrinsics.areEqual(this.articles, gameArticlesLocalModel.articles);
    }

    @NotNull
    public final List<GameArticle> getArticles() {
        return this.articles;
    }

    @NotNull
    public final String getGameId() {
        return this.gameId;
    }

    public int hashCode() {
        return (this.gameId.hashCode() * 31) + this.articles.hashCode();
    }

    @NotNull
    public String toString() {
        return "GameArticlesLocalModel(gameId=" + this.gameId + ", articles=" + this.articles + ")";
    }
}
