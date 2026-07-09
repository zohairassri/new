package n6;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.s;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f117423a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f117424b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j11, long j12) {
        if (j11 == 0 && j12 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j11);
        sb2.append("-");
        if (j12 != -1) {
            sb2.append((j11 + j12) - 1);
        }
        return sb2.toString();
    }

    public static long b(String str, String str2) {
        long j11;
        if (TextUtils.isEmpty(str)) {
            j11 = -1;
        } else {
            try {
                j11 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                s.d("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j11 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j11;
        }
        Matcher matcher = f117423a.matcher(str2);
        if (!matcher.matches()) {
            return j11;
        }
        try {
            long j12 = (Long.parseLong((String) k6.a.e(matcher.group(2))) - Long.parseLong((String) k6.a.e(matcher.group(1)))) + 1;
            if (j11 < 0) {
                return j12;
            }
            if (j11 == j12) {
                return j11;
            }
            s.i("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j11, j12);
        } catch (NumberFormatException unused2) {
            s.d("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j11;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f117424b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) k6.a.e(matcher.group(1)));
        }
        return -1L;
    }
}
