package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f44565c = new s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f44566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f44567b;

    private s(Long l11, TimeZone timeZone) {
        this.f44566a = l11;
        this.f44567b = timeZone;
    }

    static s c() {
        return f44565c;
    }

    Calendar a() {
        return b(this.f44567b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l11 = this.f44566a;
        if (l11 != null) {
            calendar.setTimeInMillis(l11.longValue());
        }
        return calendar;
    }
}
