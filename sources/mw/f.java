package mw;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f117006a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f117007b = new a();

        private a() {
            super("All Access Subscription", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f117008b = new b();

        private b() {
            super("Connection Error", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f117009b = new c();

        private c() {
            super("No Purchases (Empty)", null);
        }
    }

    public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f117006a;
    }

    private f(String str) {
        this.f117006a = str;
    }
}
