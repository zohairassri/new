package com.theathletic.entity.article;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"isArticlePost", "", "Lcom/theathletic/entity/article/HasPostType;", "(Lcom/theathletic/entity/article/HasPostType;)Z", "isDiscussionPost", "isHeadlinePost", "isQAndAPost", "isArticleMicrositePost", "isVideoArticlePost", "entity_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ArticleExtensionsKt {
    public static final boolean isArticleMicrositePost(@NotNull HasPostType hasPostType) {
        Intrinsics.checkNotNullParameter(hasPostType, "<this>");
        Long postTypeId = hasPostType.getPostTypeId();
        return postTypeId != null && postTypeId.longValue() == 41;
    }

    public static final boolean isArticlePost(@NotNull HasPostType hasPostType) {
        Intrinsics.checkNotNullParameter(hasPostType, "<this>");
        Long postTypeId = hasPostType.getPostTypeId();
        return postTypeId != null && postTypeId.longValue() == 1;
    }

    public static final boolean isDiscussionPost(@NotNull HasPostType hasPostType) {
        Intrinsics.checkNotNullParameter(hasPostType, "<this>");
        Long postTypeId = hasPostType.getPostTypeId();
        return postTypeId != null && postTypeId.longValue() == 29;
    }

    public static final boolean isHeadlinePost(@NotNull HasPostType hasPostType) {
        Intrinsics.checkNotNullParameter(hasPostType, "<this>");
        Long postTypeId = hasPostType.getPostTypeId();
        return postTypeId != null && postTypeId.longValue() == 39;
    }

    public static final boolean isQAndAPost(@NotNull HasPostType hasPostType) {
        Intrinsics.checkNotNullParameter(hasPostType, "<this>");
        Long postTypeId = hasPostType.getPostTypeId();
        return postTypeId != null && postTypeId.longValue() == 31;
    }

    public static final boolean isVideoArticlePost(@NotNull HasPostType hasPostType) {
        Intrinsics.checkNotNullParameter(hasPostType, "<this>");
        Long postTypeId = hasPostType.getPostTypeId();
        return postTypeId != null && postTypeId.longValue() == 40;
    }
}
