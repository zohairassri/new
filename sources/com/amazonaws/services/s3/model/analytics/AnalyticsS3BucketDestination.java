package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class AnalyticsS3BucketDestination implements Serializable {
    private String bucketAccountId;
    private String bucketArn;
    private String format;
    private String prefix;

    public String getBucketAccountId() {
        return this.bucketAccountId;
    }

    public String getBucketArn() {
        return this.bucketArn;
    }

    public String getFormat() {
        return this.format;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setBucketAccountId(String str) {
        this.bucketAccountId = str;
    }

    public void setBucketArn(String str) {
        this.bucketArn = str;
    }

    public void setFormat(AnalyticsS3ExportFileFormat analyticsS3ExportFileFormat) {
        if (analyticsS3ExportFileFormat == null) {
            setFormat((String) null);
        } else {
            setFormat(analyticsS3ExportFileFormat.toString());
        }
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public AnalyticsS3BucketDestination withBucketAccountId(String str) {
        setBucketAccountId(str);
        return this;
    }

    public AnalyticsS3BucketDestination withBucketArn(String str) {
        setBucketArn(str);
        return this;
    }

    public AnalyticsS3BucketDestination withFormat(AnalyticsS3ExportFileFormat analyticsS3ExportFileFormat) {
        setFormat(analyticsS3ExportFileFormat);
        return this;
    }

    public AnalyticsS3BucketDestination withPrefix(String str) {
        setPrefix(str);
        return this;
    }

    public AnalyticsS3BucketDestination withFormat(String str) {
        setFormat(str);
        return this;
    }

    public void setFormat(String str) {
        this.format = str;
    }
}
