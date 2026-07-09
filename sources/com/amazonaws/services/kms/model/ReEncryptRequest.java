package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ReEncryptRequest extends AmazonWebServiceRequest implements Serializable {
    private ByteBuffer ciphertextBlob;
    private String destinationKeyId;
    private Map<String, String> sourceEncryptionContext = new HashMap();
    private Map<String, String> destinationEncryptionContext = new HashMap();
    private List<String> grantTokens = new ArrayList();

    public ReEncryptRequest addDestinationEncryptionContextEntry(String str, String str2) {
        if (this.destinationEncryptionContext == null) {
            this.destinationEncryptionContext = new HashMap();
        }
        if (!this.destinationEncryptionContext.containsKey(str)) {
            this.destinationEncryptionContext.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ReEncryptRequest addSourceEncryptionContextEntry(String str, String str2) {
        if (this.sourceEncryptionContext == null) {
            this.sourceEncryptionContext = new HashMap();
        }
        if (!this.sourceEncryptionContext.containsKey(str)) {
            this.sourceEncryptionContext.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ReEncryptRequest clearDestinationEncryptionContextEntries() {
        this.destinationEncryptionContext = null;
        return this;
    }

    public ReEncryptRequest clearSourceEncryptionContextEntries() {
        this.sourceEncryptionContext = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReEncryptRequest)) {
            return false;
        }
        ReEncryptRequest reEncryptRequest = (ReEncryptRequest) obj;
        if ((reEncryptRequest.getCiphertextBlob() == null) ^ (getCiphertextBlob() == null)) {
            return false;
        }
        if (reEncryptRequest.getCiphertextBlob() != null && !reEncryptRequest.getCiphertextBlob().equals(getCiphertextBlob())) {
            return false;
        }
        if ((reEncryptRequest.getSourceEncryptionContext() == null) ^ (getSourceEncryptionContext() == null)) {
            return false;
        }
        if (reEncryptRequest.getSourceEncryptionContext() != null && !reEncryptRequest.getSourceEncryptionContext().equals(getSourceEncryptionContext())) {
            return false;
        }
        if ((reEncryptRequest.getDestinationKeyId() == null) ^ (getDestinationKeyId() == null)) {
            return false;
        }
        if (reEncryptRequest.getDestinationKeyId() != null && !reEncryptRequest.getDestinationKeyId().equals(getDestinationKeyId())) {
            return false;
        }
        if ((reEncryptRequest.getDestinationEncryptionContext() == null) ^ (getDestinationEncryptionContext() == null)) {
            return false;
        }
        if (reEncryptRequest.getDestinationEncryptionContext() != null && !reEncryptRequest.getDestinationEncryptionContext().equals(getDestinationEncryptionContext())) {
            return false;
        }
        if ((reEncryptRequest.getGrantTokens() == null) ^ (getGrantTokens() == null)) {
            return false;
        }
        return reEncryptRequest.getGrantTokens() == null || reEncryptRequest.getGrantTokens().equals(getGrantTokens());
    }

    public ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public Map<String, String> getDestinationEncryptionContext() {
        return this.destinationEncryptionContext;
    }

    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    public List<String> getGrantTokens() {
        return this.grantTokens;
    }

    public Map<String, String> getSourceEncryptionContext() {
        return this.sourceEncryptionContext;
    }

    public int hashCode() {
        return (((((((((getCiphertextBlob() == null ? 0 : getCiphertextBlob().hashCode()) + 31) * 31) + (getSourceEncryptionContext() == null ? 0 : getSourceEncryptionContext().hashCode())) * 31) + (getDestinationKeyId() == null ? 0 : getDestinationKeyId().hashCode())) * 31) + (getDestinationEncryptionContext() == null ? 0 : getDestinationEncryptionContext().hashCode())) * 31) + (getGrantTokens() != null ? getGrantTokens().hashCode() : 0);
    }

    public void setCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
    }

    public void setDestinationEncryptionContext(Map<String, String> map) {
        this.destinationEncryptionContext = map;
    }

    public void setDestinationKeyId(String str) {
        this.destinationKeyId = str;
    }

    public void setGrantTokens(Collection<String> collection) {
        if (collection == null) {
            this.grantTokens = null;
        } else {
            this.grantTokens = new ArrayList(collection);
        }
    }

    public void setSourceEncryptionContext(Map<String, String> map) {
        this.sourceEncryptionContext = map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCiphertextBlob() != null) {
            sb2.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        }
        if (getSourceEncryptionContext() != null) {
            sb2.append("SourceEncryptionContext: " + getSourceEncryptionContext() + ",");
        }
        if (getDestinationKeyId() != null) {
            sb2.append("DestinationKeyId: " + getDestinationKeyId() + ",");
        }
        if (getDestinationEncryptionContext() != null) {
            sb2.append("DestinationEncryptionContext: " + getDestinationEncryptionContext() + ",");
        }
        if (getGrantTokens() != null) {
            sb2.append("GrantTokens: " + getGrantTokens());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ReEncryptRequest withCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
        return this;
    }

    public ReEncryptRequest withDestinationEncryptionContext(Map<String, String> map) {
        this.destinationEncryptionContext = map;
        return this;
    }

    public ReEncryptRequest withDestinationKeyId(String str) {
        this.destinationKeyId = str;
        return this;
    }

    public ReEncryptRequest withGrantTokens(String... strArr) {
        if (getGrantTokens() == null) {
            this.grantTokens = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.grantTokens.add(str);
        }
        return this;
    }

    public ReEncryptRequest withSourceEncryptionContext(Map<String, String> map) {
        this.sourceEncryptionContext = map;
        return this;
    }

    public ReEncryptRequest withGrantTokens(Collection<String> collection) {
        setGrantTokens(collection);
        return this;
    }
}
