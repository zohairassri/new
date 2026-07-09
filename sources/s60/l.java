package s60;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Ls60/l;", "", "", "route", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Ls60/l$a;", "Ls60/l$b;", "Ls60/l$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String route;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls60/l$a;", "Ls60/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f125654b = new a();

        private a() {
            super("scores_graph", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls60/l$b;", "Ls60/l;", "<init>", "()V", "", "animateSearchBar", "", QueryKeys.PAGE_LOAD_TIME, "(Z)Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f125655b = new b();

        private b() {
            super("scores?animateSearchBar={animateSearchBar}", null);
        }

        public final String b(boolean animateSearchBar) {
            return "scores?animateSearchBar=" + animateSearchBar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls60/l$c;", "Ls60/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f125656b = new c();

        private c() {
            super("search", null);
        }
    }

    public /* synthetic */ l(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    private l(String str) {
        this.route = str;
    }
}
