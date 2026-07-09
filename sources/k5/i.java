package k5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f107461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Throwable readException) {
        super(null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f107461a = readException;
    }

    public final Throwable a() {
        return this.f107461a;
    }
}
