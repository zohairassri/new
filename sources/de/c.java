package de;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f89630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f89631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f89632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f89633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f89634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f89635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f89636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f89637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f89638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e f89639k;

    public c(String deviceName, String deviceBrand, String deviceModel, d deviceType, String deviceBuildId, String osName, String osMajorVersion, String osVersion, String architecture, Integer num, e localeInfo) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceBrand, "deviceBrand");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceBuildId, "deviceBuildId");
        Intrinsics.checkNotNullParameter(osName, "osName");
        Intrinsics.checkNotNullParameter(osMajorVersion, "osMajorVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(architecture, "architecture");
        Intrinsics.checkNotNullParameter(localeInfo, "localeInfo");
        this.f89629a = deviceName;
        this.f89630b = deviceBrand;
        this.f89631c = deviceModel;
        this.f89632d = deviceType;
        this.f89633e = deviceBuildId;
        this.f89634f = osName;
        this.f89635g = osMajorVersion;
        this.f89636h = osVersion;
        this.f89637i = architecture;
        this.f89638j = num;
        this.f89639k = localeInfo;
    }

    public final String a() {
        return this.f89637i;
    }

    public final String b() {
        return this.f89630b;
    }

    public final String c() {
        return this.f89633e;
    }

    public final String d() {
        return this.f89631c;
    }

    public final String e() {
        return this.f89629a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f89629a, cVar.f89629a) && Intrinsics.areEqual(this.f89630b, cVar.f89630b) && Intrinsics.areEqual(this.f89631c, cVar.f89631c) && this.f89632d == cVar.f89632d && Intrinsics.areEqual(this.f89633e, cVar.f89633e) && Intrinsics.areEqual(this.f89634f, cVar.f89634f) && Intrinsics.areEqual(this.f89635g, cVar.f89635g) && Intrinsics.areEqual(this.f89636h, cVar.f89636h) && Intrinsics.areEqual(this.f89637i, cVar.f89637i) && Intrinsics.areEqual(this.f89638j, cVar.f89638j) && Intrinsics.areEqual(this.f89639k, cVar.f89639k);
    }

    public final d f() {
        return this.f89632d;
    }

    public final e g() {
        return this.f89639k;
    }

    public final Integer h() {
        return this.f89638j;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f89629a.hashCode() * 31) + this.f89630b.hashCode()) * 31) + this.f89631c.hashCode()) * 31) + this.f89632d.hashCode()) * 31) + this.f89633e.hashCode()) * 31) + this.f89634f.hashCode()) * 31) + this.f89635g.hashCode()) * 31) + this.f89636h.hashCode()) * 31) + this.f89637i.hashCode()) * 31;
        Integer num = this.f89638j;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f89639k.hashCode();
    }

    public final String i() {
        return this.f89635g;
    }

    public final String j() {
        return this.f89634f;
    }

    public final String k() {
        return this.f89636h;
    }

    public String toString() {
        return "DeviceInfo(deviceName=" + this.f89629a + ", deviceBrand=" + this.f89630b + ", deviceModel=" + this.f89631c + ", deviceType=" + this.f89632d + ", deviceBuildId=" + this.f89633e + ", osName=" + this.f89634f + ", osMajorVersion=" + this.f89635g + ", osVersion=" + this.f89636h + ", architecture=" + this.f89637i + ", numberOfDisplays=" + this.f89638j + ", localeInfo=" + this.f89639k + ")";
    }
}
