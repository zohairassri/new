package j3;

import i3.n;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f104919e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104920f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f104921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f104922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f104923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BreakIterator f104924d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i11) {
            int type = Character.getType(i11);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private a() {
        }
    }

    public g(CharSequence charSequence, int i11, int i12, Locale locale) {
        this.f104921a = charSequence;
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            n3.a.a("input start index is outside the CharSequence");
        }
        if (!(i12 >= 0 && i12 <= charSequence.length())) {
            n3.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f104924d = wordInstance;
        this.f104922b = Math.max(0, i11 - 50);
        this.f104923c = Math.min(charSequence.length(), i12 + 50);
        wordInstance.setText(new n(charSequence, i11, i12));
    }

    private final void a(int i11) {
        int i12 = this.f104922b;
        boolean z11 = false;
        if (i11 <= this.f104923c && i12 <= i11) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        n3.a.a("Invalid offset: " + i11 + ". Valid range is [" + this.f104922b + " , " + this.f104923c + ']');
    }

    private final int b(int i11, boolean z11) {
        a(i11);
        if (l(i11)) {
            return (!j(i11) || (h(i11) && z11)) ? q(i11) : i11;
        }
        if (h(i11)) {
            return q(i11);
        }
        return -1;
    }

    private final int c(int i11, boolean z11) {
        a(i11);
        if (h(i11)) {
            return (!j(i11) || (l(i11) && z11)) ? p(i11) : i11;
        }
        if (l(i11)) {
            return p(i11);
        }
        return -1;
    }

    private final boolean h(int i11) {
        int i12 = this.f104922b + 1;
        if (i11 > this.f104923c || i12 > i11) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.f104921a, i11))) {
            return true;
        }
        int i13 = i11 - 1;
        if (Character.isSurrogate(this.f104921a.charAt(i13))) {
            return true;
        }
        if (!androidx.emoji2.text.e.k()) {
            return false;
        }
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        return eVarC.g() == 1 && eVarC.f(this.f104921a, i13) != -1;
    }

    private final boolean j(int i11) {
        a(i11);
        if (!this.f104924d.isBoundary(i11)) {
            return false;
        }
        if (l(i11) && l(i11 - 1) && l(i11 + 1)) {
            return false;
        }
        return i11 <= 0 || i11 >= this.f104921a.length() - 1 || !(k(i11) || k(i11 + 1));
    }

    private final boolean k(int i11) {
        int i12 = i11 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.f104921a.charAt(i12));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.areEqual(unicodeBlockOf, unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.f104921a.charAt(i11)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.areEqual(Character.UnicodeBlock.of(this.f104921a.charAt(i11)), unicodeBlock) && Intrinsics.areEqual(Character.UnicodeBlock.of(this.f104921a.charAt(i12)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean l(int i11) {
        int i12 = this.f104922b;
        if (i11 >= this.f104923c || i12 > i11) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.f104921a, i11)) || Character.isSurrogate(this.f104921a.charAt(i11))) {
            return true;
        }
        if (!androidx.emoji2.text.e.k()) {
            return false;
        }
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        return eVarC.g() == 1 && eVarC.f(this.f104921a, i11) != -1;
    }

    private final boolean n(int i11) {
        return !m(i11) && i(i11);
    }

    private final boolean o(int i11) {
        return m(i11) && !i(i11);
    }

    public final int d(int i11) {
        return c(i11, true);
    }

    public final int e(int i11) {
        return b(i11, true);
    }

    public final int f(int i11) {
        a(i11);
        while (i11 != -1 && !o(i11)) {
            i11 = q(i11);
        }
        return i11;
    }

    public final int g(int i11) {
        a(i11);
        while (i11 != -1 && !n(i11)) {
            i11 = p(i11);
        }
        return i11;
    }

    public final boolean i(int i11) {
        int i12 = this.f104922b + 1;
        if (i11 > this.f104923c || i12 > i11) {
            return false;
        }
        return f104919e.a(Character.codePointBefore(this.f104921a, i11));
    }

    public final boolean m(int i11) {
        int i12 = this.f104922b;
        if (i11 >= this.f104923c || i12 > i11) {
            return false;
        }
        return f104919e.a(Character.codePointAt(this.f104921a, i11));
    }

    public final int p(int i11) {
        a(i11);
        int iFollowing = this.f104924d.following(i11);
        return (l(iFollowing + (-1)) && l(iFollowing) && !k(iFollowing)) ? p(iFollowing) : iFollowing;
    }

    public final int q(int i11) {
        a(i11);
        int iPreceding = this.f104924d.preceding(i11);
        return (l(iPreceding) && h(iPreceding) && !k(iPreceding)) ? q(iPreceding) : iPreceding;
    }
}
