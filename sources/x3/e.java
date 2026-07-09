package x3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f136993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f136994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f136995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f136996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f136997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f136998g;

    public e(String str, Object obj, boolean z11, boolean z12, boolean z13, String str2, boolean z14) {
        this.f136992a = str;
        this.f136993b = obj;
        this.f136994c = z11;
        this.f136995d = z12;
        this.f136996e = z13;
        this.f136997f = str2;
        this.f136998g = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f136992a, eVar.f136992a) && Intrinsics.areEqual(this.f136993b, eVar.f136993b) && this.f136994c == eVar.f136994c && this.f136995d == eVar.f136995d && this.f136996e == eVar.f136996e && Intrinsics.areEqual(this.f136997f, eVar.f136997f) && this.f136998g == eVar.f136998g;
    }

    public int hashCode() {
        int iHashCode = this.f136992a.hashCode() * 31;
        Object obj = this.f136993b;
        int iHashCode2 = (((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Boolean.hashCode(this.f136994c)) * 31) + Boolean.hashCode(this.f136995d)) * 31) + Boolean.hashCode(this.f136996e)) * 31;
        String str = this.f136997f;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f136998g);
    }

    public String toString() {
        return "ParameterInformation(name=" + this.f136992a + ", value=" + this.f136993b + ", fromDefault=" + this.f136994c + ", static=" + this.f136995d + ", compared=" + this.f136996e + ", inlineClass=" + this.f136997f + ", stable=" + this.f136998g + ')';
    }
}
