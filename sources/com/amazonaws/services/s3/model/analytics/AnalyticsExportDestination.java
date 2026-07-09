package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AnalyticsExportDestination implements Serializable {
    private AnalyticsS3BucketDestination s3BucketDestination;

    public AnalyticsS3BucketDestination getS3BucketDestination() {
        return this.s3BucketDestination;
    }

    public void setS3BucketDestination(AnalyticsS3BucketDestination analyticsS3BucketDestination) {
        this.s3BucketDestination = analyticsS3BucketDestination;
    }

    public AnalyticsExportDestination withS3BucketDestination(AnalyticsS3BucketDestination analyticsS3BucketDestination) {
        setS3BucketDestination(analyticsS3BucketDestination);
        return this;
    }
}
