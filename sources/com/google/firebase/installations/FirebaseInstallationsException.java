package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f46482a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.f46482a = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.f46482a = aVar;
    }
}
