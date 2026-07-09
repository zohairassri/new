package me;

import com.theathletic.pushnotification.component.data.remote.PushNotificationRePromptRemoteDataStore;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum g {
    FREQUENT(500),
    AVERAGE(PushNotificationRePromptRemoteDataStore.DEFAULT_DELAY_MS),
    RARE(5000);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f116171a;

    g(long j11) {
        this.f116171a = j11;
    }

    public final long b() {
        return this.f116171a;
    }
}
