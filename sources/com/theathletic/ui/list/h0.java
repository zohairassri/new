package com.theathletic.ui.list;

import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.ui.d1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/theathletic/ui/list/h0;", "Lcom/theathletic/ui/d1;", "", "paddingRes", "<init>", "(I)V", "a", QueryKeys.IDLING, "()I", "", QueryKeys.PAGE_LOAD_TIME, "Ljava/lang/String;", "getStableId", "()Ljava/lang/String;", "stableId", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicInteger f83455d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int paddingRes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String stableId = "PADDING:" + f83455d.incrementAndGet();

    public h0(int i11) {
        this.paddingRes = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPaddingRes() {
        return this.paddingRes;
    }

    @Override // com.theathletic.ui.d1
    public String getStableId() {
        return this.stableId;
    }
}
