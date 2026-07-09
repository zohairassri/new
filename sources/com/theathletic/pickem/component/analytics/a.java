package com.theathletic.pickem.component.analytics;

import com.chartbeat.androidsdk.QueryKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000f\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0010\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH¦@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\bH¦@¢\u0006\u0004\b\u0019\u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b\u001b\u0010\u000bJ \u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b\u001d\u0010\u0018J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b\u001e\u0010\u000bJ\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b\u001f\u0010\u000bJ\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b \u0010\u000bJ \u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b&\u0010\u000bJ \u0010'\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b'\u0010\u0018J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b(\u0010\u000bJ \u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b*\u0010\u0018J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b+\u0010\u000bJ \u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b,\u0010\u0018J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b-\u0010\u000bJ \u0010.\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH¦@¢\u0006\u0004\b.\u0010\u0018¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/theathletic/pickem/component/analytics/a;", "", "", QueryKeys.INTERNAL_REFERRER, "(Laf0/c;)Ljava/lang/Object;", "l", QueryKeys.IS_NEW_USER, QueryKeys.VIEW_ID, "", "leagueId", QueryKeys.HOST, "(Ljava/lang/String;Laf0/c;)Ljava/lang/Object;", "B", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.TOKEN, "a", QueryKeys.USER_ID, "gameId", "region", "gameState", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laf0/c;)Ljava/lang/Object;", "teamId", "A", "(Ljava/lang/String;Ljava/lang/String;Laf0/c;)Ljava/lang/Object;", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "leagueCode", QueryKeys.CONTENT_HEIGHT, "date", QueryKeys.DOCUMENT_WIDTH, QueryKeys.SCROLL_WINDOW_HEIGHT, "s", QueryKeys.VISIT_FREQUENCY, "", "currentPage", QueryKeys.ACCOUNT_ID, "(ILjava/lang/String;Laf0/c;)Ljava/lang/Object;", "z", QueryKeys.EXTERNAL_REFERRER, QueryKeys.PAGE_LOAD_TIME, QueryKeys.MAX_SCROLL_DEPTH, "shareType", QueryKeys.VIEW_TITLE, "k", QueryKeys.SUBDOMAIN, QueryKeys.DECAY, "x", "component_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object A(String str, String str2, af0.c cVar);

    Object B(af0.c cVar);

    Object a(String str, af0.c cVar);

    Object b(String str, String str2, af0.c cVar);

    Object c(String str, af0.c cVar);

    Object d(String str, String str2, af0.c cVar);

    Object e(af0.c cVar);

    Object f(String str, af0.c cVar);

    Object g(int i11, String str, af0.c cVar);

    Object h(String str, af0.c cVar);

    Object i(String str, String str2, af0.c cVar);

    Object j(String str, af0.c cVar);

    Object k(String str, af0.c cVar);

    Object l(af0.c cVar);

    Object m(String str, af0.c cVar);

    Object n(af0.c cVar);

    Object o(String str, String str2, af0.c cVar);

    Object p(af0.c cVar);

    Object q(String str, String str2, String str3, af0.c cVar);

    Object r(String str, af0.c cVar);

    Object s(String str, af0.c cVar);

    Object t(af0.c cVar);

    Object u(String str, af0.c cVar);

    Object v(af0.c cVar);

    Object w(String str, af0.c cVar);

    Object x(String str, String str2, af0.c cVar);

    Object y(String str, af0.c cVar);

    Object z(int i11, String str, af0.c cVar);
}
