package com.amazonaws.services.s3.model;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum Permission {
    FullControl("FULL_CONTROL", "x-amz-grant-full-control"),
    Read("READ", "x-amz-grant-read"),
    Write("WRITE", "x-amz-grant-write"),
    ReadAcp("READ_ACP", "x-amz-grant-read-acp"),
    WriteAcp("WRITE_ACP", "x-amz-grant-write-acp");

    private String headerName;
    private String permissionString;

    Permission(String str, String str2) {
        this.permissionString = str;
        this.headerName = str2;
    }

    public static Permission parsePermission(String str) {
        for (Permission permission : values()) {
            if (permission.permissionString.equals(str)) {
                return permission;
            }
        }
        return null;
    }

    public String getHeaderName() {
        return this.headerName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.permissionString;
    }
}
