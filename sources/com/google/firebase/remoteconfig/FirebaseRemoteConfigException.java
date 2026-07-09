package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f46890a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f46897a;

        a(int i11) {
            this.f46897a = i11;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f46890a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2) {
        super(str, th2);
        this.f46890a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, a aVar) {
        super(str);
        this.f46890a = aVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2, a aVar) {
        super(str, th2);
        this.f46890a = aVar;
    }
}
