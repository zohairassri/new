package com.theathletic.analytics;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/text/SimpleDateFormat;", "impressionDateFormat", "Ljava/text/SimpleDateFormat;", "a", "()Ljava/text/SimpleDateFormat;", "mobile_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AnalyticsTrackerImplKt {

    @NotNull
    private static final SimpleDateFormat impressionDateFormat;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        impressionDateFormat = simpleDateFormat;
    }

    public static final SimpleDateFormat a() {
        return impressionDateFormat;
    }
}
