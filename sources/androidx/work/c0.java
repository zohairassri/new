package androidx.work;

import androidx.work.t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f13374e = new b(null);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c0 a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return (c0) new a(workerClass).b();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a builder) {
        super(builder.e(), builder.h(), builder.f());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    public static final c0 e(Class cls) {
        return f13374e.a(cls);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends t0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        }

        @Override // androidx.work.t0.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c0 c() {
            if (d() && h().f126270j.j()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new c0(this);
        }

        @Override // androidx.work.t0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }
}
