package com.theathletic.ui.list;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/theathletic/ui/list/j;", "", QueryKeys.PAGE_LOAD_TIME, "a", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: com.theathletic.ui.list.j$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0014\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0005R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\u0005R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/theathletic/ui/list/j$a;", "Lcom/theathletic/ui/d1;", "Lcom/theathletic/ui/list/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStableId", "stableId", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "text", "leftDrawableUri", QueryKeys.SUBDOMAIN, QueryKeys.IDLING, "dividerStartPadding", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LeftDrawableUri implements d1, j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stableId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String leftDrawableUri;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int dividerStartPadding;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDividerStartPadding() {
            return this.dividerStartPadding;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLeftDrawableUri() {
            return this.leftDrawableUri;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftDrawableUri)) {
                return false;
            }
            LeftDrawableUri leftDrawableUri = (LeftDrawableUri) other;
            return Intrinsics.areEqual(this.stableId, leftDrawableUri.stableId) && Intrinsics.areEqual(this.text, leftDrawableUri.text) && Intrinsics.areEqual(this.leftDrawableUri, leftDrawableUri.leftDrawableUri) && this.dividerStartPadding == leftDrawableUri.dividerStartPadding;
        }

        @Override // com.theathletic.ui.d1
        public String getStableId() {
            return this.stableId;
        }

        public int hashCode() {
            return (((((this.stableId.hashCode() * 31) + this.text.hashCode()) * 31) + this.leftDrawableUri.hashCode()) * 31) + Integer.hashCode(this.dividerStartPadding);
        }

        public String toString() {
            return "LeftDrawableUri(stableId=" + this.stableId + ", text=" + this.text + ", leftDrawableUri=" + this.leftDrawableUri + ", dividerStartPadding=" + this.dividerStartPadding + ")";
        }
    }

    /* JADX INFO: renamed from: com.theathletic.ui.list.j$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0005R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000e\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/theathletic/ui/list/j$b;", "Lcom/theathletic/ui/d1;", "Lcom/theathletic/ui/list/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStableId", "stableId", QueryKeys.PAGE_LOAD_TIME, "text", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.IDLING, "dividerStartPadding", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text implements d1, j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stableId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int dividerStartPadding;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDividerStartPadding() {
            return this.dividerStartPadding;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.stableId, text.stableId) && Intrinsics.areEqual(this.text, text.text) && this.dividerStartPadding == text.dividerStartPadding;
        }

        @Override // com.theathletic.ui.d1
        public String getStableId() {
            return this.stableId;
        }

        public int hashCode() {
            return (((this.stableId.hashCode() * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.dividerStartPadding);
        }

        public String toString() {
            return "Text(stableId=" + this.stableId + ", text=" + this.text + ", dividerStartPadding=" + this.dividerStartPadding + ")";
        }
    }
}
