package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class DescribeDatasetResult implements Serializable {
    private Dataset dataset;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDatasetResult)) {
            return false;
        }
        DescribeDatasetResult describeDatasetResult = (DescribeDatasetResult) obj;
        if ((describeDatasetResult.getDataset() == null) ^ (getDataset() == null)) {
            return false;
        }
        return describeDatasetResult.getDataset() == null || describeDatasetResult.getDataset().equals(getDataset());
    }

    public Dataset getDataset() {
        return this.dataset;
    }

    public int hashCode() {
        return 31 + (getDataset() == null ? 0 : getDataset().hashCode());
    }

    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getDataset() != null) {
            sb2.append("Dataset: " + getDataset());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public DescribeDatasetResult withDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
}
