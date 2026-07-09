package tr;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f130233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f130235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f130236f;

    public a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, t currentProcessDetails, List appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f130231a = packageName;
        this.f130232b = versionName;
        this.f130233c = appBuildVersion;
        this.f130234d = deviceManufacturer;
        this.f130235e = currentProcessDetails;
        this.f130236f = appProcessDetails;
    }

    public final String a() {
        return this.f130233c;
    }

    public final List b() {
        return this.f130236f;
    }

    public final t c() {
        return this.f130235e;
    }

    public final String d() {
        return this.f130234d;
    }

    public final String e() {
        return this.f130231a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f130231a, aVar.f130231a) && Intrinsics.areEqual(this.f130232b, aVar.f130232b) && Intrinsics.areEqual(this.f130233c, aVar.f130233c) && Intrinsics.areEqual(this.f130234d, aVar.f130234d) && Intrinsics.areEqual(this.f130235e, aVar.f130235e) && Intrinsics.areEqual(this.f130236f, aVar.f130236f);
    }

    public final String f() {
        return this.f130232b;
    }

    public int hashCode() {
        return (((((((((this.f130231a.hashCode() * 31) + this.f130232b.hashCode()) * 31) + this.f130233c.hashCode()) * 31) + this.f130234d.hashCode()) * 31) + this.f130235e.hashCode()) * 31) + this.f130236f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f130231a + ", versionName=" + this.f130232b + ", appBuildVersion=" + this.f130233c + ", deviceManufacturer=" + this.f130234d + ", currentProcessDetails=" + this.f130235e + ", appProcessDetails=" + this.f130236f + ')';
    }
}
