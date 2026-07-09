package fx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94995a;

    public c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f94995a = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f94995a;
    }
}
