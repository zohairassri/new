package com.google.firebase.remoteconfig;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46898b;

    public FirebaseRemoteConfigFetchThrottledException(long j11) {
        this("Fetch was throttled.", j11);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j11) {
        super(str);
        this.f46898b = j11;
    }
}
