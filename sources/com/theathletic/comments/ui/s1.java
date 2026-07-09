package com.theathletic.comments.ui;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/theathletic/comments/ui/s1;", "", "a", QueryKeys.PAGE_LOAD_TIME, "Lcom/theathletic/comments/ui/s1$a;", "Lcom/theathletic/comments/ui/s1$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface s1 {

    /* JADX INFO: renamed from: com.theathletic.comments.ui.s1$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/theathletic/comments/ui/s1$a;", "Lcom/theathletic/comments/ui/s1;", "", "countLabel", "description", "", "hasLiveIndicator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Participants implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasLiveIndicator;

        public Participants(String countLabel, String description, boolean z11) {
            Intrinsics.checkNotNullParameter(countLabel, "countLabel");
            Intrinsics.checkNotNullParameter(description, "description");
            this.countLabel = countLabel;
            this.description = description;
            this.hasLiveIndicator = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountLabel() {
            return this.countLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getHasLiveIndicator() {
            return this.hasLiveIndicator;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Participants)) {
                return false;
            }
            Participants participants = (Participants) other;
            return Intrinsics.areEqual(this.countLabel, participants.countLabel) && Intrinsics.areEqual(this.description, participants.description) && this.hasLiveIndicator == participants.hasLiveIndicator;
        }

        public int hashCode() {
            return (((this.countLabel.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.hasLiveIndicator);
        }

        public String toString() {
            return "Participants(countLabel=" + this.countLabel + ", description=" + this.description + ", hasLiveIndicator=" + this.hasLiveIndicator + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.comments.ui.s1$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/theathletic/comments/ui/s1$b;", "Lcom/theathletic/comments/ui/s1;", "", "", "avatarUrls", "namesLabel", "description", "", "isVerticallyStacked", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SUBDOMAIN, QueryKeys.MEMFLY_API_VERSION, "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reporters implements s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List avatarUrls;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String namesLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isVerticallyStacked;

        public Reporters(List avatarUrls, String namesLabel, String description, boolean z11) {
            Intrinsics.checkNotNullParameter(avatarUrls, "avatarUrls");
            Intrinsics.checkNotNullParameter(namesLabel, "namesLabel");
            Intrinsics.checkNotNullParameter(description, "description");
            this.avatarUrls = avatarUrls;
            this.namesLabel = namesLabel;
            this.description = description;
            this.isVerticallyStacked = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getAvatarUrls() {
            return this.avatarUrls;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNamesLabel() {
            return this.namesLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsVerticallyStacked() {
            return this.isVerticallyStacked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reporters)) {
                return false;
            }
            Reporters reporters = (Reporters) other;
            return Intrinsics.areEqual(this.avatarUrls, reporters.avatarUrls) && Intrinsics.areEqual(this.namesLabel, reporters.namesLabel) && Intrinsics.areEqual(this.description, reporters.description) && this.isVerticallyStacked == reporters.isVerticallyStacked;
        }

        public int hashCode() {
            return (((((this.avatarUrls.hashCode() * 31) + this.namesLabel.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isVerticallyStacked);
        }

        public String toString() {
            return "Reporters(avatarUrls=" + this.avatarUrls + ", namesLabel=" + this.namesLabel + ", description=" + this.description + ", isVerticallyStacked=" + this.isVerticallyStacked + ")";
        }
    }
}
