package com.theathletic.article.component.data.cache;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TAG", "", "CACHE_FEED_WORKER", "CACHE_SAVED_STORY_WORKER", "CACHE_SAVED_STORIES_WORKER", "CACHE_SAVED_STORIES_ASSETS_WORKER", "KEY_ARTICLE_URLS", "KEY_STRATEGY_TYPE", "KEY_SHOULD_CACHE_ASSETS", "KEY_ARTICLES_LIMIT", "CHUNK_INDEX", "TOTAL_CHUNKS", "DEFAULT_CACHE_LIMIT", "", "MAX_URLS_PER_WORK", "component_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CacheWebArticlesSchedulerKt {

    @NotNull
    private static final String CACHE_FEED_WORKER = "cache_feed_articles_worker";

    @NotNull
    private static final String CACHE_SAVED_STORIES_ASSETS_WORKER = "cache_saved_stories_assets_worker";

    @NotNull
    private static final String CACHE_SAVED_STORIES_WORKER = "cache_saved_stories_worker";

    @NotNull
    private static final String CACHE_SAVED_STORY_WORKER = "cache_saved_story_worker";

    @NotNull
    private static final String CHUNK_INDEX = "chunk_index";
    private static final int DEFAULT_CACHE_LIMIT = 15;

    @NotNull
    private static final String KEY_ARTICLES_LIMIT = "articles_limit";

    @NotNull
    private static final String KEY_ARTICLE_URLS = "article_urls";

    @NotNull
    private static final String KEY_SHOULD_CACHE_ASSETS = "should_cache_assets";

    @NotNull
    private static final String KEY_STRATEGY_TYPE = "cache_strategy_type";
    private static final int MAX_URLS_PER_WORK = 50;

    @NotNull
    private static final String TAG = "CacheWebArticlesWorker";

    @NotNull
    private static final String TOTAL_CHUNKS = "total_chunks";
}
