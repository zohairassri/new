package mw;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f117059a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f117060b = new a();

        private a() {
            super("InvalidReceipt", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f117061b = new b();

        private b() {
            super("ServerError", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f117062b = new c();

        private c() {
            super("Mock Success (Creates Temp Entitlement)", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f117063b = new d();

        private d() {
            super("Success (All Access Entitlements)", null);
        }
    }

    public /* synthetic */ y(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f117059a;
    }

    private y(String str) {
        this.f117059a = str;
    }
}
