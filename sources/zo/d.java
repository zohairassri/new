package zo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d implements p {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class a extends d {
        a() {
        }

        @Override // zo.p
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f142460a;

        b(char c11) {
            this.f142460a = c11;
        }

        @Override // zo.d
        public boolean e(char c11) {
            return c11 == this.f142460a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f142460a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f142461a;

        c(String str) {
            this.f142461a = (String) o.k(str);
        }

        public final String toString() {
            return this.f142461a;
        }
    }

    /* JADX INFO: renamed from: zo.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class C2038d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f142462b = new C2038d();

        private C2038d() {
            super("CharMatcher.none()");
        }

        @Override // zo.d
        public int c(CharSequence charSequence, int i11) {
            o.m(i11, charSequence.length());
            return -1;
        }

        @Override // zo.d
        public boolean e(char c11) {
            return false;
        }
    }

    protected d() {
    }

    public static d d(char c11) {
        return new b(c11);
    }

    public static d f() {
        return C2038d.f142462b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c11) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
            c11 = (char) (c11 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        o.m(i11, length);
        while (i11 < length) {
            if (e(charSequence.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public abstract boolean e(char c11);
}
