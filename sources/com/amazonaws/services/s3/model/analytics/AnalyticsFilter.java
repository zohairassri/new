package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AnalyticsFilter implements Serializable {
    private AnalyticsFilterPredicate predicate;

    public AnalyticsFilter() {
    }

    public AnalyticsFilterPredicate getPredicate() {
        return this.predicate;
    }

    public void setPredicate(AnalyticsFilterPredicate analyticsFilterPredicate) {
        this.predicate = analyticsFilterPredicate;
    }

    public AnalyticsFilter withPredicate(AnalyticsFilterPredicate analyticsFilterPredicate) {
        setPredicate(analyticsFilterPredicate);
        return this;
    }

    public AnalyticsFilter(AnalyticsFilterPredicate analyticsFilterPredicate) {
        this.predicate = analyticsFilterPredicate;
    }
}
