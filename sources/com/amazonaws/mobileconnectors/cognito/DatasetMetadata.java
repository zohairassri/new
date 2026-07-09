package com.amazonaws.mobileconnectors.cognito;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class DatasetMetadata {
    private final Date creationDate;
    private final String datasetName;
    private final String lastModifiedBy;
    private final Date lastModifiedDate;
    private final long recordCount;
    private final long storageSizeBytes;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class Builder {
        private Date creationDate;
        private final String datasetName;
        private String lastModifiedBy;
        private Date lastModifiedDate;
        private long recordCount;
        private long storageSizeBytes;

        public Builder(String str) {
            this.datasetName = str;
        }

        public DatasetMetadata build() {
            return new DatasetMetadata(this);
        }

        public Builder creationDate(Date date) {
            this.creationDate = date;
            return this;
        }

        public Builder lastModifiedBy(String str) {
            this.lastModifiedBy = str;
            return this;
        }

        public Builder lastModifiedDate(Date date) {
            this.lastModifiedDate = date;
            return this;
        }

        public Builder recordCount(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("Number of records can't be negative");
            }
            this.recordCount = j11;
            return this;
        }

        public Builder storageSizeBytes(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("Storage size can't be negative");
            }
            this.storageSizeBytes = j11;
            return this;
        }
    }

    public Date getCreationDate() {
        return new Date(this.creationDate.getTime());
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return new Date(this.lastModifiedDate.getTime());
    }

    public long getRecordCount() {
        return this.recordCount;
    }

    public long getStorageSizeBytes() {
        return this.storageSizeBytes;
    }

    public String toString() {
        return "dataset_name:[" + this.datasetName + "],creation_date:[" + this.creationDate + "],last_modified_date:[" + this.lastModifiedDate + "],last_modified_by:[" + this.lastModifiedBy + "],storage_size_bytes:[" + this.storageSizeBytes + "],record_count:[" + this.recordCount + "]";
    }

    private DatasetMetadata(Builder builder) {
        this.datasetName = builder.datasetName;
        this.lastModifiedBy = builder.lastModifiedBy;
        this.creationDate = builder.creationDate == null ? new Date(0L) : new Date(builder.creationDate.getTime());
        this.lastModifiedDate = builder.lastModifiedDate == null ? new Date() : new Date(builder.lastModifiedDate.getTime());
        this.storageSizeBytes = builder.storageSizeBytes;
        this.recordCount = builder.recordCount;
    }
}
