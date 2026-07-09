package la0;

import com.comscore.android.id.IdHelperAndroid;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public enum r {
    NOT_REACHABLE(IdHelperAndroid.NO_ID_AVAILABLE),
    WIFI("wifi"),
    WAN("wan"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f113974a;

    r(String str) {
        this.f113974a = str;
    }

    public final String b() {
        return this.f113974a;
    }

    public final boolean c() {
        return this != NOT_REACHABLE;
    }
}
