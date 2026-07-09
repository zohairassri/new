package uc;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import wf0.h;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f131276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h owner) {
        super("Flow was aborted, no more elements needed");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f131276a = owner;
    }

    public final void a(h owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.f131276a != owner) {
            throw this;
        }
    }
}
