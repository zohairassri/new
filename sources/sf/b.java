package sf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements nf.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f126570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nf.c f126571b;

    public b(a eventMapper, nf.c serializer) {
        Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f126570a = eventMapper;
        this.f126571b = serializer;
    }

    @Override // nf.c
    public String a(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object objA = this.f126570a.a(model);
        if (objA == null) {
            return null;
        }
        return this.f126571b.a(objA);
    }
}
