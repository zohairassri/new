package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Owner implements Serializable {
    private static final long serialVersionUID = -8916731456944569115L;
    private String displayName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f18441id;

    public Owner() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String id2 = owner.getId();
        String displayName = owner.getDisplayName();
        String id3 = getId();
        String displayName2 = getDisplayName();
        if (id2 == null) {
            id2 = "";
        }
        if (displayName == null) {
            displayName = "";
        }
        if (id3 == null) {
            id3 = "";
        }
        if (displayName2 == null) {
            displayName2 = "";
        }
        return id2.equals(id3) && displayName.equals(displayName2);
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getId() {
        return this.f18441id;
    }

    public int hashCode() {
        String str = this.f18441id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setId(String str) {
        this.f18441id = str;
    }

    public String toString() {
        return "S3Owner [name=" + getDisplayName() + ",id=" + getId() + "]";
    }

    public Owner(String str, String str2) {
        this.f18441id = str;
        this.displayName = str2;
    }
}
