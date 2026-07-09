package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f111870d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f111871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f111872f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f111873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f111874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f111875c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C1351a f111876j = new C1351a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final a f111877k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f111878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f111879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f111880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f111881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f111882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f111883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f111884g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f111885h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f111886i;

        /* JADX INFO: renamed from: kotlin.text.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C1351a {
            public /* synthetic */ C1351a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f111877k;
            }

            private C1351a() {
            }
        }

        public a(int i11, int i12, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.f111878a = i11;
            this.f111879b = i12;
            this.f111880c = groupSeparator;
            this.f111881d = byteSeparator;
            this.f111882e = bytePrefix;
            this.f111883f = byteSuffix;
            this.f111884g = i11 == Integer.MAX_VALUE && i12 == Integer.MAX_VALUE;
            this.f111885h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f111886i = e.b(groupSeparator) || e.b(byteSeparator) || e.b(bytePrefix) || e.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f111878a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f111879b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f111880c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f111881d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f111882e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f111883f);
            sb2.append("\"");
            return sb2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return d.f111871e;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f111887h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final c f111888i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f111889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f111890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f111891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f111892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f111893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f111894f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f111895g;

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.f111888i;
            }

            private a() {
            }
        }

        public c(String prefix, String suffix, boolean z11, int i11) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.f111889a = prefix;
            this.f111890b = suffix;
            this.f111891c = z11;
            this.f111892d = i11;
            boolean z12 = prefix.length() == 0 && suffix.length() == 0;
            this.f111893e = z12;
            this.f111894f = z12 && i11 == 1;
            this.f111895g = e.b(prefix) || e.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f111889a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f111890b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f111891c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f111892d);
            return sb2;
        }

        public final boolean c() {
            return this.f111895g;
        }

        public final String d() {
            return this.f111889a;
        }

        public final String e() {
            return this.f111890b;
        }

        public final boolean f() {
            return this.f111893e;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C1351a c1351a = a.f111876j;
        a aVarA = c1351a.a();
        c.a aVar = c.f111887h;
        f111871e = new d(false, aVarA, aVar.a());
        f111872f = new d(true, c1351a.a(), aVar.a());
    }

    public d(boolean z11, a bytes, c number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f111873a = z11;
        this.f111874b = bytes;
        this.f111875c = number;
    }

    public final c b() {
        return this.f111875c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f111873a);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f111874b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f111875c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
