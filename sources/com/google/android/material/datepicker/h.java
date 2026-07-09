package com.google.android.material.datepicker;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class h {
    static w4.d a(Long l11, Long l12) {
        return b(l11, l12, null);
    }

    static w4.d b(Long l11, Long l12, SimpleDateFormat simpleDateFormat) {
        if (l11 == null && l12 == null) {
            return w4.d.a(null, null);
        }
        if (l11 == null) {
            return w4.d.a(null, d(l12.longValue(), simpleDateFormat));
        }
        if (l12 == null) {
            return w4.d.a(d(l11.longValue(), simpleDateFormat), null);
        }
        Calendar calendarK = t.k();
        Calendar calendarM = t.m();
        calendarM.setTimeInMillis(l11.longValue());
        Calendar calendarM2 = t.m();
        calendarM2.setTimeInMillis(l12.longValue());
        if (simpleDateFormat != null) {
            return w4.d.a(simpleDateFormat.format(new Date(l11.longValue())), simpleDateFormat.format(new Date(l12.longValue())));
        }
        return calendarM.get(1) == calendarM2.get(1) ? calendarM.get(1) == calendarK.get(1) ? w4.d.a(g(l11.longValue(), Locale.getDefault()), g(l12.longValue(), Locale.getDefault())) : w4.d.a(g(l11.longValue(), Locale.getDefault()), n(l12.longValue(), Locale.getDefault())) : w4.d.a(n(l11.longValue(), Locale.getDefault()), n(l12.longValue(), Locale.getDefault()));
    }

    static String c(long j11) {
        return d(j11, null);
    }

    static String d(long j11, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j11)) : q(j11) ? f(j11) : m(j11);
    }

    static String e(Context context, long j11, boolean z11, boolean z12, boolean z13) {
        String strJ = j(j11);
        if (z11) {
            strJ = String.format(context.getString(tn.k.mtrl_picker_today_description), strJ);
        }
        return z12 ? String.format(context.getString(tn.k.mtrl_picker_start_date_description), strJ) : z13 ? String.format(context.getString(tn.k.mtrl_picker_end_date_description), strJ) : strJ;
    }

    static String f(long j11) {
        return g(j11, Locale.getDefault());
    }

    static String g(long j11, Locale locale) {
        return t.b(locale).format(new Date(j11));
    }

    static String h(long j11) {
        return i(j11, Locale.getDefault());
    }

    static String i(long j11, Locale locale) {
        return t.h(locale).format(new Date(j11));
    }

    static String j(long j11) {
        return q(j11) ? h(j11) : o(j11);
    }

    static String k(Context context, int i11) {
        return t.k().get(1) == i11 ? String.format(context.getString(tn.k.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(tn.k.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
    }

    static String l(long j11) {
        return t.p(Locale.getDefault()).format(new Date(j11));
    }

    static String m(long j11) {
        return n(j11, Locale.getDefault());
    }

    static String n(long j11, Locale locale) {
        return t.o(locale).format(new Date(j11));
    }

    static String o(long j11) {
        return p(j11, Locale.getDefault());
    }

    static String p(long j11, Locale locale) {
        return t.q(locale).format(new Date(j11));
    }

    private static boolean q(long j11) {
        Calendar calendarK = t.k();
        Calendar calendarM = t.m();
        calendarM.setTimeInMillis(j11);
        return calendarK.get(1) == calendarM.get(1);
    }
}
