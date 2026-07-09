package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f5407a;

    public /* synthetic */ y(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public abstract float a(float f11, v2.p pVar, v2.p pVar2);

    public final Function2 b() {
        return this.f5407a;
    }

    private y(Function2 function2) {
        this.f5407a = function2;
    }
}
