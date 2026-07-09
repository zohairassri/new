package mw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import xw.e;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f117037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xw.e f117038b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a extends m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f117039c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super("No Override", null, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f117040c = new b();

        private b() {
            super("Product Not found", e.a.b.f138118a, null);
        }
    }

    public /* synthetic */ m(String str, xw.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar);
    }

    public final String a() {
        return this.f117037a;
    }

    public final xw.e b() {
        return this.f117038b;
    }

    private m(String str, xw.e eVar) {
        this.f117037a = str;
        this.f117038b = eVar;
    }
}
