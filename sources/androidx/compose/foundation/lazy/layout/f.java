package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f3716c;

        public a(int i11, int i12, Object obj) {
            this.f3714a = i11;
            this.f3715b = i12;
            this.f3716c = obj;
            if (!(i11 >= 0)) {
                c0.e.a("startIndex should be >= 0");
            }
            if (i12 > 0) {
                return;
            }
            c0.e.a("size should be > 0");
        }

        public final int a() {
            return this.f3715b;
        }

        public final int b() {
            return this.f3714a;
        }

        public final Object c() {
            return this.f3716c;
        }
    }

    int a();

    void b(int i11, int i12, Function1 function1);

    a get(int i11);
}
