package mw;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f117031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f117032b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f117033c = new a();

        private a() {
            super("30 Seconds", 30000L, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f117034c = new b();

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            super("No Override", null, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f117035c = new c();

        private c() {
            super("1 minute", 60000L, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f117036c = new d();

        private d() {
            super("2 minutes", 120000L, null);
        }
    }

    public /* synthetic */ k(String str, Long l11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l11);
    }

    public final Long a() {
        return this.f117032b;
    }

    public final String b() {
        return this.f117031a;
    }

    private k(String str, Long l11) {
        this.f117031a = str;
        this.f117032b = l11;
    }
}
