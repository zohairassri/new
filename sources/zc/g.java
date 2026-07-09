package zc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f142228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f142229b;

    public g(Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f142228a = cause;
    }

    public final Throwable a() {
        return this.f142228a;
    }

    @Override // zc.d
    public String getId() {
        return this.f142229b;
    }
}
