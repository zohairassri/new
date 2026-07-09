package ds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f90438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f90439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f90440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ k[] f90441d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum a extends k {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "inbox-swipe";
        }
    }

    static {
        a aVar = new a("INBOX_SWIPE", 0);
        f90438a = aVar;
        k kVar = new k("DELETE_BUTTON", 1) { // from class: ds.k.b
            {
                a aVar2 = null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "delete-button";
            }
        };
        f90439b = kVar;
        k kVar2 = new k("OTHER", 2) { // from class: ds.k.c
            {
                a aVar2 = null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "other";
            }
        };
        f90440c = kVar2;
        f90441d = new k[]{aVar, kVar, kVar2};
    }

    private k(String str, int i11) {
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f90441d.clone();
    }

    /* synthetic */ k(String str, int i11, a aVar) {
        this(str, i11);
    }
}
