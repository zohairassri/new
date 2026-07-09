package se0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yd0.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Function1 f126569a;

    c(Function1 function1) {
        this.f126569a = function1;
    }

    @Override // yd0.g
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f126569a.invoke(obj), "invoke(...)");
    }
}
