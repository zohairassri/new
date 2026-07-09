package a60;

import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"La60/f;", "", "", VideoRepository.XML_ATTR_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "CONTENT_DWELL_TIMEOUT_MILLIS", "ARTICLE_SCROLL_PERCENT_TO_CONSIDER_READ", "PRIVACY_CCPA_SUPPORTED_STATES", "PRIVACY_GDPR_SUPPORTED_COUNTRIES", "FREE_ARTICLES_PER_MONTH_COUNT", "ARTICLE_SUBSCRIBER_SCORE_THRESHOLD", "SLIDE_STORY_SLIDE_DURATION", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {
    private static final /* synthetic */ cf0.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    private final String value;
    public static final f CONTENT_DWELL_TIMEOUT_MILLIS = new f("CONTENT_DWELL_TIMEOUT_MILLIS", 0, "android_content_dwell_timeout_millis");
    public static final f ARTICLE_SCROLL_PERCENT_TO_CONSIDER_READ = new f("ARTICLE_SCROLL_PERCENT_TO_CONSIDER_READ", 1, "article_scroll_percent_to_consider_read");
    public static final f PRIVACY_CCPA_SUPPORTED_STATES = new f("PRIVACY_CCPA_SUPPORTED_STATES", 2, "android_privacy_ccpa_supported_states_release");
    public static final f PRIVACY_GDPR_SUPPORTED_COUNTRIES = new f("PRIVACY_GDPR_SUPPORTED_COUNTRIES", 3, "android_privacy_gdpr_supported_countries_release");
    public static final f FREE_ARTICLES_PER_MONTH_COUNT = new f("FREE_ARTICLES_PER_MONTH_COUNT", 4, "android_free_articles_per_month_count_release");
    public static final f ARTICLE_SUBSCRIBER_SCORE_THRESHOLD = new f("ARTICLE_SUBSCRIBER_SCORE_THRESHOLD", 5, "android_article_subscriber_score_threshold_release");
    public static final f SLIDE_STORY_SLIDE_DURATION = new f("SLIDE_STORY_SLIDE_DURATION", 6, "android_slide_story_slide_duration_release");

    private static final /* synthetic */ f[] $values() {
        return new f[]{CONTENT_DWELL_TIMEOUT_MILLIS, ARTICLE_SCROLL_PERCENT_TO_CONSIDER_READ, PRIVACY_CCPA_SUPPORTED_STATES, PRIVACY_GDPR_SUPPORTED_COUNTRIES, FREE_ARTICLES_PER_MONTH_COUNT, ARTICLE_SUBSCRIBER_SCORE_THRESHOLD, SLIDE_STORY_SLIDE_DURATION};
    }

    static {
        f[] fVarArr$values = $values();
        $VALUES = fVarArr$values;
        $ENTRIES = cf0.b.a(fVarArr$values);
    }

    private f(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static cf0.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
