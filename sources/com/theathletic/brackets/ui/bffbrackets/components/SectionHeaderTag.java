package com.theathletic.brackets.ui.bffbrackets.components;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.theathletic.brackets.ui.bffbrackets.components.d1, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/theathletic/brackets/ui/bffbrackets/components/d1;", "", "", "sectionIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", QueryKeys.IDLING, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SectionHeaderTag {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sectionIndex;

    public SectionHeaderTag(int i11) {
        this.sectionIndex = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSectionIndex() {
        return this.sectionIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SectionHeaderTag) && this.sectionIndex == ((SectionHeaderTag) other).sectionIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.sectionIndex);
    }

    public String toString() {
        return "SectionHeaderTag(sectionIndex=" + this.sectionIndex + ")";
    }
}
