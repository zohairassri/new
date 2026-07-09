package sa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.f f126251b;

    public q(String workSpecId, androidx.work.f progress) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f126250a = workSpecId;
        this.f126251b = progress;
    }

    public final androidx.work.f a() {
        return this.f126251b;
    }

    public final String b() {
        return this.f126250a;
    }
}
