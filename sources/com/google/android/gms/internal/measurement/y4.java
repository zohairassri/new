package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum y4 implements p8 {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final o8 f40944h = new o8() { // from class: com.google.android.gms.internal.measurement.x4
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40946a;

    y4(int i11) {
        this.f40946a = i11;
    }

    public static y4 a(int i11) {
        if (i11 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i11 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i11 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i11 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i11 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i11 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }

    public static r8 b() {
        return z4.f40957a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + y4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f40946a + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.measurement.p8
    public final int zza() {
        return this.f40946a;
    }
}
