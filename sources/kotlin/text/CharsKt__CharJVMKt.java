package kotlin.text;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "", QueryKeys.PAGE_LOAD_TIME, "(C)Z", "Ljava/util/Locale;", "locale", "", QueryKeys.SUBDOMAIN, "(CLjava/util/Locale;)Ljava/lang/String;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "char", "", "radix", "a", "(CI)I", "checkRadix", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    public static final int a(char c11, int i11) {
        return Character.digit((int) c11, i11);
    }

    public static boolean b(char c11) {
        return Character.isWhitespace(c11) || Character.isSpaceChar(c11);
    }

    public static String c(char c11, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strD = d(c11, locale);
        if (strD.length() <= 1) {
            String strValueOf = String.valueOf(c11);
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.areEqual(strD, upperCase)) {
                return String.valueOf(Character.toTitleCase(c11));
            }
        } else if (c11 != 329) {
            char cCharAt = strD.charAt(0);
            Intrinsics.checkNotNull(strD, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strD.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strD;
    }

    public static int checkRadix(int i11) {
        if (2 <= i11 && i11 < 37) {
            return i11;
        }
        throw new IllegalArgumentException("radix " + i11 + " was not in valid range " + new IntRange(2, 36));
    }

    public static final String d(char c11, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c11);
        Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
