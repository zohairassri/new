package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    default k a() {
        return k.f5077b.b();
    }

    default k b() {
        return k.f5077b.b();
    }

    default k d() {
        return k.f5077b.b();
    }

    default k e() {
        return k.f5077b.b();
    }

    default k f() {
        return k.f5077b.b();
    }

    default k g() {
        return k.f5077b.b();
    }

    void h(boolean z11);

    boolean j();

    default k k() {
        return k.f5077b.b();
    }

    default Function1 l() {
        return a.f5062a;
    }

    default k m() {
        return k.f5077b.b();
    }

    default Function1 n() {
        return b.f5063a;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5062a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((d2.c) obj);
            return Unit.f111650a;
        }

        public final void a(d2.c cVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5063a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((d2.c) obj);
            return Unit.f111650a;
        }

        public final void a(d2.c cVar) {
        }
    }

    default void i(Function1 function1) {
    }

    default void o(Function1 function1) {
    }
}
