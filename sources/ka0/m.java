package ka0;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class m implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f110315f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f110317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f110318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final we0.m f110319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final we0.m f110320e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(String coreBaseUrl, String configBaseUrl, String appId, we0.m lazyDeviceId, we0.m lazyAppVersionName) {
        Intrinsics.checkNotNullParameter(coreBaseUrl, "coreBaseUrl");
        Intrinsics.checkNotNullParameter(configBaseUrl, "configBaseUrl");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(lazyDeviceId, "lazyDeviceId");
        Intrinsics.checkNotNullParameter(lazyAppVersionName, "lazyAppVersionName");
        this.f110316a = coreBaseUrl;
        this.f110317b = configBaseUrl;
        this.f110318c = appId;
        this.f110319d = lazyDeviceId;
        this.f110320e = lazyAppVersionName;
    }

    private final String c() {
        return this.f110317b + "/v2/config";
    }

    private final String d() {
        return Build.VERSION.SDK_INT + ".0.0";
    }

    @Override // ka0.h
    public String a() {
        return c() + "?appId=" + this.f110318c + "&osVersion=" + d() + "&appVersion=" + ((String) this.f110320e.getValue()) + "&deviceId=" + ((String) this.f110319d.getValue());
    }

    @Override // ka0.h
    public String b(String apiVersion, String suffix) {
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (Intrinsics.areEqual(apiVersion, "v1")) {
            suffix = "log/" + suffix;
        }
        return this.f110316a + '/' + apiVersion + '/' + suffix;
    }
}
