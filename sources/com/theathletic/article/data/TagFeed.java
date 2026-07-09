package com.theathletic.article.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/theathletic/article/data/TagFeed;", "", "id", "", "title", "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TagFeed {
    private final long id;

    @NotNull
    private final String title;

    public TagFeed(long j11, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
    }

    public static /* synthetic */ TagFeed copy$default(TagFeed tagFeed, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = tagFeed.id;
        }
        if ((i11 & 2) != 0) {
            str = tagFeed.title;
        }
        return tagFeed.copy(j11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final TagFeed copy(long id2, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TagFeed(id2, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagFeed)) {
            return false;
        }
        TagFeed tagFeed = (TagFeed) other;
        return this.id == tagFeed.id && Intrinsics.areEqual(this.title, tagFeed.title);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.title.hashCode();
    }

    @NotNull
    public String toString() {
        return "TagFeed(id=" + this.id + ", title=" + this.title + ")";
    }
}
