package v4;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Spannable {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f132477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f132478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f132479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f132480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f132481e;

        public a(PrecomputedText.Params params) {
            this.f132477a = params.getTextPaint();
            this.f132478b = params.getTextDirection();
            this.f132479c = params.getBreakStrategy();
            this.f132480d = params.getHyphenationFrequency();
            this.f132481e = params;
        }

        public boolean a(a aVar) {
            if (this.f132479c == aVar.b() && this.f132480d == aVar.c() && this.f132477a.getTextSize() == aVar.e().getTextSize() && this.f132477a.getTextScaleX() == aVar.e().getTextScaleX() && this.f132477a.getTextSkewX() == aVar.e().getTextSkewX() && this.f132477a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f132477a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f132477a.getFlags() == aVar.e().getFlags() && this.f132477a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f132477a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f132477a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f132479c;
        }

        public int c() {
            return this.f132480d;
        }

        public TextDirectionHeuristic d() {
            return this.f132478b;
        }

        public TextPaint e() {
            return this.f132477a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f132478b == aVar.d();
        }

        public int hashCode() {
            return w4.c.b(Float.valueOf(this.f132477a.getTextSize()), Float.valueOf(this.f132477a.getTextScaleX()), Float.valueOf(this.f132477a.getTextSkewX()), Float.valueOf(this.f132477a.getLetterSpacing()), Integer.valueOf(this.f132477a.getFlags()), this.f132477a.getTextLocales(), this.f132477a.getTypeface(), Boolean.valueOf(this.f132477a.isElegantTextHeight()), this.f132478b, Integer.valueOf(this.f132479c), Integer.valueOf(this.f132480d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f132477a.getTextSize());
            sb2.append(", textScaleX=" + this.f132477a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f132477a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f132477a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f132477a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f132477a.getTextLocales());
            sb2.append(", typeface=" + this.f132477a.getTypeface());
            sb2.append(", variationSettings=" + this.f132477a.getFontVariationSettings());
            sb2.append(", textDir=" + this.f132478b);
            sb2.append(", breakStrategy=" + this.f132479c);
            sb2.append(", hyphenationFrequency=" + this.f132480d);
            sb2.append("}");
            return sb2.toString();
        }
    }
}
