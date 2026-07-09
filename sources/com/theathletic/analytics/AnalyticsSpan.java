package com.theathletic.analytics;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.theathletic.video.component.data.VideoRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/theathletic/analytics/AnalyticsSpan;", "", "", TransferTable.COLUMN_KEY, VideoRepository.XML_ATTR_VALUE, "", QueryKeys.TIME_ON_VIEW_IN_MINUTES, "(Ljava/lang/String;Ljava/lang/Object;)V", "", "throwable", QueryKeys.PAGE_LOAD_TIME, "(Ljava/lang/Throwable;)V", "a", "()V", "analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsSpan {
    void a();

    void b(Throwable throwable);

    void c(String key, Object value);
}
