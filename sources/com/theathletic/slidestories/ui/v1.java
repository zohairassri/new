package com.theathletic.slidestories.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/theathletic/slidestories/ui/v1;", "", "<init>", "()V", "a", "Lcom/theathletic/slidestories/ui/v1$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class v1 {

    /* JADX INFO: renamed from: com.theathletic.slidestories.ui.v1$a, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/theathletic/slidestories/ui/v1$a;", "Lcom/theathletic/slidestories/ui/v1;", "", "storyId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refresh extends v1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String storyId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refresh(String storyId) {
            super(null);
            Intrinsics.checkNotNullParameter(storyId, "storyId");
            this.storyId = storyId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Refresh) && Intrinsics.areEqual(this.storyId, ((Refresh) other).storyId);
        }

        public int hashCode() {
            return this.storyId.hashCode();
        }

        public String toString() {
            return "Refresh(storyId=" + this.storyId + ")";
        }
    }

    public /* synthetic */ v1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private v1() {
    }
}
