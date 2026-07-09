package com.amazonaws.auth.policy.resources;

import com.amazonaws.auth.policy.Resource;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class S3ObjectResource extends Resource {
    public S3ObjectResource(String str, String str2) {
        this("aws", str, str2);
    }

    public S3ObjectResource(String str, String str2, String str3) {
        super(String.format("arn:%s:s3:::%s/%s", str, str2, str3));
    }
}
