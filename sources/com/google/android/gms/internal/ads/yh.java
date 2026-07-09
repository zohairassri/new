package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.Headers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class yh {
    public static rg a(ch chVar) {
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        long jB;
        long j15;
        long j16;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = chVar.f24572c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jB2 = str != null ? b(str) : 0L;
        String str2 = (String) map.get(Headers.CACHE_CONTROL);
        int i11 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z11 = false;
            j12 = 0;
            j13 = 0;
            while (i11 < strArrSplit.length) {
                String strTrim = strArrSplit[i11].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j13 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z11 = true;
                }
                i11++;
            }
            j11 = 0;
            i11 = 1;
        } else {
            j11 = 0;
            z11 = false;
            j12 = 0;
            j13 = 0;
        }
        String str3 = (String) map.get(Headers.EXPIRES);
        long jB3 = str3 != null ? b(str3) : j11;
        String str4 = (String) map.get(Headers.LAST_MODIFIED);
        if (str4 != null) {
            j14 = jCurrentTimeMillis;
            jB = b(str4);
        } else {
            j14 = jCurrentTimeMillis;
            jB = j11;
        }
        String str5 = (String) map.get(Headers.ETAG);
        if (i11 != 0) {
            long j17 = (j13 * 1000) + j14;
            j16 = z11 ? j17 : (j12 * 1000) + j17;
            j15 = j17;
        } else {
            j15 = (jB2 <= j11 || jB3 < jB2) ? j11 : (jB3 - jB2) + j14;
            j16 = j15;
        }
        rg rgVar = new rg();
        rgVar.f34180a = chVar.f24571b;
        rgVar.f34181b = str5;
        rgVar.f34185f = j15;
        rgVar.f34184e = j16;
        rgVar.f34182c = jB2;
        rgVar.f34183d = jB;
        rgVar.f34186g = map;
        rgVar.f34187h = chVar.f24573d;
        return rgVar;
    }

    public static long b(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e11) {
            if ("0".equals(str) || "-1".equals(str)) {
                nh.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            nh.d(e11, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String c(long j11) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j11));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
