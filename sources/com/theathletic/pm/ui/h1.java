package com.theathletic.pm.ui;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\n\u0010\f\u0011\u0012\b\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e\u0082\u0001\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/theathletic/share/ui/h1;", "", "", "isGiftable", "<init>", "(Z)V", "isStaff", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Z)Ljava/lang/String;", "a", QueryKeys.MEMFLY_API_VERSION, QueryKeys.PAGE_LOAD_TIME, "()Z", "()Ljava/lang/String;", "sourceName", QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.VISIT_FREQUENCY, QueryKeys.ACCOUNT_ID, "Lcom/theathletic/share/ui/h1$a;", "Lcom/theathletic/share/ui/h1$b;", "Lcom/theathletic/share/ui/h1$c;", "Lcom/theathletic/share/ui/h1$d;", "Lcom/theathletic/share/ui/h1$e;", "Lcom/theathletic/share/ui/h1$f;", "Lcom/theathletic/share/ui/h1$g;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareType.kt\ncom/theathletic/share/ui/ShareType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public abstract class h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81329b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isGiftable;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/share/ui/h1$a;", "Lcom/theathletic/share/ui/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "a", "sourceName", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f81331c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String sourceName = "shared_article";

        private a() {
            super(true, null);
        }

        @Override // com.theathletic.pm.ui.h1
        protected String a() {
            return sourceName;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -980800512;
        }

        public String toString() {
            return "Article";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/share/ui/h1$b;", "Lcom/theathletic/share/ui/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "a", "sourceName", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f81333c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String sourceName = "shared_pickem_todays_picks";

        private b() {
            super(false, null);
        }

        @Override // com.theathletic.pm.ui.h1
        protected String a() {
            return sourceName;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 394060332;
        }

        public String toString() {
            return "DailyPickEm";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/share/ui/h1$c;", "Lcom/theathletic/share/ui/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "a", "sourceName", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f81335c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String sourceName = "shared_interactive";

        private c() {
            super(true, null);
        }

        @Override // com.theathletic.pm.ui.h1
        protected String a() {
            return sourceName;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1713268500;
        }

        public String toString() {
            return "Interactive";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/share/ui/h1$d;", "Lcom/theathletic/share/ui/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "a", "sourceName", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f81337c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String sourceName = "shared_liveblog";

        private d() {
            super(true, null);
        }

        @Override // com.theathletic.pm.ui.h1
        protected String a() {
            return sourceName;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1988984604;
        }

        public String toString() {
            return "LiveBlog";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/share/ui/h1$e;", "Lcom/theathletic/share/ui/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "a", "sourceName", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f81339c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String sourceName = "shared_pickem_leaderboard";

        private e() {
            super(false, null);
        }

        @Override // com.theathletic.pm.ui.h1
        protected String a() {
            return sourceName;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 462770590;
        }

        public String toString() {
            return "PickEmLeaderboard";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/share/ui/h1$f;", "Lcom/theathletic/share/ui/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "a", "sourceName", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f81341c = new f();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String sourceName = "shared_pickem_scorecard";

        private f() {
            super(false, null);
        }

        @Override // com.theathletic.pm.ui.h1
        protected String a() {
            return sourceName;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -482861309;
        }

        public String toString() {
            return "PickEmScorecard";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theathletic/share/ui/h1$g;", "Lcom/theathletic/share/ui/h1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "a", "sourceName", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends h1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f81343c = new g();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String sourceName = null;

        private g() {
            super(false, null);
        }

        @Override // com.theathletic.pm.ui.h1
        protected String a() {
            return sourceName;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return -533263532;
        }

        public String toString() {
            return "Unknown";
        }
    }

    public /* synthetic */ h1(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    protected abstract String a();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsGiftable() {
        return this.isGiftable;
    }

    public final String c(boolean isStaff) {
        String strA = a();
        if (strA == null) {
            return null;
        }
        return (isStaff ? "emp" : "user") + QueryKeys.END_MARKER + strA;
    }

    private h1(boolean z11) {
        this.isGiftable = z11;
    }
}
