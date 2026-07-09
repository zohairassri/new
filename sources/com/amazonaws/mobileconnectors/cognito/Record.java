package com.amazonaws.mobileconnectors.cognito;

import com.amazonaws.mobileconnectors.cognito.internal.util.StringUtils;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class Record {
    private final Date deviceLastModifiedDate;
    private final String key;
    private final String lastModifiedBy;
    private final Date lastModifiedDate;
    private final boolean modified;
    private final long syncCount;
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class Builder {
        private Date deviceLastModifiedDate;
        private final String key;
        private String lastModifiedBy;
        private Date lastModifiedDate;
        private boolean modified;
        private long syncCount;
        private String value;

        public Builder(String str) {
            if (StringUtils.isEmpty(str)) {
                throw new IllegalArgumentException("key can't be empty");
            }
            this.key = str;
        }

        public Record build() {
            return new Record(this);
        }

        public Builder deviceLastModifiedDate(Date date) {
            this.deviceLastModifiedDate = date;
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

        public Builder modified(boolean z11) {
            this.modified = z11;
            return this;
        }

        public Builder syncCount(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("sync count can't be negative");
            }
            this.syncCount = j11;
            return this;
        }

        public Builder value(String str) {
            this.value = str;
            return this;
        }
    }

    public Date getDeviceLastModifiedDate() {
        return new Date(this.deviceLastModifiedDate.getTime());
    }

    public String getKey() {
        return this.key;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return new Date(this.lastModifiedDate.getTime());
    }

    public long getSyncCount() {
        return this.syncCount;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isDeleted() {
        return this.value == null;
    }

    public boolean isModified() {
        return this.modified;
    }

    public String toString() {
        return "key:[" + this.key + "],value:[" + this.value + "],sync_count:[" + this.syncCount + "],last_modified_date:[" + this.lastModifiedDate + "],last_modified_by:[" + this.lastModifiedBy + "],device_last_modified_date:[" + this.deviceLastModifiedDate + "],last_modified_by:[" + this.lastModifiedBy + "],is_modified:[" + this.modified + "]";
    }

    private Record(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
        this.syncCount = builder.syncCount;
        this.lastModifiedDate = builder.lastModifiedDate == null ? new Date() : new Date(builder.lastModifiedDate.getTime());
        this.lastModifiedBy = builder.lastModifiedBy;
        this.deviceLastModifiedDate = builder.deviceLastModifiedDate == null ? new Date() : new Date(builder.deviceLastModifiedDate.getTime());
        this.modified = builder.modified;
    }
}
