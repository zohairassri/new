package com.theathletic.tournament.ui.discuss;

import com.amazonaws.services.s3.internal.Constants;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.analytics.data.ClickSource;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/theathletic/tournament/ui/discuss/a;", "", "", QueryKeys.ACCOUNT_ID, "()V", "", "commentLink", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "(Ljava/lang/String;)V", Constants.URL_ENCODING, "a", "Lcom/theathletic/analytics/data/ClickSource;", "clickSource", QueryKeys.VISIT_FREQUENCY, "(Lcom/theathletic/analytics/data/ClickSource;)V", QueryKeys.PAGE_LOAD_TIME, QueryKeys.SUBDOMAIN, QueryKeys.TIME_ON_VIEW_IN_MINUTES, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a(String url);

    void b();

    void c();

    void d();

    void e(String commentLink);

    void f(ClickSource clickSource);

    void g();
}
