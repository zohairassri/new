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
public class DecryptRequest extends AmazonWebServiceRequest implements Serializable {
    private ByteBuffer ciphertextBlob;
    private Map<String, String> encryptionContext = new HashMap();
    private List<String> grantTokens = new ArrayList();

    public DecryptRequest addEncryptionContextEntry(String str, String str2) {
        if (this.encryptionContext == null) {
            this.encryptionContext = new HashMap();
        }
        if (!this.encryptionContext.containsKey(str)) {
            this.encryptionContext.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public DecryptRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecryptRequest)) {
            return false;
        }
        DecryptRequest decryptRequest = (DecryptRequest) obj;
        if ((decryptRequest.getCiphertextBlob() == null) ^ (getCiphertextBlob() == null)) {
            return false;
        }
        if (decryptRequest.getCiphertextBlob() != null && !decryptRequest.getCiphertextBlob().equals(getCiphertextBlob())) {
            return false;
        }
        if ((decryptRequest.getEncryptionContext() == null) ^ (getEncryptionContext() == null)) {
            return false;
        }
        if (decryptRequest.getEncryptionContext() != null && !decryptRequest.getEncryptionContext().equals(getEncryptionContext())) {
            return false;
        }
        if ((decryptRequest.getGrantTokens() == null) ^ (getGrantTokens() == null)) {
            return false;
        }
        return decryptRequest.getGrantTokens() == null || decryptRequest.getGrantTokens().equals(getGrantTokens());
    }

    public ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public Map<String, String> getEncryptionContext() {
        return this.encryptionContext;
    }

    public List<String> getGrantTokens() {
        return this.grantTokens;
    }

    public int hashCode() {
        return (((((getCiphertextBlob() == null ? 0 : getCiphertextBlob().hashCode()) + 31) * 31) + (getEncryptionContext() == null ? 0 : getEncryptionContext().hashCode())) * 31) + (getGrantTokens() != null ? getGrantTokens().hashCode() : 0);
    }

    public void setCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
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

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCiphertextBlob() != null) {
            sb2.append("CiphertextBlob: " + getCiphertextBlob() + ",");
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

    public DecryptRequest withCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
        return this;
    }

    public DecryptRequest withEncryptionContext(Map<String, String> map) {
        this.encryptionContext = map;
        return this;
    }

    public DecryptRequest withGrantTokens(String... strArr) {
        if (getGrantTokens() == null) {
            this.grantTokens = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.grantTokens.add(str);
        }
        return this;
    }

    public DecryptRequest withGrantTokens(Collection<String> collection) {
        setGrantTokens(collection);
        return this;
    }
}
