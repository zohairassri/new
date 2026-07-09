package com.theathletic.featureintro.component.data.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000eJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u000eHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/theathletic/featureintro/component/data/local/FeatureIntro;", "", "pages", "", "Lcom/theathletic/featureintro/component/data/local/FeatureIntro$IntroPage;", "destinationUrl", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPages", "()Ljava/util/List;", "getDestinationUrl", "()Ljava/lang/String;", "pageCount", "", "getPageCount", "()I", "getAnalyticsView", "index", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "IntroPage", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureIntro {
    public static final int $stable = 8;
    private final String destinationUrl;
    private final int pageCount;

    @NotNull
    private final List<IntroPage> pages;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/theathletic/featureintro/component/data/local/FeatureIntro$IntroPage;", "", "analyticsView", "", "title", "", "description", "image", "buttonLabel", "<init>", "(Ljava/lang/String;IIII)V", "getAnalyticsView", "()Ljava/lang/String;", "getTitle", "()I", "getDescription", "getImage", "getButtonLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IntroPage {
        public static final int $stable = 0;

        @NotNull
        private final String analyticsView;
        private final int buttonLabel;
        private final int description;
        private final int image;
        private final int title;

        public IntroPage(@NotNull String analyticsView, int i11, int i12, int i13, int i14) {
            Intrinsics.checkNotNullParameter(analyticsView, "analyticsView");
            this.analyticsView = analyticsView;
            this.title = i11;
            this.description = i12;
            this.image = i13;
            this.buttonLabel = i14;
        }

        public static /* synthetic */ IntroPage copy$default(IntroPage introPage, String str, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = introPage.analyticsView;
            }
            if ((i15 & 2) != 0) {
                i11 = introPage.title;
            }
            if ((i15 & 4) != 0) {
                i12 = introPage.description;
            }
            if ((i15 & 8) != 0) {
                i13 = introPage.image;
            }
            if ((i15 & 16) != 0) {
                i14 = introPage.buttonLabel;
            }
            int i16 = i14;
            int i17 = i12;
            return introPage.copy(str, i11, i17, i13, i16);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAnalyticsView() {
            return this.analyticsView;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getButtonLabel() {
            return this.buttonLabel;
        }

        @NotNull
        public final IntroPage copy(@NotNull String analyticsView, int title, int description, int image, int buttonLabel) {
            Intrinsics.checkNotNullParameter(analyticsView, "analyticsView");
            return new IntroPage(analyticsView, title, description, image, buttonLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntroPage)) {
                return false;
            }
            IntroPage introPage = (IntroPage) other;
            return Intrinsics.areEqual(this.analyticsView, introPage.analyticsView) && this.title == introPage.title && this.description == introPage.description && this.image == introPage.image && this.buttonLabel == introPage.buttonLabel;
        }

        @NotNull
        public final String getAnalyticsView() {
            return this.analyticsView;
        }

        public final int getButtonLabel() {
            return this.buttonLabel;
        }

        public final int getDescription() {
            return this.description;
        }

        public final int getImage() {
            return this.image;
        }

        public final int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((this.analyticsView.hashCode() * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.description)) * 31) + Integer.hashCode(this.image)) * 31) + Integer.hashCode(this.buttonLabel);
        }

        @NotNull
        public String toString() {
            return "IntroPage(analyticsView=" + this.analyticsView + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ", buttonLabel=" + this.buttonLabel + ")";
        }
    }

    public FeatureIntro(@NotNull List<IntroPage> pages, String str) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.pages = pages;
        this.destinationUrl = str;
        this.pageCount = pages.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureIntro copy$default(FeatureIntro featureIntro, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = featureIntro.pages;
        }
        if ((i11 & 2) != 0) {
            str = featureIntro.destinationUrl;
        }
        return featureIntro.copy(list, str);
    }

    @NotNull
    public final List<IntroPage> component1() {
        return this.pages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDestinationUrl() {
        return this.destinationUrl;
    }

    @NotNull
    public final FeatureIntro copy(@NotNull List<IntroPage> pages, String destinationUrl) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new FeatureIntro(pages, destinationUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureIntro)) {
            return false;
        }
        FeatureIntro featureIntro = (FeatureIntro) other;
        return Intrinsics.areEqual(this.pages, featureIntro.pages) && Intrinsics.areEqual(this.destinationUrl, featureIntro.destinationUrl);
    }

    @NotNull
    public final String getAnalyticsView(int index) {
        return !this.pages.isEmpty() ? this.pages.get(index).getAnalyticsView() : "";
    }

    public final String getDestinationUrl() {
        return this.destinationUrl;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    @NotNull
    public final List<IntroPage> getPages() {
        return this.pages;
    }

    public int hashCode() {
        int iHashCode = this.pages.hashCode() * 31;
        String str = this.destinationUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FeatureIntro(pages=" + this.pages + ", destinationUrl=" + this.destinationUrl + ")";
    }

    public /* synthetic */ FeatureIntro(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str);
    }
}
