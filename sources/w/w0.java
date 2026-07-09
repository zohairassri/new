package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f133886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f133887b;

    public /* synthetic */ w0(Object obj, e0 e0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, e0Var);
    }

    public final e0 a() {
        return this.f133887b;
    }

    public final Object b() {
        return this.f133886a;
    }

    public final void c(e0 e0Var) {
        this.f133887b = e0Var;
    }

    private w0(Object obj, e0 e0Var) {
        this.f133886a = obj;
        this.f133887b = e0Var;
    }
}
