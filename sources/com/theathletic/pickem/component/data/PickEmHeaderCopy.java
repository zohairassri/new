package com.theathletic.pickem.component.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/theathletic/pickem/component/data/PickEmHeaderCopy;", "", "headerLines", "", "", "contentLines", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getHeaderLines", "()Ljava/util/List;", "getContentLines", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickEmHeaderCopy {

    @NotNull
    private final List<String> contentLines;

    @NotNull
    private final List<String> headerLines;

    public PickEmHeaderCopy(@NotNull List<String> headerLines, @NotNull List<String> contentLines) {
        Intrinsics.checkNotNullParameter(headerLines, "headerLines");
        Intrinsics.checkNotNullParameter(contentLines, "contentLines");
        this.headerLines = headerLines;
        this.contentLines = contentLines;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PickEmHeaderCopy copy$default(PickEmHeaderCopy pickEmHeaderCopy, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pickEmHeaderCopy.headerLines;
        }
        if ((i11 & 2) != 0) {
            list2 = pickEmHeaderCopy.contentLines;
        }
        return pickEmHeaderCopy.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.headerLines;
    }

    @NotNull
    public final List<String> component2() {
        return this.contentLines;
    }

    @NotNull
    public final PickEmHeaderCopy copy(@NotNull List<String> headerLines, @NotNull List<String> contentLines) {
        Intrinsics.checkNotNullParameter(headerLines, "headerLines");
        Intrinsics.checkNotNullParameter(contentLines, "contentLines");
        return new PickEmHeaderCopy(headerLines, contentLines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickEmHeaderCopy)) {
            return false;
        }
        PickEmHeaderCopy pickEmHeaderCopy = (PickEmHeaderCopy) other;
        return Intrinsics.areEqual(this.headerLines, pickEmHeaderCopy.headerLines) && Intrinsics.areEqual(this.contentLines, pickEmHeaderCopy.contentLines);
    }

    @NotNull
    public final List<String> getContentLines() {
        return this.contentLines;
    }

    @NotNull
    public final List<String> getHeaderLines() {
        return this.headerLines;
    }

    public int hashCode() {
        return (this.headerLines.hashCode() * 31) + this.contentLines.hashCode();
    }

    @NotNull
    public String toString() {
        return "PickEmHeaderCopy(headerLines=" + this.headerLines + ", contentLines=" + this.contentLines + ")";
    }
}
