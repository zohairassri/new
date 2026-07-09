package com.theathletic.ui.list;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.d1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/theathletic/ui/list/g0;", "Lcom/theathletic/ui/d1;", "", "title", "<init>", "(I)V", "a", QueryKeys.IDLING, "()I", "", "getStableId", "()Ljava/lang/String;", "stableId", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int title;

    public g0(int i11) {
        this.title = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return String.valueOf(this.title);
    }
}
