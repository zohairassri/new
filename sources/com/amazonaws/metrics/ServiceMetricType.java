package com.amazonaws.metrics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface ServiceMetricType extends MetricType {
    public static final String DOWNLOAD_BYTE_COUNT_NAME_SUFFIX = "DownloadByteCount";
    public static final String DOWNLOAD_THROUGHPUT_NAME_SUFFIX = "DownloadThroughput";
    public static final String UPLOAD_BYTE_COUNT_NAME_SUFFIX = "UploadByteCount";
    public static final String UPLOAD_THROUGHPUT_NAME_SUFFIX = "UploadThroughput";

    String getServiceName();
}
