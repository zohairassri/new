package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class q implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7976a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spannable f7977b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        b() {
        }

        abstract boolean a(CharSequence charSequence);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.q.b
        boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof v4.c);
        }
    }

    q(Spannable spannable) {
        this.f7977b = spannable;
    }

    private void a() {
        Spannable spannable = this.f7977b;
        if (!this.f7976a && c().a(spannable)) {
            this.f7977b = new SpannableString(spannable);
        }
        this.f7976a = true;
    }

    static b c() {
        return new c();
    }

    Spannable b() {
        return this.f7977b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.f7977b.charAt(i11);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f7977b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f7977b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f7977b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f7977b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f7977b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i11, int i12, Class cls) {
        return this.f7977b.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f7977b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f7977b.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f7977b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i11, int i12, int i13) {
        a();
        this.f7977b.setSpan(obj, i11, i12, i13);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return this.f7977b.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f7977b.toString();
    }

    q(CharSequence charSequence) {
        this.f7977b = new SpannableString(charSequence);
    }
}
