package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1 f4882a;

    public u1(Function1 function1) {
        this.f4882a = function1;
    }

    public final Object a(long j11) {
        return this.f4882a.invoke(Long.valueOf(j11 / 1000000));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
