package v4;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4.d f132482a = new C1838e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v4.d f132483b = new C1838e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v4.d f132484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v4.d f132485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v4.d f132486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v4.d f132487f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f132488b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f132489a;

        private a(boolean z11) {
            this.f132489a = z11;
        }

        @Override // v4.e.c
        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            boolean z11 = false;
            while (i11 < i13) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i11)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i11++;
                        z11 = z11;
                    } else if (!this.f132489a) {
                        return 1;
                    }
                } else if (this.f132489a) {
                    return 0;
                }
                z11 = true;
                i11++;
                z11 = z11;
            }
            if (z11) {
                return this.f132489a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f132490a = new b();

        private b() {
        }

        @Override // v4.e.c
        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            int iB = 2;
            while (i11 < i13 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i11)));
                i11++;
            }
            return iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface c {
        int a(CharSequence charSequence, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static abstract class d implements v4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f132491a;

        d(c cVar) {
            this.f132491a = cVar;
        }

        private boolean b(CharSequence charSequence, int i11, int i12) {
            int iA = this.f132491a.a(charSequence, i11, i12);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // v4.d
        public boolean isRtl(CharSequence charSequence, int i11, int i12) {
            if (charSequence == null || i11 < 0 || i12 < 0 || charSequence.length() - i12 < i11) {
                throw new IllegalArgumentException();
            }
            return this.f132491a == null ? a() : b(charSequence, i11, i12);
        }
    }

    /* JADX INFO: renamed from: v4.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C1838e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f132492b;

        C1838e(c cVar, boolean z11) {
            super(cVar);
            this.f132492b = z11;
        }

        @Override // v4.e.d
        protected boolean a() {
            return this.f132492b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f132493b = new f();

        f() {
            super(null);
        }

        @Override // v4.e.d
        protected boolean a() {
            return v4.f.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f132490a;
        f132484c = new C1838e(bVar, false);
        f132485d = new C1838e(bVar, true);
        f132486e = new C1838e(a.f132488b, false);
        f132487f = f.f132493b;
    }

    static int a(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                return 0;
            }
            switch (i11) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
