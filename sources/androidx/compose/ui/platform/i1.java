package androidx.compose.ui.platform;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import u1.t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements u1.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ u1.t f5725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f5726b;

    public i1(u1.t tVar, Function0 function0) {
        this.f5725a = tVar;
        this.f5726b = function0;
    }

    public final void a() {
        this.f5726b.invoke();
    }

    @Override // u1.t
    public boolean b(Object obj) {
        return this.f5725a.b(obj);
    }

    @Override // u1.t
    public t.a g(String str, Function0 function0) {
        return this.f5725a.g(str, function0);
    }

    @Override // u1.t
    public Map i() {
        return this.f5725a.i();
    }

    @Override // u1.t
    public Object k(String str) {
        return this.f5725a.k(str);
    }
}
