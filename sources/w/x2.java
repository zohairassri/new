package w;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class x2 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f133897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f133898b;

    public x2(Function1 function1, Function1 function12) {
        this.f133897a = function1;
        this.f133898b = function12;
    }

    @Override // w.w2
    public Function1 a() {
        return this.f133897a;
    }

    @Override // w.w2
    public Function1 b() {
        return this.f133898b;
    }
}
