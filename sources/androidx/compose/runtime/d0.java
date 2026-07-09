package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n5 f4434a;

    public /* synthetic */ d0(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public n5 a() {
        return this.f4434a;
    }

    public abstract n5 b(z2 z2Var, n5 n5Var);

    private d0(Function0 function0) {
        this.f4434a = new q1(function0);
    }
}
