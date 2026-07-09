package oo;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class n extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f120641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f120642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f120643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f120644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f120645e;

    /* synthetic */ n(Integer num, Integer num2, Integer num3, Date date, String str, m mVar) {
        this.f120641a = num;
        this.f120642b = num2;
        this.f120643c = num3;
        this.f120644d = date;
        this.f120645e = str;
    }

    @Override // oo.d
    public final Integer a() {
        return this.f120642b;
    }

    @Override // oo.d
    public final Integer b() {
        return this.f120643c;
    }

    @Override // oo.d
    public final String d() {
        return this.f120645e;
    }

    @Override // oo.d
    public final Date e() {
        return this.f120644d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f120641a;
            if (num != null ? num.equals(dVar.f()) : dVar.f() == null) {
                Integer num2 = this.f120642b;
                if (num2 != null ? num2.equals(dVar.a()) : dVar.a() == null) {
                    Integer num3 = this.f120643c;
                    if (num3 != null ? num3.equals(dVar.b()) : dVar.b() == null) {
                        Date date = this.f120644d;
                        if (date != null ? date.equals(dVar.e()) : dVar.e() == null) {
                            String str = this.f120645e;
                            if (str != null ? str.equals(dVar.d()) : dVar.d() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // oo.d
    public final Integer f() {
        return this.f120641a;
    }

    public final int hashCode() {
        Integer num = this.f120641a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.f120642b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i11 = iHashCode ^ 1000003;
        Integer num3 = this.f120643c;
        int iHashCode3 = ((((i11 * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.f120644d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.f120645e;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AgeSignalsResult{userStatus=" + this.f120641a + ", ageLower=" + this.f120642b + ", ageUpper=" + this.f120643c + ", mostRecentApprovalDate=" + String.valueOf(this.f120644d) + ", installId=" + this.f120645e + "}";
    }
}
