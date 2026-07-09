package com.theathletic.twitter.data.local;

import com.amazonaws.services.s3.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/theathletic/twitter/data/local/TwitterUrl;", "", Constants.URL_ENCODING, "", "html", "theme", "authorName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getHtml", "getTheme", "getAuthorName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TwitterUrl {
    private final String authorName;

    @NotNull
    private final String html;

    @NotNull
    private final String theme;

    @NotNull
    private final String url;

    public TwitterUrl(@NotNull String url, @NotNull String html, @NotNull String theme, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.url = url;
        this.html = html;
        this.theme = theme;
        this.authorName = str;
    }

    public static /* synthetic */ TwitterUrl copy$default(TwitterUrl twitterUrl, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = twitterUrl.url;
        }
        if ((i11 & 2) != 0) {
            str2 = twitterUrl.html;
        }
        if ((i11 & 4) != 0) {
            str3 = twitterUrl.theme;
        }
        if ((i11 & 8) != 0) {
            str4 = twitterUrl.authorName;
        }
        return twitterUrl.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    @NotNull
    public final TwitterUrl copy(@NotNull String url, @NotNull String html, @NotNull String theme, String authorName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new TwitterUrl(url, html, theme, authorName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwitterUrl)) {
            return false;
        }
        TwitterUrl twitterUrl = (TwitterUrl) other;
        return Intrinsics.areEqual(this.url, twitterUrl.url) && Intrinsics.areEqual(this.html, twitterUrl.html) && Intrinsics.areEqual(this.theme, twitterUrl.theme) && Intrinsics.areEqual(this.authorName, twitterUrl.authorName);
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    @NotNull
    public final String getHtml() {
        return this.html;
    }

    @NotNull
    public final String getTheme() {
        return this.theme;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((this.url.hashCode() * 31) + this.html.hashCode()) * 31) + this.theme.hashCode()) * 31;
        String str = this.authorName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "TwitterUrl(url=" + this.url + ", html=" + this.html + ", theme=" + this.theme + ", authorName=" + this.authorName + ")";
    }

    public /* synthetic */ TwitterUrl(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? "" : str4);
    }
}
