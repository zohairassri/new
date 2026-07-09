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
public class EncryptRequest extends AmazonWebServiceRequest implements Serializable {
    private Map<String, String> encryptionContext = new HashMap();
    private List<String> grantTokens = new ArrayList();
    private String keyId;
    private ByteBuffer plaintext;

    public EncryptRequest addEncryptionContextEntry(String str, String str2) {
        if (this.encryptionContext == null) {
            this.encryptionContext = new HashMap();
        }
        if (!this.encryptionContext.containsKey(str)) {
            this.encryptionContext.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public EncryptRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EncryptRequest)) {
            return false;
        }
        EncryptRequest encryptRequest = (EncryptRequest) obj;
        if ((encryptRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (encryptRequest.getKeyId() != null && !encryptRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((encryptRequest.getPlaintext() == null) ^ (getPlaintext() == null)) {
            return false;
        }
        if (encryptRequest.getPlaintext() != null && !encryptRequest.getPlaintext().equals(getPlaintext())) {
            return false;
        }
        if ((encryptRequest.getEncryptionContext() == null) ^ (getEncryptionContext() == null)) {
            return false;
        }
        if (encryptRequest.getEncryptionContext() != null && !encryptRequest.getEncryptionContext().equals(getEncryptionContext())) {
            return false;
        }
        if ((encryptRequest.getGrantTokens() == null) ^ (getGrantTokens() == null)) {
            return false;
        }
        return encryptRequest.getGrantTokens() == null || encryptRequest.getGrantTokens().equals(getGrantTokens());
    }

    public Map<String, String> getEncryptionContext() {
        return this.encryptionContext;
    }

    public List<String> getGrantTokens() {
        return this.grantTokens;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    public int hashCode() {
        return (((((((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getPlaintext() == null ? 0 : getPlaintext().hashCode())) * 31) + (getEncryptionContext() == null ? 0 : getEncryptionContext().hashCode())) * 31) + (getGrantTokens() != null ? getGrantTokens().hashCode() : 0);
    }

    public void setEncryptionContext(Map<String, String> map) {
        this.encryptionContext = map;
    }

    public void setGrantTokens(Collection<String> collection) {
        if (collection == null) {
            this.grantTokens = null;
        } else {
            this.grantTokens = new ArrayList(collection);
        }
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getKeyId() != null) {
            sb2.append("KeyId: " + getKeyId() + ",");
        }
        if (getPlaintext() != null) {
            sb2.append("Plaintext: " + getPlaintext() + ",");
        }
        if (getEncryptionContext() != null) {
            sb2.append("EncryptionContext: " + getEncryptionContext() + ",");
        }
        if (getGrantTokens() != null) {
            sb2.append("GrantTokens: " + getGrantTokens());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public EncryptRequest withEncryptionContext(Map<String, String> map) {
        this.encryptionContext = map;
        return this;
    }

    public EncryptRequest withGrantTokens(String... strArr) {
        if (getGrantTokens() == null) {
            this.grantTokens = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.grantTokens.add(str);
        }
        return this;
    }

    public EncryptRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public EncryptRequest withPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
        return this;
    }

    public EncryptRequest withGrantTokens(Collection<String> collection) {
        setGrantTokens(collection);
        return this;
    }
}
