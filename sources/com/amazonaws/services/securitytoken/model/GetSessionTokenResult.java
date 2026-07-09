package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class GetSessionTokenResult implements Serializable {
    private Credentials credentials;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSessionTokenResult)) {
            return false;
        }
        GetSessionTokenResult getSessionTokenResult = (GetSessionTokenResult) obj;
        if ((getSessionTokenResult.getCredentials() == null) ^ (getCredentials() == null)) {
            return false;
        }
        return getSessionTokenResult.getCredentials() == null || getSessionTokenResult.getCredentials().equals(getCredentials());
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public int hashCode() {
        return 31 + (getCredentials() == null ? 0 : getCredentials().hashCode());
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        if (getCredentials() != null) {
            sb2.append("Credentials: " + getCredentials());
        }
        sb2.append("}");
        return sb2.toString();
    }

    public GetSessionTokenResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }
}
