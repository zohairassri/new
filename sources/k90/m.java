package k90;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f110092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f110093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f110094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f110095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f110096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f110097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f110098g;

    public m(String osName, String osType, String osBuild, String osVersion, String androidOsApiLevel, String deviceManufacturer, String deviceModel) {
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(osType, "osType");
        Intrinsics.checkNotNullParameter(osBuild, "osBuild");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(androidOsApiLevel, "androidOsApiLevel");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.f110092a = osName;
        this.f110093b = osType;
        this.f110094c = osBuild;
        this.f110095d = osVersion;
        this.f110096e = androidOsApiLevel;
        this.f110097f = deviceManufacturer;
        this.f110098g = deviceModel;
    }

    public final String a() {
        return this.f110096e;
    }

    public final String b() {
        return this.f110097f;
    }

    public final String c() {
        return this.f110098g;
    }

    public final String d() {
        return this.f110094c;
    }

    public final String e() {
        return this.f110092a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f110092a, mVar.f110092a) && Intrinsics.areEqual(this.f110093b, mVar.f110093b) && Intrinsics.areEqual(this.f110094c, mVar.f110094c) && Intrinsics.areEqual(this.f110095d, mVar.f110095d) && Intrinsics.areEqual(this.f110096e, mVar.f110096e) && Intrinsics.areEqual(this.f110097f, mVar.f110097f) && Intrinsics.areEqual(this.f110098g, mVar.f110098g);
    }

    public final String f() {
        return this.f110093b;
    }

    public final String g() {
        return this.f110095d;
    }

    public int hashCode() {
        return (((((((((((this.f110092a.hashCode() * 31) + this.f110093b.hashCode()) * 31) + this.f110094c.hashCode()) * 31) + this.f110095d.hashCode()) * 31) + this.f110096e.hashCode()) * 31) + this.f110097f.hashCode()) * 31) + this.f110098g.hashCode();
    }

    public String toString() {
        return "SystemInfo(osName=" + this.f110092a + ", osType=" + this.f110093b + ", osBuild=" + this.f110094c + ", osVersion=" + this.f110095d + ", androidOsApiLevel=" + this.f110096e + ", deviceManufacturer=" + this.f110097f + ", deviceModel=" + this.f110098g + ')';
    }

    public /* synthetic */ m(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "android" : str, (i11 & 2) != 0 ? "linux" : str2, (i11 & 4) != 0 ? n.d() : str3, (i11 & 8) != 0 ? n.e() : str4, (i11 & 16) != 0 ? n.c() : str5, (i11 & 32) != 0 ? n.a() : str6, (i11 & 64) != 0 ? n.b() : str7);
    }
}
