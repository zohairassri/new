package io.transcend.webview.models;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class TrackingConsentDetails {
    private boolean confirmed;
    private Object metadata;
    private String metadataTimestamp;
    private boolean prompted;
    private Map<String, Object> purposes;
    private String timestamp;
    private boolean updated;

    public TrackingConsentDetails() {
    }

    public Object getMetadata() {
        return this.metadata;
    }

    public String getMetadataTimestamp() {
        return this.metadataTimestamp;
    }

    public Map<String, Object> getPurposes() {
        return this.purposes;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public boolean isConfirmed() {
        return this.confirmed;
    }

    public boolean isPrompted() {
        return this.prompted;
    }

    public boolean isUpdated() {
        return this.updated;
    }

    public void setConfirmed(boolean z11) {
        this.confirmed = z11;
    }

    public void setMetadata(Object obj) {
        this.metadata = obj;
    }

    public void setMetadataTimestamp(String str) {
        this.metadataTimestamp = str;
    }

    public void setPrompted(boolean z11) {
        this.prompted = z11;
    }

    public void setPurposes(Map<String, Object> map) {
        this.purposes = map;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setUpdated(boolean z11) {
        this.updated = z11;
    }

    public TrackingConsentDetails(Map<String, Object> map, boolean z11, boolean z12, String str, boolean z13, Object obj, String str2) {
        this.purposes = map;
        this.confirmed = z11;
        this.prompted = z12;
        this.timestamp = str;
        this.updated = z13;
        this.metadata = obj;
        this.metadataTimestamp = str2;
    }
}
