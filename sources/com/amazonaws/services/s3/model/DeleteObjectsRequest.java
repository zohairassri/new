package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class DeleteObjectsRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private boolean isRequesterPays;
    private final List<KeyVersion> keys = new ArrayList();
    private MultiFactorAuthentication mfa;
    private boolean quiet;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class KeyVersion implements Serializable {
        private final String key;
        private final String version;

        public KeyVersion(String str) {
            this(str, null);
        }

        public String getKey() {
            return this.key;
        }

        public String getVersion() {
            return this.version;
        }

        public KeyVersion(String str, String str2) {
            this.key = str;
            this.version = str2;
        }
    }

    public DeleteObjectsRequest(String str) {
        setBucketName(str);
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public List<KeyVersion> getKeys() {
        return this.keys;
    }

    public MultiFactorAuthentication getMfa() {
        return this.mfa;
    }

    public boolean getQuiet() {
        return this.quiet;
    }

    public boolean isRequesterPays() {
        return this.isRequesterPays;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setKeys(List<KeyVersion> list) {
        this.keys.clear();
        this.keys.addAll(list);
    }

    public void setMfa(MultiFactorAuthentication multiFactorAuthentication) {
        this.mfa = multiFactorAuthentication;
    }

    public void setQuiet(boolean z11) {
        this.quiet = z11;
    }

    public void setRequesterPays(boolean z11) {
        this.isRequesterPays = z11;
    }

    public DeleteObjectsRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public DeleteObjectsRequest withKeys(List<KeyVersion> list) {
        setKeys(list);
        return this;
    }

    public DeleteObjectsRequest withMfa(MultiFactorAuthentication multiFactorAuthentication) {
        setMfa(multiFactorAuthentication);
        return this;
    }

    public DeleteObjectsRequest withQuiet(boolean z11) {
        setQuiet(z11);
        return this;
    }

    public DeleteObjectsRequest withRequesterPays(boolean z11) {
        setRequesterPays(z11);
        return this;
    }

    public DeleteObjectsRequest withKeys(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new KeyVersion(str));
        }
        setKeys(arrayList);
        return this;
    }
}
