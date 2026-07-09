package sa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f126325b;

    public y(String tag, String workSpecId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f126324a = tag;
        this.f126325b = workSpecId;
    }

    public final String a() {
        return this.f126324a;
    }

    public final String b() {
        return this.f126325b;
    }
}
