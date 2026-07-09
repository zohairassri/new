package com.theathletic.analytics.data;

import cf0.a;
import cf0.b;
import com.theathletic.article.component.data.cache.ArticleCacheStrategy;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/theathletic/analytics/data/ClickSource;", "", VideoRepository.XML_ATTR_VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", ArticleCacheStrategy.KEY_FEED, "SEARCH", "SETTINGS", "SAVED_STORIES", "ARTICLE", "RELATED", "GAME_DETAIL", "EVERGREEN", "FRONTPAGE", "LIVE_ROOM", "LIVEBLOG_SPONSORED", "PAYWALL", "HEADLINE", "PODCAST_PAYWALL", "PODCAST_STORY", "DEEPLINK", "DEEPLINK_USER_SHARED", "DEEPLINK_EMPLOYEE_SHARED", "PUSH_NOTIFICATION", "REFERRED", "NEWS", "SPOTLIGHT", "LIVE_BLOG", "UNKNOWN", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClickSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ClickSource[] $VALUES;

    @NotNull
    private final String value;
    public static final ClickSource FEED = new ClickSource(ArticleCacheStrategy.KEY_FEED, 0, "Feed");
    public static final ClickSource SEARCH = new ClickSource("SEARCH", 1, "Search");
    public static final ClickSource SETTINGS = new ClickSource("SETTINGS", 2, "Settings");
    public static final ClickSource SAVED_STORIES = new ClickSource("SAVED_STORIES", 3, "Saved Stories");
    public static final ClickSource ARTICLE = new ClickSource("ARTICLE", 4, "Article");
    public static final ClickSource RELATED = new ClickSource("RELATED", 5, "Related");
    public static final ClickSource GAME_DETAIL = new ClickSource("GAME_DETAIL", 6, "Game detail");
    public static final ClickSource EVERGREEN = new ClickSource("EVERGREEN", 7, "Evergreen");
    public static final ClickSource FRONTPAGE = new ClickSource("FRONTPAGE", 8, "Frontpage");
    public static final ClickSource LIVE_ROOM = new ClickSource("LIVE_ROOM", 9, "Live Room");
    public static final ClickSource LIVEBLOG_SPONSORED = new ClickSource("LIVEBLOG_SPONSORED", 10, "liveblog_sponsored");
    public static final ClickSource PAYWALL = new ClickSource("PAYWALL", 11, "Paywall");
    public static final ClickSource HEADLINE = new ClickSource("HEADLINE", 12, "Headline");
    public static final ClickSource PODCAST_PAYWALL = new ClickSource("PODCAST_PAYWALL", 13, "Podcast Paywall");
    public static final ClickSource PODCAST_STORY = new ClickSource("PODCAST_STORY", 14, "Podcast Story");
    public static final ClickSource DEEPLINK = new ClickSource("DEEPLINK", 15, "Deeplink");
    public static final ClickSource DEEPLINK_USER_SHARED = new ClickSource("DEEPLINK_USER_SHARED", 16, "user_shared_article");
    public static final ClickSource DEEPLINK_EMPLOYEE_SHARED = new ClickSource("DEEPLINK_EMPLOYEE_SHARED", 17, "emp_shared_article");
    public static final ClickSource PUSH_NOTIFICATION = new ClickSource("PUSH_NOTIFICATION", 18, "Push Notification");
    public static final ClickSource REFERRED = new ClickSource("REFERRED", 19, "Referred");
    public static final ClickSource NEWS = new ClickSource("NEWS", 20, "News");
    public static final ClickSource SPOTLIGHT = new ClickSource("SPOTLIGHT", 21, "Spotlight");
    public static final ClickSource LIVE_BLOG = new ClickSource("LIVE_BLOG", 22, "Live Blog");
    public static final ClickSource UNKNOWN = new ClickSource("UNKNOWN", 23, "Unknown");

    private static final /* synthetic */ ClickSource[] $values() {
        return new ClickSource[]{FEED, SEARCH, SETTINGS, SAVED_STORIES, ARTICLE, RELATED, GAME_DETAIL, EVERGREEN, FRONTPAGE, LIVE_ROOM, LIVEBLOG_SPONSORED, PAYWALL, HEADLINE, PODCAST_PAYWALL, PODCAST_STORY, DEEPLINK, DEEPLINK_USER_SHARED, DEEPLINK_EMPLOYEE_SHARED, PUSH_NOTIFICATION, REFERRED, NEWS, SPOTLIGHT, LIVE_BLOG, UNKNOWN};
    }

    static {
        ClickSource[] clickSourceArr$values = $values();
        $VALUES = clickSourceArr$values;
        $ENTRIES = b.a(clickSourceArr$values);
    }

    private ClickSource(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ClickSource valueOf(String str) {
        return (ClickSource) Enum.valueOf(ClickSource.class, str);
    }

    public static ClickSource[] values() {
        return (ClickSource[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
