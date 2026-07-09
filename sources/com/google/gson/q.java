package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f47284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f47285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ q[] f47286c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum a extends q {
        a(String str, int i11) {
            super(str, i11, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f47284a = aVar;
        q qVar = new q("STRING", 1) { // from class: com.google.gson.q.b
            {
                a aVar2 = null;
            }
        };
        f47285b = qVar;
        f47286c = new q[]{aVar, qVar};
    }

    private q(String str, int i11) {
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f47286c.clone();
    }

    /* synthetic */ q(String str, int i11, a aVar) {
        this(str, i11);
    }
}
