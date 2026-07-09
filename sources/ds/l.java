package ds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f90442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f90443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ l[] f90444c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum a extends l {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "in-app";
        }
    }

    static {
        a aVar = new a("IN_APP", 0);
        f90442a = aVar;
        l lVar = new l("INBOX", 1) { // from class: ds.l.b
            {
                a aVar2 = null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "inbox";
            }
        };
        f90443b = lVar;
        f90444c = new l[]{aVar, lVar};
    }

    private l(String str, int i11) {
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f90444c.clone();
    }

    /* synthetic */ l(String str, int i11, a aVar) {
        this(str, i11);
    }
}
