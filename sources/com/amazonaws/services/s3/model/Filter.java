package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Filter implements Serializable {
    private S3KeyFilter s3KeyFilter;

    public S3KeyFilter getS3KeyFilter() {
        return this.s3KeyFilter;
    }

    public void setS3KeyFilter(S3KeyFilter s3KeyFilter) {
        this.s3KeyFilter = s3KeyFilter;
    }

    public Filter withS3KeyFilter(S3KeyFilter s3KeyFilter) {
        setS3KeyFilter(s3KeyFilter);
        return this;
    }
}
