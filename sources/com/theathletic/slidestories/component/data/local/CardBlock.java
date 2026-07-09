package com.theathletic.slidestories.component.data.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/theathletic/slidestories/component/data/local/CardBlock;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "TakeawayMessage", "Byline", "CompactByline", "ReadMore", "Lcom/theathletic/slidestories/component/data/local/CardBlock$Byline;", "Lcom/theathletic/slidestories/component/data/local/CardBlock$CompactByline;", "Lcom/theathletic/slidestories/component/data/local/CardBlock$ReadMore;", "Lcom/theathletic/slidestories/component/data/local/CardBlock$TakeawayMessage;", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardBlock {

    @NotNull
    private final String id;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/theathletic/slidestories/component/data/local/CardBlock$Byline;", "Lcom/theathletic/slidestories/component/data/local/CardBlock;", "id", "", "authorImageUrls", "", "byline", "reportingFrom", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAuthorImageUrls", "()Ljava/util/List;", "getByline", "getReportingFrom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Byline extends CardBlock {

        @NotNull
        private final List<String> authorImageUrls;

        @NotNull
        private final String byline;

        @NotNull
        private final String id;
        private final String reportingFrom;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Byline(@NotNull String id2, @NotNull List<String> authorImageUrls, @NotNull String byline, String str) {
            super(id2, null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(authorImageUrls, "authorImageUrls");
            Intrinsics.checkNotNullParameter(byline, "byline");
            this.id = id2;
            this.authorImageUrls = authorImageUrls;
            this.byline = byline;
            this.reportingFrom = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Byline copy$default(Byline byline, String str, List list, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = byline.id;
            }
            if ((i11 & 2) != 0) {
                list = byline.authorImageUrls;
            }
            if ((i11 & 4) != 0) {
                str2 = byline.byline;
            }
            if ((i11 & 8) != 0) {
                str3 = byline.reportingFrom;
            }
            return byline.copy(str, list, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<String> component2() {
            return this.authorImageUrls;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getByline() {
            return this.byline;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReportingFrom() {
            return this.reportingFrom;
        }

        @NotNull
        public final Byline copy(@NotNull String id2, @NotNull List<String> authorImageUrls, @NotNull String byline, String reportingFrom) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(authorImageUrls, "authorImageUrls");
            Intrinsics.checkNotNullParameter(byline, "byline");
            return new Byline(id2, authorImageUrls, byline, reportingFrom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Byline)) {
                return false;
            }
            Byline byline = (Byline) other;
            return Intrinsics.areEqual(this.id, byline.id) && Intrinsics.areEqual(this.authorImageUrls, byline.authorImageUrls) && Intrinsics.areEqual(this.byline, byline.byline) && Intrinsics.areEqual(this.reportingFrom, byline.reportingFrom);
        }

        @NotNull
        public final List<String> getAuthorImageUrls() {
            return this.authorImageUrls;
        }

        @NotNull
        public final String getByline() {
            return this.byline;
        }

        @Override // com.theathletic.slidestories.component.data.local.CardBlock
        @NotNull
        public String getId() {
            return this.id;
        }

        public final String getReportingFrom() {
            return this.reportingFrom;
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.authorImageUrls.hashCode()) * 31) + this.byline.hashCode()) * 31;
            String str = this.reportingFrom;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Byline(id=" + this.id + ", authorImageUrls=" + this.authorImageUrls + ", byline=" + this.byline + ", reportingFrom=" + this.reportingFrom + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/theathletic/slidestories/component/data/local/CardBlock$CompactByline;", "Lcom/theathletic/slidestories/component/data/local/CardBlock;", "id", "", "authorImageUrls", "", "byline", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAuthorImageUrls", "()Ljava/util/List;", "getByline", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompactByline extends CardBlock {

        @NotNull
        private final List<String> authorImageUrls;

        @NotNull
        private final String byline;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompactByline(@NotNull String id2, @NotNull List<String> authorImageUrls, @NotNull String byline) {
            super(id2, null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(authorImageUrls, "authorImageUrls");
            Intrinsics.checkNotNullParameter(byline, "byline");
            this.id = id2;
            this.authorImageUrls = authorImageUrls;
            this.byline = byline;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CompactByline copy$default(CompactByline compactByline, String str, List list, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = compactByline.id;
            }
            if ((i11 & 2) != 0) {
                list = compactByline.authorImageUrls;
            }
            if ((i11 & 4) != 0) {
                str2 = compactByline.byline;
            }
            return compactByline.copy(str, list, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<String> component2() {
            return this.authorImageUrls;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getByline() {
            return this.byline;
        }

        @NotNull
        public final CompactByline copy(@NotNull String id2, @NotNull List<String> authorImageUrls, @NotNull String byline) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(authorImageUrls, "authorImageUrls");
            Intrinsics.checkNotNullParameter(byline, "byline");
            return new CompactByline(id2, authorImageUrls, byline);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompactByline)) {
                return false;
            }
            CompactByline compactByline = (CompactByline) other;
            return Intrinsics.areEqual(this.id, compactByline.id) && Intrinsics.areEqual(this.authorImageUrls, compactByline.authorImageUrls) && Intrinsics.areEqual(this.byline, compactByline.byline);
        }

        @NotNull
        public final List<String> getAuthorImageUrls() {
            return this.authorImageUrls;
        }

        @NotNull
        public final String getByline() {
            return this.byline;
        }

        @Override // com.theathletic.slidestories.component.data.local.CardBlock
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.authorImageUrls.hashCode()) * 31) + this.byline.hashCode();
        }

        @NotNull
        public String toString() {
            return "CompactByline(id=" + this.id + ", authorImageUrls=" + this.authorImageUrls + ", byline=" + this.byline + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/theathletic/slidestories/component/data/local/CardBlock$ReadMore;", "Lcom/theathletic/slidestories/component/data/local/CardBlock;", "id", "", "description", "imageUrl", "permalink", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDescription", "getImageUrl", "getPermalink", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadMore extends CardBlock {

        @NotNull
        private final String description;

        @NotNull
        private final String id;

        @NotNull
        private final String imageUrl;

        @NotNull
        private final String permalink;

        @NotNull
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadMore(@NotNull String id2, @NotNull String description, @NotNull String imageUrl, @NotNull String permalink, @NotNull String title) {
            super(id2, null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(permalink, "permalink");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id2;
            this.description = description;
            this.imageUrl = imageUrl;
            this.permalink = permalink;
            this.title = title;
        }

        public static /* synthetic */ ReadMore copy$default(ReadMore readMore, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = readMore.id;
            }
            if ((i11 & 2) != 0) {
                str2 = readMore.description;
            }
            if ((i11 & 4) != 0) {
                str3 = readMore.imageUrl;
            }
            if ((i11 & 8) != 0) {
                str4 = readMore.permalink;
            }
            if ((i11 & 16) != 0) {
                str5 = readMore.title;
            }
            String str6 = str5;
            String str7 = str3;
            return readMore.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPermalink() {
            return this.permalink;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final ReadMore copy(@NotNull String id2, @NotNull String description, @NotNull String imageUrl, @NotNull String permalink, @NotNull String title) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(permalink, "permalink");
            Intrinsics.checkNotNullParameter(title, "title");
            return new ReadMore(id2, description, imageUrl, permalink, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadMore)) {
                return false;
            }
            ReadMore readMore = (ReadMore) other;
            return Intrinsics.areEqual(this.id, readMore.id) && Intrinsics.areEqual(this.description, readMore.description) && Intrinsics.areEqual(this.imageUrl, readMore.imageUrl) && Intrinsics.areEqual(this.permalink, readMore.permalink) && Intrinsics.areEqual(this.title, readMore.title);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @Override // com.theathletic.slidestories.component.data.local.CardBlock
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
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
            return (((((((this.id.hashCode() * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.permalink.hashCode()) * 31) + this.title.hashCode();
        }

        @NotNull
        public String toString() {
            return "ReadMore(id=" + this.id + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", permalink=" + this.permalink + ", title=" + this.title + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/theathletic/slidestories/component/data/local/CardBlock$TakeawayMessage;", "Lcom/theathletic/slidestories/component/data/local/CardBlock;", "id", "", "label", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabel", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TakeawayMessage extends CardBlock {

        @NotNull
        private final String id;
        private final String label;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TakeawayMessage(@NotNull String id2, String str, @NotNull String text) {
            super(id2, null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = id2;
            this.label = str;
            this.text = text;
        }

        public static /* synthetic */ TakeawayMessage copy$default(TakeawayMessage takeawayMessage, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = takeawayMessage.id;
            }
            if ((i11 & 2) != 0) {
                str2 = takeawayMessage.label;
            }
            if ((i11 & 4) != 0) {
                str3 = takeawayMessage.text;
            }
            return takeawayMessage.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final TakeawayMessage copy(@NotNull String id2, String label, @NotNull String text) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            return new TakeawayMessage(id2, label, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TakeawayMessage)) {
                return false;
            }
            TakeawayMessage takeawayMessage = (TakeawayMessage) other;
            return Intrinsics.areEqual(this.id, takeawayMessage.id) && Intrinsics.areEqual(this.label, takeawayMessage.label) && Intrinsics.areEqual(this.text, takeawayMessage.text);
        }

        @Override // com.theathletic.slidestories.component.data.local.CardBlock
        @NotNull
        public String getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.label;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "TakeawayMessage(id=" + this.id + ", label=" + this.label + ", text=" + this.text + ")";
        }
    }

    public /* synthetic */ CardBlock(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    private CardBlock(String str) {
        this.id = str;
    }
}
