package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class ListDatasetsResult implements Serializable {
    private Integer count;
    private List<Dataset> datasets;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListDatasetsResult)) {
            return false;
        }
        ListDatasetsResult listDatasetsResult = (ListDatasetsResult) obj;
        if ((listDatasetsResult.getDatasets() == null) ^ (getDatasets() == null)) {
            return false;
        }
        if (listDatasetsResult.getDatasets() != null && !listDatasetsResult.getDatasets().equals(getDatasets())) {
            return false;
        }
        if ((listDatasetsResult.getCount() == null) ^ (getCount() == null)) {
            return false;
        }
        if (listDatasetsResult.getCount() != null && !listDatasetsResult.getCount().equals(getCount())) {
            return false;
        }
        if ((listDatasetsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listDatasetsResult.getNextToken() == null || listDatasetsResult.getNextToken().equals(getNextToken());
    }

    public Integer getCount() {
        return this.count;
    }

    public List<Dataset> getDatasets() {
        return this.datasets;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((((getDatasets() == null ? 0 : getDatasets().hashCode()) + 31) * 31) + (getCount() == null ? 0 : getCount().hashCode())) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setDatasets(Collection<Dataset> collection) {
        if (collection == null) {
            this.datasets = null;
        } else {
            this.datasets = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getDatasets() != null) {
            sb2.append("Datasets: " + getDatasets() + ",");
        }
        if (getCount() != null) {
            sb2.append("Count: " + getCount() + ",");
        }
        if (getNextToken() != null) {
            sb2.append("NextToken: " + getNextToken());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ListDatasetsResult withCount(Integer num) {
        this.count = num;
        return this;
    }

    public ListDatasetsResult withDatasets(Dataset... datasetArr) {
        if (getDatasets() == null) {
            this.datasets = new ArrayList(datasetArr.length);
        }
        for (Dataset dataset : datasetArr) {
            this.datasets.add(dataset);
        }
        return this;
    }

    public ListDatasetsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListDatasetsResult withDatasets(Collection<Dataset> collection) {
        setDatasets(collection);
        return this;
    }
}
