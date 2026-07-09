package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class CopyPartResult extends SSEResultBase implements Serializable {
    private String etag;
    private Date lastModifiedDate;
    private int partNumber;
    private String versionId;

    public String getETag() {
        return this.etag;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public PartETag getPartETag() {
        return new PartETag(this.partNumber, this.etag);
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setETag(String str) {
        this.etag = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setPartNumber(int i11) {
        this.partNumber = i11;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }
}
