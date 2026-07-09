package com.amazonaws.mobileconnectors.s3.transfermanager;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class TransferManagerConfiguration {
    private static final long DEFAULT_MINIMUM_COPY_PART_SIZE = 104857600;
    private static final int DEFAULT_MINIMUM_UPLOAD_PART_SIZE = 5242880;
    private static final long DEFAULT_MULTIPART_COPY_THRESHOLD = 5368709120L;
    private static final long DEFAULT_MULTIPART_UPLOAD_THRESHOLD = 16777216;
    private long minimumUploadPartSize = 5242880;
    private long multipartUploadThreshold = DEFAULT_MULTIPART_UPLOAD_THRESHOLD;
    private long multipartCopyThreshold = DEFAULT_MULTIPART_COPY_THRESHOLD;
    private long multipartCopyPartSize = DEFAULT_MINIMUM_COPY_PART_SIZE;

    public long getMinimumUploadPartSize() {
        return this.minimumUploadPartSize;
    }

    public long getMultipartCopyPartSize() {
        return this.multipartCopyPartSize;
    }

    public long getMultipartCopyThreshold() {
        return this.multipartCopyThreshold;
    }

    public long getMultipartUploadThreshold() {
        return this.multipartUploadThreshold;
    }

    public void setMinimumUploadPartSize(long j11) {
        this.minimumUploadPartSize = j11;
    }

    public void setMultipartCopyPartSize(long j11) {
        this.multipartCopyPartSize = j11;
    }

    public void setMultipartCopyThreshold(long j11) {
        this.multipartCopyThreshold = j11;
    }

    public void setMultipartUploadThreshold(long j11) {
        this.multipartUploadThreshold = j11;
    }
}
