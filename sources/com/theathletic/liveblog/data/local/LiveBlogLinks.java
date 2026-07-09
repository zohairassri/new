package com.theathletic.liveblog.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/theathletic/liveblog/data/local/LiveBlogLinks;", "", "id", "", "title", "permalink", "linkForEmbed", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getPermalink", "getLinkForEmbed", "getImageUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LiveBlogLinks {

    @NotNull
    private final String id;
    private final String imageUrl;

    @NotNull
    private final String linkForEmbed;

    @NotNull
    private final String permalink;

    @NotNull
    private final String title;

    public LiveBlogLinks(@NotNull String id2, @NotNull String title, @NotNull String permalink, @NotNull String linkForEmbed, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(permalink, "permalink");
        Intrinsics.checkNotNullParameter(linkForEmbed, "linkForEmbed");
        this.id = id2;
        this.title = title;
        this.permalink = permalink;
        this.linkForEmbed = linkForEmbed;
        this.imageUrl = str;
    }

    public static /* synthetic */ LiveBlogLinks copy$default(LiveBlogLinks liveBlogLinks, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = liveBlogLinks.id;
        }
        if ((i11 & 2) != 0) {
            str2 = liveBlogLinks.title;
        }
        if ((i11 & 4) != 0) {
            str3 = liveBlogLinks.permalink;
        }
        if ((i11 & 8) != 0) {
            str4 = liveBlogLinks.linkForEmbed;
        }
        if ((i11 & 16) != 0) {
            str5 = liveBlogLinks.imageUrl;
        }
        String str6 = str5;
        String str7 = str3;
        return liveBlogLinks.copy(str, str2, str7, str4, str6);
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

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPermalink() {
        return this.permalink;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLinkForEmbed() {
        return this.linkForEmbed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final LiveBlogLinks copy(@NotNull String id2, @NotNull String title, @NotNull String permalink, @NotNull String linkForEmbed, String imageUrl) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(permalink, "permalink");
        Intrinsics.checkNotNullParameter(linkForEmbed, "linkForEmbed");
        return new LiveBlogLinks(id2, title, permalink, linkForEmbed, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveBlogLinks)) {
            return false;
        }
        LiveBlogLinks liveBlogLinks = (LiveBlogLinks) other;
        return Intrinsics.areEqual(this.id, liveBlogLinks.id) && Intrinsics.areEqual(this.title, liveBlogLinks.title) && Intrinsics.areEqual(this.permalink, liveBlogLinks.permalink) && Intrinsics.areEqual(this.linkForEmbed, liveBlogLinks.linkForEmbed) && Intrinsics.areEqual(this.imageUrl, liveBlogLinks.imageUrl);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getLinkForEmbed() {
        return this.linkForEmbed;
    }

    @NotNull
    public final String getPermalink() {
        return this.permalink;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.permalink.hashCode()) * 31) + this.linkForEmbed.hashCode()) * 31;
        String str = this.imageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "LiveBlogLinks(id=" + this.id + ", title=" + this.title + ", permalink=" + this.permalink + ", linkForEmbed=" + this.linkForEmbed + ", imageUrl=" + this.imageUrl + ")";
    }
}
