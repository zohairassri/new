package v4;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final d f132460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f132461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f132462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final a f132463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final a f132464h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f132465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f132466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f132467c;

    /* JADX INFO: renamed from: v4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1837a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f132468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f132469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f132470c;

        public C1837a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z11) {
            return z11 ? a.f132464h : a.f132463g;
        }

        private void c(boolean z11) {
            this.f132468a = z11;
            this.f132470c = a.f132460d;
            this.f132469b = 2;
        }

        public a a() {
            return (this.f132469b == 2 && this.f132470c == a.f132460d) ? b(this.f132468a) : new a(this.f132468a, this.f132469b, this.f132470c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f132471f = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f132472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f132473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f132474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f132475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f132476e;

        static {
            for (int i11 = 0; i11 < 1792; i11++) {
                f132471f[i11] = Character.getDirectionality(i11);
            }
        }

        b(CharSequence charSequence, boolean z11) {
            this.f132472a = charSequence;
            this.f132473b = z11;
            this.f132474c = charSequence.length();
        }

        private static byte c(char c11) {
            return c11 < 1792 ? f132471f[c11] : Character.getDirectionality(c11);
        }

        private byte f() {
            char cCharAt;
            int i11 = this.f132475d;
            do {
                int i12 = this.f132475d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f132472a;
                int i13 = i12 - 1;
                this.f132475d = i13;
                cCharAt = charSequence.charAt(i13);
                this.f132476e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f132475d = i11;
            this.f132476e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i11 = this.f132475d;
                if (i11 >= this.f132474c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f132472a;
                this.f132475d = i11 + 1;
                cCharAt = charSequence.charAt(i11);
                this.f132476e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i11 = this.f132475d;
            while (true) {
                int i12 = this.f132475d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f132472a;
                int i13 = i12 - 1;
                this.f132475d = i13;
                char cCharAt2 = charSequence.charAt(i13);
                this.f132476e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i14 = this.f132475d;
                        if (i14 > 0) {
                            CharSequence charSequence2 = this.f132472a;
                            int i15 = i14 - 1;
                            this.f132475d = i15;
                            cCharAt = charSequence2.charAt(i15);
                            this.f132476e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f132475d = i11;
            this.f132476e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i11 = this.f132475d;
            while (true) {
                int i12 = this.f132475d;
                if (i12 >= this.f132474c) {
                    this.f132475d = i11;
                    this.f132476e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f132472a;
                this.f132475d = i12 + 1;
                char cCharAt2 = charSequence.charAt(i12);
                this.f132476e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f132475d;
                        if (i13 < this.f132474c) {
                            CharSequence charSequence2 = this.f132472a;
                            this.f132475d = i13 + 1;
                            cCharAt = charSequence2.charAt(i13);
                            this.f132476e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f132472a.charAt(this.f132475d - 1);
            this.f132476e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f132472a, this.f132475d);
                this.f132475d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f132475d--;
            byte bC = c(this.f132476e);
            if (this.f132473b) {
                char c11 = this.f132476e;
                if (c11 == '>') {
                    return h();
                }
                if (c11 == ';') {
                    return f();
                }
            }
            return bC;
        }

        byte b() {
            char cCharAt = this.f132472a.charAt(this.f132475d);
            this.f132476e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f132472a, this.f132475d);
                this.f132475d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f132475d++;
            byte bC = c(this.f132476e);
            if (this.f132473b) {
                char c11 = this.f132476e;
                if (c11 == '<') {
                    return i();
                }
                if (c11 == '&') {
                    return g();
                }
            }
            return bC;
        }

        int d() {
            this.f132475d = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (this.f132475d < this.f132474c && i11 == 0) {
                byte b11 = b();
                if (b11 != 0) {
                    if (b11 == 1 || b11 == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                    } else if (b11 != 9) {
                        switch (b11) {
                            case 14:
                            case 15:
                                i13++;
                                i12 = -1;
                                continue;
                            case 16:
                            case 17:
                                i13++;
                                i12 = 1;
                                continue;
                            case 18:
                                i13--;
                                i12 = 0;
                                continue;
                        }
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
            if (i11 == 0) {
                return 0;
            }
            if (i12 != 0) {
                return i12;
            }
            while (this.f132475d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i11 == i13) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i11 == i13) {
                            return 1;
                        }
                        break;
                    case 18:
                        i13++;
                        continue;
                }
                i13--;
            }
            return 0;
        }

        int e() {
            this.f132475d = this.f132474c;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                while (this.f132475d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i11 == 0) {
                            return -1;
                        }
                        if (i12 == 0) {
                            break;
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                        if (i12 == 0) {
                            break;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i12 == i11) {
                                    return -1;
                                }
                                i11--;
                                break;
                            case 16:
                            case 17:
                                if (i12 == i11) {
                                    return 1;
                                }
                                i11--;
                                break;
                            case 18:
                                i11++;
                                break;
                            default:
                                if (i12 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f132484c;
        f132460d = dVar;
        f132461e = Character.toString((char) 8206);
        f132462f = Character.toString((char) 8207);
        f132463g = new a(false, 2, dVar);
        f132464h = new a(true, 2, dVar);
    }

    a(boolean z11, int i11, d dVar) {
        this.f132465a = z11;
        this.f132466b = i11;
        this.f132467c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C1837a().a();
    }

    static boolean e(Locale locale) {
        return f.a(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f132465a || !(zIsRtl || b(charSequence) == 1)) ? this.f132465a ? (!zIsRtl || b(charSequence) == -1) ? f132462f : "" : "" : f132461e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f132465a || !(zIsRtl || a(charSequence) == 1)) ? this.f132465a ? (!zIsRtl || a(charSequence) == -1) ? f132462f : "" : "" : f132461e;
    }

    public boolean d() {
        return (this.f132466b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f132467c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z11) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z11) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zIsRtl ? e.f132483b : e.f132482a));
        }
        if (zIsRtl != this.f132465a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z11) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zIsRtl ? e.f132483b : e.f132482a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f132467c, true);
    }

    public String k(String str, d dVar, boolean z11) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z11).toString();
    }
}
