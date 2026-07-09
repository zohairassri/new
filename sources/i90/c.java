package i90;

import f0.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f103435a;

    public c(o lazyListItem) {
        Intrinsics.checkNotNullParameter(lazyListItem, "lazyListItem");
        this.f103435a = lazyListItem;
    }

    @Override // i90.i
    public int a() {
        return this.f103435a.getIndex();
    }

    @Override // i90.i
    public int b() {
        return this.f103435a.getOffset();
    }

    @Override // i90.i
    public int c() {
        return this.f103435a.a();
    }
}
