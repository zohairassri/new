package com.theathletic.analytics.repository;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/theathletic/analytics/repository/AnalyticsEventDao;", "", "<init>", "()V", "", "Lcom/theathletic/analytics/data/local/AnalyticsEvent;", "events", "", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, "(Ljava/util/List;Laf0/c;)Ljava/lang/Object;", "", "batchSize", QueryKeys.SUBDOMAIN, "(ILaf0/c;)Ljava/lang/Object;", "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Laf0/c;)Ljava/lang/Object;", "", "timeSpan", QueryKeys.PAGE_LOAD_TIME, "(Ljava/lang/String;Laf0/c;)Ljava/lang/Object;", "a", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AnalyticsEventDao {
    public static final int $stable = 0;

    public abstract Object a(List list, af0.c cVar);

    public abstract Object b(String str, af0.c cVar);

    public abstract Object c(af0.c cVar);

    public abstract Object d(int i11, af0.c cVar);

    public abstract Object e(List list, af0.c cVar);
}
