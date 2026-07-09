package tf0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface m extends m2 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f130002a;

        public a(Function1 function1) {
            this.f130002a = function1;
        }

        @Override // tf0.m
        public void b(Throwable th2) {
            this.f130002a.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + r0.a(this.f130002a) + '@' + r0.b(this) + ']';
        }
    }

    void b(Throwable th2);
}
