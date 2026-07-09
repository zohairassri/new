package com.theathletic.ui.widgets;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/theathletic/ui/widgets/z7;", "T", "", "", "titleStringResId", "priorState", "<init>", "(ILjava/lang/Object;)V", "a", QueryKeys.IDLING, QueryKeys.PAGE_LOAD_TIME, "()I", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class z7<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int titleStringResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object priorState;

    public z7(int i11, Object obj) {
        this.titleStringResId = i11;
        this.priorState = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getPriorState() {
        return this.priorState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTitleStringResId() {
        return this.titleStringResId;
    }
}
