package sa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f126218b;

    public a(String workSpecId, String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.f126217a = workSpecId;
        this.f126218b = prerequisiteId;
    }

    public final String a() {
        return this.f126218b;
    }

    public final String b() {
        return this.f126217a;
    }
}
