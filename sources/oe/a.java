package oe;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: oe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1580a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f120320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f120321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f120322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f120323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f120324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f120325f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1580a(String threadName, Throwable throwable, long j11, String message, String loggerName, List threads) {
            super(null);
            Intrinsics.checkNotNullParameter(threadName, "threadName");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(loggerName, "loggerName");
            Intrinsics.checkNotNullParameter(threads, "threads");
            this.f120320a = threadName;
            this.f120321b = throwable;
            this.f120322c = j11;
            this.f120323d = message;
            this.f120324e = loggerName;
            this.f120325f = threads;
        }

        public final String a() {
            return this.f120324e;
        }

        public String b() {
            return this.f120323d;
        }

        public final String c() {
            return this.f120320a;
        }

        public List d() {
            return this.f120325f;
        }

        public Throwable e() {
            return this.f120321b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1580a)) {
                return false;
            }
            C1580a c1580a = (C1580a) obj;
            return Intrinsics.areEqual(this.f120320a, c1580a.f120320a) && Intrinsics.areEqual(this.f120321b, c1580a.f120321b) && this.f120322c == c1580a.f120322c && Intrinsics.areEqual(this.f120323d, c1580a.f120323d) && Intrinsics.areEqual(this.f120324e, c1580a.f120324e) && Intrinsics.areEqual(this.f120325f, c1580a.f120325f);
        }

        public final long f() {
            return this.f120322c;
        }

        public int hashCode() {
            return (((((((((this.f120320a.hashCode() * 31) + this.f120321b.hashCode()) * 31) + Long.hashCode(this.f120322c)) * 31) + this.f120323d.hashCode()) * 31) + this.f120324e.hashCode()) * 31) + this.f120325f.hashCode();
        }

        public String toString() {
            return "Logs(threadName=" + this.f120320a + ", throwable=" + this.f120321b + ", timestamp=" + this.f120322c + ", message=" + this.f120323d + ", loggerName=" + this.f120324e + ", threads=" + this.f120325f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Throwable f120326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f120327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f120328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable throwable, String message, List threads) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(threads, "threads");
            this.f120326a = throwable;
            this.f120327b = message;
            this.f120328c = threads;
        }

        public String a() {
            return this.f120327b;
        }

        public List b() {
            return this.f120328c;
        }

        public Throwable c() {
            return this.f120326a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f120326a, bVar.f120326a) && Intrinsics.areEqual(this.f120327b, bVar.f120327b) && Intrinsics.areEqual(this.f120328c, bVar.f120328c);
        }

        public int hashCode() {
            return (((this.f120326a.hashCode() * 31) + this.f120327b.hashCode()) * 31) + this.f120328c.hashCode();
        }

        public String toString() {
            return "Rum(throwable=" + this.f120326a + ", message=" + this.f120327b + ", threads=" + this.f120328c + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
