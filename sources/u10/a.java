package u10;

import com.chartbeat.androidsdk.QueryKeys;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p20.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\f\u0011\u0012\u0013\u0006\u000b\u0014\u0015\u0016\u0017\u0018\u0019\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000f\u0082\u0001\u000b\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lu10/a;", "Ljava/io/Serializable;", "", "id", "<init>", "(J)V", "a", "J", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "()J", "", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/String;", "compositeId", "Lp20/d$a;", "()Lp20/d$a;", "asFollowableId", "l", "k", QueryKeys.VISIT_FREQUENCY, QueryKeys.DECAY, QueryKeys.VIEW_TITLE, QueryKeys.HOST, QueryKeys.ACCOUNT_ID, QueryKeys.SUBDOMAIN, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "Lu10/a$a;", "Lu10/a$b;", "Lu10/a$d;", "Lu10/a$e;", "Lu10/a$f;", "Lu10/a$g;", "Lu10/a$h;", "Lu10/a$i;", "Lu10/a$j;", "Lu10/a$k;", "Lu10/a$l;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: u10.a$a, reason: collision with other inner class name and from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu10/a$a;", "Lu10/a;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Author extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        public Author(long j11) {
            super(j11, null);
            this.id = j11;
        }

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Author) && this.id == ((Author) other).id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        public String toString() {
            return "Author(id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$b, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lu10/a$b;", "Lu10/a;", "", "id", "", "name", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "getName", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Category extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Category(long j11, String name) {
            super(j11, null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = j11;
            this.name = name;
        }

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Category)) {
                return false;
            }
            Category category = (Category) other;
            return this.id == category.id && Intrinsics.areEqual(this.name, category.name);
        }

        public int hashCode() {
            return (Long.hashCode(this.id) * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Category(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu10/a$c;", "", "<init>", "()V", "Lp20/d$a;", "id", "Lu10/a;", "a", "(Lp20/d$a;)Lu10/a;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: u10.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C1782a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[d.b.values().length];
                try {
                    iArr[d.b.TEAM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.b.LEAGUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.b.AUTHOR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(d.a id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            int i11 = C1782a.$EnumSwitchMapping$0[id2.getType().ordinal()];
            if (i11 == 1) {
                return new Team(Long.parseLong(id2.getId()));
            }
            if (i11 == 2) {
                return new League(Long.parseLong(id2.getId()));
            }
            if (i11 == 3) {
                return new Author(Long.parseLong(id2.getId()));
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lu10/a$d;", "Lu10/a;", "<init>", "()V", "", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", QueryKeys.PAGE_LOAD_TIME, "()Ljava/lang/String;", "compositeId", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f130851c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final String compositeId = "Frontpage";

        private d() {
            super(2132550680, null);
        }

        @Override // u10.a
        public String b() {
            return compositeId;
        }
    }

    /* JADX INFO: renamed from: u10.a$e, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lu10/a$e;", "Lu10/a;", "", "gameId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "Ljava/lang/String;", "getGameId", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GameFeed extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gameId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GameFeed(String gameId) {
            super(gameId.hashCode(), null);
            Intrinsics.checkNotNullParameter(gameId, "gameId");
            this.gameId = gameId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GameFeed) && Intrinsics.areEqual(this.gameId, ((GameFeed) other).gameId);
        }

        public int hashCode() {
            return this.gameId.hashCode();
        }

        public String toString() {
            return "GameFeed(gameId=" + this.gameId + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$f, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu10/a$f;", "Lu10/a;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class League extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        public League(long j11) {
            super(j11, null);
            this.id = j11;
        }

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof League) && this.id == ((League) other).id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        public String toString() {
            return "League(id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$g, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lu10/a$g;", "Lu10/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", "id", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScoresLeague extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScoresLeague) && this.id == ((ScoresLeague) other).id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        public String toString() {
            return "ScoresLeague(id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$h, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lu10/a$h;", "Lu10/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", "id", QueryKeys.SUBDOMAIN, "Ljava/lang/String;", "getGqlId", "gqlId", QueryKeys.PAGE_LOAD_TIME, "compositeId", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScoresTeam extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String gqlId;

        @Override // u10.a
        public String b() {
            if (this.gqlId == null) {
                return super.b();
            }
            return ScoresTeam.class.getSimpleName() + QueryKeys.END_MARKER + this.gqlId;
        }

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScoresTeam)) {
                return false;
            }
            ScoresTeam scoresTeam = (ScoresTeam) other;
            return this.id == scoresTeam.id && Intrinsics.areEqual(this.gqlId, scoresTeam.gqlId);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.id) * 31;
            String str = this.gqlId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ScoresTeam(id=" + this.id + ", gqlId=" + this.gqlId + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$i, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lu10/a$i;", "Lu10/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", "id", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScoresToday extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScoresToday) && this.id == ((ScoresToday) other).id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        public String toString() {
            return "ScoresToday(id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$j, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu10/a$j;", "Lu10/a;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tag extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        public Tag(long j11) {
            super(j11, null);
            this.id = j11;
        }

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tag) && this.id == ((Tag) other).id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        public String toString() {
            return "Tag(id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: u10.a$k, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lu10/a$k;", "Lu10/a;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "J", "()J", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Team extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long id;

        public Team(long j11) {
            super(j11, null);
            this.id = j11;
        }

        @Override // u10.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public long getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Team) && this.id == ((Team) other).id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        public String toString() {
            return "Team(id=" + this.id + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu10/a$l;", "Lu10/a;", "<init>", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class l extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f130861c = new l();

        private l() {
            super(-10L, null);
        }
    }

    public /* synthetic */ a(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    public final d.a a() {
        d.b bVar;
        if (this instanceof Team) {
            bVar = d.b.TEAM;
        } else if (this instanceof League) {
            bVar = d.b.LEAGUE;
        } else {
            if (!(this instanceof Author)) {
                return null;
            }
            bVar = d.b.AUTHOR;
        }
        return new d.a(String.valueOf(getId()), bVar);
    }

    public String b() {
        return getClass().getSimpleName() + QueryKeys.END_MARKER + getId();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public long getId() {
        return this.id;
    }

    private a(long j11) {
        this.id = j11;
    }
}
