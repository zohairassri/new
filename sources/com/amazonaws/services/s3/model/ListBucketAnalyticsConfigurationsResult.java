package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ListBucketAnalyticsConfigurationsResult implements Serializable {
    private List<AnalyticsConfiguration> analyticsConfigurationList;
    private String continuationToken;
    private boolean isTruncated;
    private String nextContinuationToken;

    public List<AnalyticsConfiguration> getAnalyticsConfigurationList() {
        return this.analyticsConfigurationList;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    public boolean isTruncated() {
        return this.isTruncated;
    }

    public void setAnalyticsConfigurationList(List<AnalyticsConfiguration> list) {
        this.analyticsConfigurationList = list;
    }

    public void setContinuationToken(String str) {
        this.continuationToken = str;
    }

    public void setNextContinuationToken(String str) {
        this.nextContinuationToken = str;
    }

    public void setTruncated(boolean z11) {
        this.isTruncated = z11;
    }

    public ListBucketAnalyticsConfigurationsResult withAnalyticsConfigurationList(List<AnalyticsConfiguration> list) {
        setAnalyticsConfigurationList(list);
        return this;
    }

    public ListBucketAnalyticsConfigurationsResult withContinuationToken(String str) {
        setContinuationToken(str);
        return this;
    }

    public ListBucketAnalyticsConfigurationsResult withNextContinuationToken(String str) {
        setNextContinuationToken(str);
        return this;
    }

    public ListBucketAnalyticsConfigurationsResult withTruncated(boolean z11) {
        setTruncated(z11);
        return this;
    }
}
