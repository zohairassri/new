package mg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f116243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o writer, boolean z11) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f116243c = z11;
    }

    @Override // mg0.h
    public void n(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f116243c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
