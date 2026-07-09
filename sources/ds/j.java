package ds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f90434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f90435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f90436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f90437d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum a extends j {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "back";
        }
    }

    static {
        a aVar = new a("BACK", 0);
        f90434a = aVar;
        j jVar = new j("LINK", 1) { // from class: ds.j.b
            {
                a aVar2 = null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "link";
            }
        };
        f90435b = jVar;
        j jVar2 = new j("OTHER", 2) { // from class: ds.j.c
            {
                a aVar2 = null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "other";
            }
        };
        f90436c = jVar2;
        f90437d = new j[]{aVar, jVar, jVar2};
    }

    private j(String str, int i11) {
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f90437d.clone();
    }

    /* synthetic */ j(String str, int i11, a aVar) {
        this(str, i11);
    }
}
