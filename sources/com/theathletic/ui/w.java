package com.theathletic.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/theathletic/ui/w;", "Lcom/theathletic/ui/o0;", "", "sectionId", "", "titleResId", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "getSectionId", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.IDLING, "()I", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sectionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int titleResId;

    public w(String sectionId, int i11) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        this.sectionId = sectionId;
        this.titleResId = i11;
    }

    @Override // com.theathletic.ui.o0
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getTitleResId() {
        return this.titleResId;
    }
}
