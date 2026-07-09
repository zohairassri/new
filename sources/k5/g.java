package k5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f107460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Throwable finalException) {
        super(null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f107460a = finalException;
    }

    public final Throwable a() {
        return this.f107460a;
    }
}
