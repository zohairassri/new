package bv;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15164b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f15165c = new c("1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f15166d = new c("mockTestKey");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15167a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f15165c;
        }

        private a() {
        }
    }

    public c(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f15167a = label;
    }

    public final String b() {
        return this.f15167a;
    }
}
