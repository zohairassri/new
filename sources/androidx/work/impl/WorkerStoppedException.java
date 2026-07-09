package androidx.work.impl;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "", "reason", "<init>", "(I)V", "a", QueryKeys.IDLING, "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WorkerStoppedException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    public WorkerStoppedException(int i11) {
        this.reason = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getReason() {
        return this.reason;
    }
}
