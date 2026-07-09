package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class UpdateRecordsResult implements Serializable {
    private List<Record> records;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateRecordsResult)) {
            return false;
        }
        UpdateRecordsResult updateRecordsResult = (UpdateRecordsResult) obj;
        if ((updateRecordsResult.getRecords() == null) ^ (getRecords() == null)) {
            return false;
        }
        return updateRecordsResult.getRecords() == null || updateRecordsResult.getRecords().equals(getRecords());
    }

    public List<Record> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return 31 + (getRecords() == null ? 0 : getRecords().hashCode());
    }

    public void setRecords(Collection<Record> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getRecords() != null) {
            sb2.append("Records: " + getRecords());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public UpdateRecordsResult withRecords(Record... recordArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(recordArr.length);
        }
        for (Record record : recordArr) {
            this.records.add(record);
        }
        return this;
    }

    public UpdateRecordsResult withRecords(Collection<Record> collection) {
        setRecords(collection);
        return this;
    }
}
