package com.theathletic.main.ui.navigation;

import android.util.SparseArray;
import androidx.compose.runtime.d2;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.theathletic.main.ui.navigation.p, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/theathletic/main/ui/navigation/p;", "", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment$SavedState;", "savedStates", "Landroidx/compose/runtime/d2;", "", "selectedTabId", "<init>", "(Landroid/util/SparseArray;Landroidx/compose/runtime/d2;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/util/SparseArray;", "()Landroid/util/SparseArray;", QueryKeys.PAGE_LOAD_TIME, "Landroidx/compose/runtime/d2;", "()Landroidx/compose/runtime/d2;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TabState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SparseArray savedStates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d2 selectedTabId;

    public TabState(SparseArray savedStates, d2 selectedTabId) {
        Intrinsics.checkNotNullParameter(savedStates, "savedStates");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.savedStates = savedStates;
        this.selectedTabId = selectedTabId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SparseArray getSavedStates() {
        return this.savedStates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d2 getSelectedTabId() {
        return this.selectedTabId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabState)) {
            return false;
        }
        TabState tabState = (TabState) other;
        return Intrinsics.areEqual(this.savedStates, tabState.savedStates) && Intrinsics.areEqual(this.selectedTabId, tabState.selectedTabId);
    }

    public int hashCode() {
        return (this.savedStates.hashCode() * 31) + this.selectedTabId.hashCode();
    }

    public String toString() {
        return "TabState(savedStates=" + this.savedStates + ", selectedTabId=" + this.selectedTabId + ")";
    }
}
