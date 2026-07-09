package hp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f102538a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f102539b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: hp.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class EnumC1214b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC1214b f102540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC1214b f102541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC1214b[] f102542c;

        /* JADX INFO: renamed from: hp.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum a extends EnumC1214b {
            a(String str, int i11) {
                super(str, i11);
            }

            @Override // hp.b.EnumC1214b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: hp.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        enum C1215b extends EnumC1214b {
            C1215b(String str, int i11) {
                super(str, i11);
            }

            @Override // hp.b.EnumC1214b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f102540a = aVar;
            C1215b c1215b = new C1215b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f102541b = c1215b;
            f102542c = new EnumC1214b[]{aVar, c1215b};
        }

        private EnumC1214b(String str, int i11) {
        }

        public static EnumC1214b valueOf(String str) {
            return (EnumC1214b) Enum.valueOf(EnumC1214b.class, str);
        }

        public static EnumC1214b[] values() {
            return (EnumC1214b[]) f102542c.clone();
        }

        public abstract boolean a();
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f102538a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return hp.a.a() || f102539b.get();
    }
}
