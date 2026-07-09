package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class ReEncryptResult implements Serializable {
    private ByteBuffer ciphertextBlob;
    private String keyId;
    private String sourceKeyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReEncryptResult)) {
            return false;
        }
        ReEncryptResult reEncryptResult = (ReEncryptResult) obj;
        if ((reEncryptResult.getCiphertextBlob() == null) ^ (getCiphertextBlob() == null)) {
            return false;
        }
        if (reEncryptResult.getCiphertextBlob() != null && !reEncryptResult.getCiphertextBlob().equals(getCiphertextBlob())) {
            return false;
        }
        if ((reEncryptResult.getSourceKeyId() == null) ^ (getSourceKeyId() == null)) {
            return false;
        }
        if (reEncryptResult.getSourceKeyId() != null && !reEncryptResult.getSourceKeyId().equals(getSourceKeyId())) {
            return false;
        }
        if ((reEncryptResult.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        return reEncryptResult.getKeyId() == null || reEncryptResult.getKeyId().equals(getKeyId());
    }

    public ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getSourceKeyId() {
        return this.sourceKeyId;
    }

    public int hashCode() {
        return (((((getCiphertextBlob() == null ? 0 : getCiphertextBlob().hashCode()) + 31) * 31) + (getSourceKeyId() == null ? 0 : getSourceKeyId().hashCode())) * 31) + (getKeyId() != null ? getKeyId().hashCode() : 0);
    }

    public void setCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setSourceKeyId(String str) {
        this.sourceKeyId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCiphertextBlob() != null) {
            sb2.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        }
        if (getSourceKeyId() != null) {
            sb2.append("SourceKeyId: " + getSourceKeyId() + ",");
        }
        if (getKeyId() != null) {
            sb2.append("KeyId: " + getKeyId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public ReEncryptResult withCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
        return this;
    }

    public ReEncryptResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public ReEncryptResult withSourceKeyId(String str) {
        this.sourceKeyId = str;
        return this;
    }
}
