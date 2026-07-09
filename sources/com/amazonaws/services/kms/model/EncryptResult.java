package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class EncryptResult implements Serializable {
    private ByteBuffer ciphertextBlob;
    private String keyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EncryptResult)) {
            return false;
        }
        EncryptResult encryptResult = (EncryptResult) obj;
        if ((encryptResult.getCiphertextBlob() == null) ^ (getCiphertextBlob() == null)) {
            return false;
        }
        if (encryptResult.getCiphertextBlob() != null && !encryptResult.getCiphertextBlob().equals(getCiphertextBlob())) {
            return false;
        }
        if ((encryptResult.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        return encryptResult.getKeyId() == null || encryptResult.getKeyId().equals(getKeyId());
    }

    public ByteBuffer getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        return (((getCiphertextBlob() == null ? 0 : getCiphertextBlob().hashCode()) + 31) * 31) + (getKeyId() != null ? getKeyId().hashCode() : 0);
    }

    public void setCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCiphertextBlob() != null) {
            sb2.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        }
        if (getKeyId() != null) {
            sb2.append("KeyId: " + getKeyId());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public EncryptResult withCiphertextBlob(ByteBuffer byteBuffer) {
        this.ciphertextBlob = byteBuffer;
        return this;
    }

    public EncryptResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}
