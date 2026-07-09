package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46899b;

    public FirebaseRemoteConfigServerException(int i11, String str) {
        super(str);
        this.f46899b = i11;
    }

    public int a() {
        return this.f46899b;
    }

    public FirebaseRemoteConfigServerException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.f46899b = i11;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f46899b = -1;
    }

    public FirebaseRemoteConfigServerException(int i11, String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f46899b = i11;
    }
}
