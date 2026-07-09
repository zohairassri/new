package lb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f113983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f113984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f113985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f113986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f113987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f113988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f113989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Long f113990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f113991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f113992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f113993k;

    public c(String str, String str2, Integer num, Long l11, Integer num2, Long l12, Integer num3, Long l13, String str3, String str4, String str5) {
        this.f113983a = str;
        this.f113984b = str2;
        this.f113985c = num;
        this.f113986d = l11;
        this.f113987e = num2;
        this.f113988f = l12;
        this.f113989g = num3;
        this.f113990h = l13;
        this.f113991i = str3;
        this.f113992j = str4;
        this.f113993k = str5;
    }

    public final String a() {
        return this.f113992j;
    }

    public final Integer b() {
        return this.f113985c;
    }

    public final Long c() {
        return this.f113986d;
    }

    public final Integer d() {
        return this.f113987e;
    }

    public final Long e() {
        return this.f113988f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f113983a, cVar.f113983a) && Intrinsics.areEqual(this.f113984b, cVar.f113984b) && Intrinsics.areEqual(this.f113985c, cVar.f113985c) && Intrinsics.areEqual(this.f113986d, cVar.f113986d) && Intrinsics.areEqual(this.f113987e, cVar.f113987e) && Intrinsics.areEqual(this.f113988f, cVar.f113988f) && Intrinsics.areEqual(this.f113989g, cVar.f113989g) && Intrinsics.areEqual(this.f113990h, cVar.f113990h) && Intrinsics.areEqual(this.f113991i, cVar.f113991i) && Intrinsics.areEqual(this.f113992j, cVar.f113992j) && Intrinsics.areEqual(this.f113993k, cVar.f113993k);
    }

    public final String f() {
        return this.f113983a;
    }

    public final String g() {
        return this.f113984b;
    }

    public final Integer h() {
        return this.f113989g;
    }

    public int hashCode() {
        String str = this.f113983a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113984b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f113985c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.f113986d;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num2 = this.f113987e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.f113988f;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num3 = this.f113989g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l13 = this.f113990h;
        int iHashCode8 = (iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.f113991i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f113992j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f113993k;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Long i() {
        return this.f113990h;
    }

    public final String j() {
        return this.f113991i;
    }

    public final String k() {
        return this.f113993k;
    }

    public String toString() {
        return "AppExitInfoData(sessionId=" + this.f113983a + ", sessionIdError=" + this.f113984b + ", importance=" + this.f113985c + ", pss=" + this.f113986d + ", reason=" + this.f113987e + ", rss=" + this.f113988f + ", status=" + this.f113989g + ", timestamp=" + this.f113990h + ", trace=" + this.f113991i + ", description=" + this.f113992j + ", traceStatus=" + this.f113993k + ')';
    }
}
