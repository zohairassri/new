package com.theathletic.feed.ui.components;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/theathletic/feed/ui/components/j4;", "Lcom/theathletic/feed/ui/components/g5;", "", "columns", "", "isInLastRow", "<init>", "(IZ)V", "a", QueryKeys.IDLING, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()I", QueryKeys.PAGE_LOAD_TIME, QueryKeys.MEMFLY_API_VERSION, QueryKeys.SUBDOMAIN, "()Z", "isNotInLastRow", "isSingleColumn", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j4 implements g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int columns;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isInLastRow;

    public j4(int i11, boolean z11) {
        this.columns = i11;
        this.isInLastRow = z11;
    }

    @Override // com.theathletic.feed.ui.components.g5
    public boolean a() {
        return getColumns() == 1;
    }

    @Override // com.theathletic.feed.ui.components.g5
    public boolean b() {
        return !getIsInLastRow();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public int getColumns() {
        return this.columns;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getIsInLastRow() {
        return this.isInLastRow;
    }
}
