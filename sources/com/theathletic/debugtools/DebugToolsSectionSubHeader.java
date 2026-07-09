package com.theathletic.debugtools;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/theathletic/debugtools/DebugToolsSectionSubHeader;", "Lcom/theathletic/debugtools/DebugToolsBaseItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "title", "Ljava/lang/String;", "a", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DebugToolsSectionSubHeader extends DebugToolsBaseItem {
    public static final int $stable = 8;

    @NotNull
    private final String title;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DebugToolsSectionSubHeader) && Intrinsics.areEqual(this.title, ((DebugToolsSectionSubHeader) other).title);
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return "DebugToolsSectionSubHeader(title=" + this.title + ")";
    }
}
