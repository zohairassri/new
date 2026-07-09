package com.iterable.iterableapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f47800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ m0[] f47801b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    enum a extends m0 {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "API";
        }
    }

    static {
        a aVar = new a("API", 0);
        f47800a = aVar;
        f47801b = new m0[]{aVar};
    }

    private m0(String str, int i11) {
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f47801b.clone();
    }

    /* synthetic */ m0(String str, int i11, a aVar) {
        this(str, i11);
    }
}
